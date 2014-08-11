	/**
	 * @author Pedro Rodriguez de Oliveira
	 * Este es el prototipo de ventana a crear para interfaz. Se usa Swing como prueba.
	 */

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Interfaz {
		
		public Interfaz(){
			MainWindow();
		}
		
		public void MainWindow(){
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					JFrame ventanaBasica = new JFrame("Biblioteca Alejandrina");
					ventanaBasica.setSize(600,350);
					ventanaBasica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ventanaBasica.setVisible(true);	
			}
		});
			
	}

}


