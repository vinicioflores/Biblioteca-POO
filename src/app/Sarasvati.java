package app;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import app.model.Model;
import app.model.Persona;
import app.view.View;

/**Responsable of creating the main function
 * 
 * 
 * /
public class Sarasvati {
	public static void main(String[] args) {
		Model model = new Model();
		View view = new View(model);
		
		CreateGUI(view);
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
                System.exit(0);
        }
}
}
