import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/**
 * 
 */

/**
 * @author Pedro Rodriguez de Oliveira
 * Este es el prototipo de ventana a crear para interfaz. Se usa Swing como prueba.
 */
public class InterfazPrototipo {
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame ventanaBasica = new JFrame("Sarasvati");
				ventanaBasica.setSize(600,350);
				ventanaBasica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ventanaBasica.setVisible(true);	
			}
		});
		
	}

}
