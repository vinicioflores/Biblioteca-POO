package app.view;

import javax.swing.JPanel;

import app.model.Libro;
import net.miginfocom.swing.MigLayout;

public class BookEdit extends JPanel{
	
	private Libro book;
	
	public BookEdit(Libro book){
		this.book = book;
		setLayout(new MigLayout("","[]","[]"));
	}
	
	
}
