package app.view;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import app.model.Libro;

public class BookItem extends JPanel {
	
	Libro book;
	private JLabel lblImage;
	private JLabel lblName;
	private JLabel lblAuthor;
	private JLabel lblAnthonyBurgess;
	private JLabel lblEditorial;
	private JLabel lblPenguin;
	private JLabel label;
	private JLabel lblEdition;
	private JLabel lblrd;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JButton btnEdit;

	/**
	 * Create the panel.
	 */
	public BookItem(Libro book) {
		this.book = book;
		initialize();
	}
	private void initialize() {
		setLayout(new MigLayout("", "[][][][][][][][][]", "[][][][][][][][][][]"));
		
		lblImage = new JLabel("");
		
		ImageIcon img = new ImageIcon(book.getImagen()); //Imagen nueva
        img = new ImageIcon(img.getImage().getScaledInstance(140, 145, Image.SCALE_DEFAULT)); //resize imagen
		
		lblImage.setIcon(img);
		add(lblImage, "flowy,cell 0 0 1 9");
		
		lblName = new JLabel(book.getNombre());
		lblName.setFont(new Font("Consolas", Font.PLAIN, 28));
		add(lblName, "cell 1 0 3 1");
		String action;
		if(book.isPrestado()){
			action = "Return";
		}else{
			action = "Lend";
		}
		btnNewButton = new JButton(action);
		add(btnNewButton, "flowy,cell 8 0");
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(".\\src\\image\\star"+book.getCalificacion() +".png"));
		add(label, "cell 2 1 2 1,alignx left");
		
		lblAuthor = new JLabel("Author:");
		add(lblAuthor, "cell 2 2");
		
		lblAnthonyBurgess = new JLabel(book.getAutor());
		add(lblAnthonyBurgess, "cell 3 2");
		
		lblEditorial = new JLabel("Editorial:");
		add(lblEditorial, "cell 2 3");
		
		lblPenguin = new JLabel(book.getEditorial());
		add(lblPenguin, "cell 3 3");
		
		lblEdition = new JLabel("Edition:");
		add(lblEdition, "cell 2 4");
		
		lblrd = new JLabel(book.getEdicion());
		add(lblrd, "cell 3 4");
		
		if (book.getPrestatario() == null){
			lblNewLabel = new JLabel("Borrower:");
			add(lblNewLabel, "cell 2 6");
		}
		
		btnEdit = new JButton("Edit");
		add(btnEdit, "cell 8 0");
	}

}
