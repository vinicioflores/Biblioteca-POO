package app.view;

import javax.swing.JPanel; 

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import app.model.Pelicula;

public class MovieItem extends JPanel {
	
	Pelicula movie;
	private JLabel lblImage;
	private JLabel lblName;
	private JLabel lblDirector;
	private JLabel lblGetDirector;
	private JLabel lblGenre;
	private JLabel lblGetGenre;
	private JLabel lblPicture;
	private JLabel lblYear;
	private JLabel lblGetYear;
	private JButton btnLendReturn;
	private JLabel lblBorrowerInfo;
	private JButton btnEdit;
	private JButton btnDelete;

	/**
	 * Create the panel.
	 */
	public MovieItem(Pelicula movie) {
		this.movie = movie;
		initialize();
	}
	private void initialize() {
		setLayout(new MigLayout("", "[][][][][][][][][]", "[][][][][][][][][][]"));
		
		lblImage = new JLabel("");
		
		ImageIcon img = new ImageIcon(movie.getImagen()); //Imagen nueva
        img = new ImageIcon(img.getImage().getScaledInstance(140, 145, Image.SCALE_DEFAULT)); //resize imagen
		
		lblImage.setIcon(img);
		add(lblImage, "flowy,cell 0 0 1 9");
		
		lblName = new JLabel(movie.getNombre());
		lblName.setFont(new Font("Consolas", Font.PLAIN, 28));
		add(lblName, "cell 1 0 3 1");
		String action;
		if(movie.isPrestado()){
			action = "Return";
		}else{
			action = "Lend";
		}
		btnLendReturn = new JButton(action);
		add(btnLendReturn, "flowy,cell 8 0");
		
		lblPicture = new JLabel("");
		lblPicture.setIcon(new ImageIcon(".\\src\\image\\star"+movie.getCalificacion() +".png"));
		add(lblPicture, "cell 2 1 2 1,alignx left");
		
		lblDirector = new JLabel("Director:");
		add(lblDirector, "cell 2 2");
		
		lblGetDirector = new JLabel(movie.getDirector());
		add(lblGetDirector, "cell 3 2");
		
		lblGenre = new JLabel("Genre:");
		add(lblGenre, "cell 2 3");
		
		lblGetGenre = new JLabel(movie.getGenero());
		add(lblGetGenre, "cell 3 3");
		
		lblYear = new JLabel("Year:");
		add(lblYear, "cell 2 4");
		
		lblGetYear = new JLabel(movie.getAnhoPublicacion());
		add(lblGetYear, "cell 3 4");
		
		if (movie.getPrestatario() != null){
			lblBorrowerInfo = new JLabel("Borrower:");
			add(lblBorrowerInfo, "cell 2 6");
		}
		
		btnEdit = new JButton("Edit");
		add(btnEdit, "cell 8 0");
		
		btnDelete = new JButton("Delete");
		add(btnDelete, "cell 8 0");
	}


}
