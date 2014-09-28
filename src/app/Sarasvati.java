package app;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import app.model.Model;
import app.model.Persona;
import app.view.View;

public class Sarasvati {
	public static void main(String[] args) {
		Model model = new Model();
		View view = new View(model);
		
		CreateGUI(view);
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
        	//save xml???
                System.exit(0);
        }
}
}
