package app.view;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;

import app.model.Pertenencia;

public class BelongingItem extends JPanel {
	Pertenencia belong;
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	public BelongingItem() {
		
		initialize();
	}
	private void initialize() {
		setLayout(new MigLayout("", "[]", "[]"));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(belong.getImagen()));
		add(lblNewLabel, "cell 0 0");
	}

}
