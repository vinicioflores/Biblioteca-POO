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
	private JLabel lblGetAuthor;
	private JLabel lblEditorial;
	private JLabel lblGetEditorial;
	private JLabel lblPicture;
	private JLabel lblEdition;
	private JLabel lblGetEdition;
	private JButton btnLendReturn;
	private JLabel lblBorrowerInfo;
	private JButton btnEdit;
	private JButton btnDelete;

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
		btnLendReturn = new JButton(action);
		add(btnLendReturn, "flowy,cell 8 0");
		
		lblPicture = new JLabel("");
		lblPicture.setIcon(new ImageIcon(".\\src\\image\\star"+book.getCalificacion() +".png"));
		add(lblPicture, "cell 2 1 2 1,alignx left");
		
		lblAuthor = new JLabel("Author:");
		add(lblAuthor, "cell 2 2");
		
		lblGetAuthor = new JLabel(book.getAutor());
		add(lblGetAuthor, "cell 3 2");
		
		lblEditorial = new JLabel("Editorial:");
		add(lblEditorial, "cell 2 3");
		
		lblGetEditorial = new JLabel(book.getEditorial());
		add(lblGetEditorial, "cell 3 3");
		
		lblEdition = new JLabel("Edition:");
		add(lblEdition, "cell 2 4");
		
		lblGetEdition = new JLabel(book.getEdicion());
		add(lblGetEdition, "cell 3 4");
		
		if (book.getPrestatario() != null){
			lblBorrowerInfo = new JLabel("Borrower:");
			add(lblBorrowerInfo, "cell 2 6");
		}
		
		btnEdit = new JButton("Edit");
		add(btnEdit, "cell 8 0");
		
		btnDelete = new JButton("Delete");
		add(btnDelete, "cell 8 0");
	}

}
