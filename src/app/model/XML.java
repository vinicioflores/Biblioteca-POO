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
	
	public static void main(String[] args) throws FileNotFoundException, ParserConfigurationException{
		Biblioteca miBiblioteca = new Biblioteca();
		RegistroPrestatarios misPrestatarios = new RegistroPrestatarios();
		
		Libro libro1 = new Libro("Mi amigo Johnny", null, 5, "Tablón", "CN", "1ra");
		Libro libro2 = new Libro("La naranja mecánica", null, 5, "Anthony Burguess", "Alfaguara", "1ra");
		Revista revista1 = new Revista("El hombre en la tierra", null, 5, "Cuentos", "1990");
		Revista revista2 = new Revista("American Scientific", null, 5, "Penguin", "2013");
		Pelicula pelicula1 = new Pelicula("FullMetal Jacket", null, 5, "Bélico", "Stanley Kubrick", "1990");
		Pelicula pelicula2 = new Pelicula("Pulp Fiction", null, 5, "Humor", "Quentin Tarantino", "1994");
		
		Familiar familiar1 = new Familiar("Oscar", "Rodríguez", "Serrano", null, null, "Padre");
		Familiar familiar2 = new Familiar("Jaqueline", "de Oliveira", null, null, null, "Madre");
		Colega colega1 = new Colega("Faubricio", "Forester", "Soto", null, null, "Programador");
		Colega colega2 = new Colega("Roberto", "Chen", "Zheng", null, null, "Programador");
		Estudiante estudiante1 = new Estudiante("Dayana", "Méndez", "Salas", null, null, "2013086583");
		Estudiante estudiante2 = new Estudiante("Pedro", "Rodríguez", "de Oliveira", null, null, "2013086585");
		
		miBiblioteca.agregarNuevaPertenencia(libro1);
		miBiblioteca.agregarNuevaPertenencia(libro2);
		miBiblioteca.agregarNuevaPertenencia(revista1);
		miBiblioteca.agregarNuevaPertenencia(revista2);
		miBiblioteca.agregarNuevaPertenencia(pelicula1);
		miBiblioteca.agregarNuevaPertenencia(pelicula2);
		
		misPrestatarios.agregarPrestatario(familiar1);
		misPrestatarios.agregarPrestatario(familiar2);
		misPrestatarios.agregarPrestatario(colega1);
		misPrestatarios.agregarPrestatario(colega2);
		misPrestatarios.agregarPrestatario(estudiante1);
		misPrestatarios.agregarPrestatario(estudiante2);
		
		String pathLibrary = "src/xml/library.xml";
		String pathRegistry = "src/xml/borrowerRegistry.xml";
		
		saveLibraryXML(pathLibrary, miBiblioteca);
		saveBorrowerRegistryXML(pathRegistry, misPrestatarios);
		System.out.println();

		Biblioteca received1 = new Biblioteca();
		RegistroPrestatarios received2 = new RegistroPrestatarios();
		
		loadBorrowerRegistryXML(pathRegistry, received2);
		loadLibraryXML(pathLibrary, received1);
		
		
		}
}