package app.view;

import java.awt.Dimension;

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
	public BelongingItem(Pertenencia belonging) {
		
		setPreferredSize(new Dimension(130,120));		
		setBelong(belonging);
		initialize();
	}
	private void initialize() {
		setLayout(new MigLayout("", "[]", "[]"));
		
		lblNewLabel = new JLabel(belong.getNombre());
		add(lblNewLabel, "cell 0 0");
	}
	public void update()
	{
		lblNewLabel.setText(belong.getNombre());
		lblNewLabel.revalidate();
		lblNewLabel.repaint();
	}
	public Pertenencia getBelong() {
		return belong;
	}
	public void setBelong(Pertenencia belong) {
		this.belong = belong;
	}
	

}
