package app.model;

import java.io.*;  
import javax.xml.parsers.*;

import com.thoughtworks.xstream.*;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * 
 * Class XML: Creates XML files and loads all content from it
 * Note: Create global variables with these, to save xml files.
 * String pathLibrary = "src/xml/library.xml";
 * String pathRegistry = "src/xml/borrowerRegistry.xml";
 * 
 */

public class XML {
	//Write a file
	public static void fileWriting(File whereToSave, String toWrite){
		//File loading
		FileWriter fw = null;
		PrintWriter pw = null;
		try
		{
			fw = new FileWriter(whereToSave); //whereToSave is a file with a Path
		    pw = new PrintWriter(fw);
		    pw.println(toWrite);
		 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
		    //Check if file is closed
				if (null != fw)
					fw.close();
				} catch (Exception e2) {
					e2.printStackTrace();
		        }
		}
	}
	
	//Save the actual library on XML
	public static void saveLibraryXML(String path, Biblioteca library){
		//Create XStream object
		XStream xstream = new XStream(new DomDriver());
		
		//Create alias for each class. Must be almost the same name from class
		xstream.alias("Biblioteca", Biblioteca.class);
		xstream.alias("Libro", Libro.class);
		xstream.alias("Revista", Revista.class);
		xstream.alias("Pelicula", Pelicula.class);
		
		//String to write on file and file to save
		String xml = new String();
		File fileToSave = new File(path);
		xml = xstream.toXML(library);
		
		fileWriting(fileToSave, xml);
		System.out.println(xml);
		System.out.println();
	}

	//Save the borrowers registry on XML
	public static void saveBorrowerRegistryXML(String path, RegistroPrestatarios registry){
		//Create XStream object
		XStream xstream = new XStream(new DomDriver());
		
		//Create alias for each class. Must be almost the same name from class
		xstream.alias("RegistroPrestatarios", RegistroPrestatarios.class);
		xstream.alias("Familiar", Familiar.class);
		xstream.alias("Colega", Colega.class);
		xstream.alias("Estudiante", Estudiante.class);
		
		//String to write on file and file to save
		String xml = new String();
		File fileToSave = new File(path);
		xml = xstream.toXML(registry);
		
		fileWriting(fileToSave, xml);
		System.out.println(xml);
		System.out.println();
	}
	//Load XML with library
	public static void loadLibraryXML(String path, Biblioteca registry){
		//Create XStream object
		XStream xstream = new XStream(new DomDriver());
		
		//Create file to load
		File fileToLoad = new File(path);
		
		//Create alias for each class. Must be almost the same name from class
		xstream.alias("Biblioteca", Biblioteca.class);
		xstream.alias("Libro", Libro.class);
		xstream.alias("Revista", Revista.class);
		xstream.alias("Pelicula", Pelicula.class);
		
		//Loads registry on Biblioteca object 
		registry = (Biblioteca)xstream.fromXML(fileToLoad);
		
		//Erase slashes to test if everything runs ok
		//for (int i = 0; i < registry.getPertenencias().size(); i++){
		//	System.out.println(registry.getPertenencias().get(i).toString());
		//	System.out.println();
		//}
		
	}
	
	//Load XML with borrowers registry
	public static void loadBorrowerRegistryXML(String path, RegistroPrestatarios registry){
		//Create XStream object
		XStream xstream = new XStream(new DomDriver());
		
		//Create file to load
		File fileToLoad = new File(path);
		
		//Create alias for each class. Must be almost the same name from class
		xstream.alias("RegistroPrestatarios", RegistroPrestatarios.class);
		xstream.alias("Familiar", Familiar.class);
		xstream.alias("Colega", Colega.class);
		xstream.alias("Estudiante", Estudiante.class);
		
		//Loads registry on RegistroPrestatarios object 
		registry = (RegistroPrestatarios)xstream.fromXML(fileToLoad);
		
		//Erase slashes to test if everything runs ok
		//for (int i = 0; i < registry.getPrestatarios().size(); i++){
		//	System.out.println(registry.getPrestatarios().get(i).toString());
		//	System.out.println();
		//}
		
	}
}