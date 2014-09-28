package app;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import app.model.Biblioteca;
import app.model.Colega;
import app.model.Estudiante;
import app.model.Familiar;
import app.model.Libro;
import app.model.Model;
import app.model.Pelicula;
import app.model.Persona;
import app.model.RegistroPrestatarios;
import app.model.Revista;
import app.model.XML;
import app.view.View;

public class Sarasvati {
	static Model model = new Model();
	static View view = new View(model);
	static XML save = new XML();
	static Biblioteca libraryBelongings = new Biblioteca();
	static RegistroPrestatarios borrowersRegistry = new RegistroPrestatarios();
	
	public static void main(String[] args) {		
		CreateGUI(view);

		//Create XStream object
	    XStream xstream1 = new XStream(new DomDriver());
	    XStream xstream2 = new XStream(new DomDriver());
	    
	    //Create file to load
	    File fileToLoadLibrary = new File(model.getPathLibrary());
	    File fileToLoadRegistry = new File(model.getPathRegistry());
	    
	    //Create alias for each class. Must be almost the same name from class
	    xstream1.alias("RegistroPrestatarios", RegistroPrestatarios.class);
	    xstream1.alias("Familiar", Familiar.class);
	    xstream1.alias("Colega", Colega.class);
	    xstream1.alias("Estudiante", Estudiante.class);
	    
	    xstream2.alias("Biblioteca", Biblioteca.class);
	    xstream2.alias("Libro", Libro.class);
	    xstream2.alias("Revista", Revista.class);
	    xstream2.alias("Pelicula", Pelicula.class);
	    
	    borrowersRegistry = (RegistroPrestatarios)xstream1.fromXML(fileToLoadRegistry);
	    libraryBelongings = (Biblioteca)xstream2.fromXML(fileToLoadLibrary);
	    
	    model.setBiblioteca(libraryBelongings);
	    model.setPrestatarios(borrowersRegistry);
	    
		view.getController().updateOnStart();
	}
	
	private static void CreateGUI(JFrame frame){
		frame.addWindowListener(new WindowCloseManager());
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("Sarasvati");
	}
	
	private static class WindowCloseManager extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent evt) {
        	libraryBelongings = model.getBiblioteca();
        	borrowersRegistry = model.getPrestatarios();
        	save.saveBorrowerRegistryXML(model.getPathRegistry(), borrowersRegistry);
        	save.saveLibraryXML(model.getPathLibrary(), libraryBelongings);
        	System.exit(0);
        }
}
}
