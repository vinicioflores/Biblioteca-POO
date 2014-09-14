package app.view;

import javax.swing.JPanel;

import app.model.Libro;
import net.miginfocom.swing.MigLayout;

public class BookDetail extends JPanel {
	
	private Libro book;
	/**
	 * Create the panel.
	 */
	public BookDetail(Libro book) {
		this.book = book;
		setLayout(new MigLayout("", "[]", "[]"));

	}

}
