package app.view;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import app.model.Pelicula;

public class MovieItem extends JPanel {
	private JButton btnNewButton;
	
	/**
	 * @wbp.nonvisual location=19,49
	 */
	private final ImageIcon imageIcon = new ImageIcon();

	/**
	 * Create the panel.
	 */
	public MovieItem(Pelicula movie) {

		initialize();
	}
	private void initialize() {
		setLayout(new MigLayout("", "[][][][][][][][][][][][][][][][][][][][]", "[][][][][]"));
		
		btnNewButton = new JButton("New button");
		add(btnNewButton, "cell 19 4");
	}

}
