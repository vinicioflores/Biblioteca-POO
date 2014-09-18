package app.view;

import javax.swing.JPanel; 

import app.model.Libro;
import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import javax.swing.SpinnerNumberModel;

public class BookEdit extends JPanel{
	
	private Libro book;
	private JTextField nameTextField;
	private JTextField authorTextField;
	private JTextField publisherTextField;
	private JTextField editionTextField;
	
	public BookEdit(){
		setLayout(new MigLayout("", "[][][359.00][]", "[][][][][][][][][][]"));
		
		JButton btnBack = new JButton("Back");
		add(btnBack, "flowx,cell 0 0");
		
		JLabel lblBookEditing = new JLabel("Book Editing");
		add(lblBookEditing, "cell 0 0");
		
		JLabel lblName = new JLabel("Name:");
		add(lblName, "cell 1 1,alignx trailing");
		
		nameTextField = new JTextField(book.getNombre());
		add(nameTextField, "cell 2 1,growx");
		nameTextField.setColumns(10);
		
		JLabel lblAuthor = new JLabel("Author:");
		add(lblAuthor, "cell 1 2,alignx trailing");
		
		authorTextField = new JTextField(book.getAutor());
		add(authorTextField, "cell 2 2,growx");
		authorTextField.setColumns(10);
		
		JLabel lblEditorial = new JLabel("Editorial:");
		add(lblEditorial, "cell 1 3,alignx trailing");
		
		publisherTextField = new JTextField(book.getEditorial());
		add(publisherTextField, "cell 2 3,growx");
		publisherTextField.setColumns(10);
		
		JLabel lblEdition = new JLabel("Edition:");
		add(lblEdition, "cell 1 4,alignx trailing");
		
		editionTextField = new JTextField(book.getEdicion());
		add(editionTextField, "cell 2 4,growx");
		editionTextField.setColumns(10);
		
		JLabel lblRating = new JLabel("Rating:");
		add(lblRating, "cell 1 5,alignx right");
		
		JSpinner bookRatingSpinner = new JSpinner();
		bookRatingSpinner.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		add(bookRatingSpinner, "cell 2 5");
		
		JLabel lblImage = new JLabel("Image:");
		add(lblImage, "cell 1 6,alignx right");
		
		JLabel lblPicture = new JLabel("");
		lblPicture.setIcon(new ImageIcon(BookEdit.class.getResource("/image/"+book.getNombre()+".png")));
		add(lblPicture, "cell 2 6");
		
		JButton btnSearchImage = new JButton("Search Image");
		add(btnSearchImage, "cell 3 6,aligny bottom");
		
		JButton btnRegister = new JButton("Register");
		add(btnRegister, "cell 2 9");
	}
}
