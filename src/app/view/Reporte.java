package app.view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTable;

/**Is the responsable for creating the report of all
 * the belongings borrowed in the system
 * /

public class Reporte extends JPanel {

	/**
	 * Create the panel.
	 */
	public Reporte() {
		setLayout(new MigLayout("", "[grow]", "[][grow][][][][][][][][]"));
		
		JLabel lblReporte = new JLabel("Reporte de libros prestados");
		add(lblReporte, "cell 0 0");
		
		JTextArea textArea = new JTextArea();
		add(textArea, "cell 0 1 1 8,grow");
		
		JButton btnAceptar = new JButton("Cerrar");
		add(btnAceptar, "flowx,cell 0 9");

	}

}
