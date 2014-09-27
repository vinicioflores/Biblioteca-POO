package app.view;

import javax.swing.JPanel;

import app.model.Pelicula;
import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import javax.swing.SpinnerNumberModel;

public class MovieEdit extends JPanel{
	
	private Pelicula movie;
	private JTextField nameTextField;
	private JTextField genreTextField;
	private JTextField directorTextField;
	private JTextField rdTextField;
	
	public MovieEdit(){
		setLayout(new MigLayout("", "[][][335.00,grow][]", "[][][][][][][][][][][]"));
		
		JButton btnBack = new JButton("Back");
		add(btnBack, "flowx,cell 0 0");
		
		JLabel lblMovieEditing = new JLabel("Movie Editing");
		add(lblMovieEditing, "cell 0 0");
		
		JLabel lblName = new JLabel("Name:");
		add(lblName, "cell 1 1,alignx trailing");
		
		nameTextField = new JTextField(movie.getNombre());
		add(nameTextField, "cell 2 1,growx");
		nameTextField.setColumns(10);
		
		JLabel lblGenre = new JLabel("Genre:");
		add(lblGenre, "cell 1 2,alignx trailing");
		
		genreTextField = new JTextField(movie.getGenero());
		add(genreTextField, "cell 2 2,growx");
		genreTextField.setColumns(10);
		
		JLabel lblDirector = new JLabel("Director:");
		add(lblDirector, "cell 1 3,alignx trailing");
		
		directorTextField = new JTextField(movie.getDirector());
		add(directorTextField, "cell 2 3,growx");
		directorTextField.setColumns(10);
		
		JLabel lblRD = new JLabel("Release date:");
		add(lblRD, "cell 1 4,alignx trailing");
		
		rdTextField = new JTextField(movie.getAnhoPublicacion());
		add(rdTextField, "cell 2 4,growx");
		rdTextField.setColumns(10);
		
		JLabel lblRating = new JLabel("Rating:");
		add(lblRating, "cell 1 5,alignx right");
		
		JSpinner MovieRatingSpinner = new JSpinner();
		MovieRatingSpinner.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		add(MovieRatingSpinner, "cell 2 5");
		
		JLabel lblImage = new JLabel("Image:");
		add(lblImage, "cell 1 6,alignx right");
				
		JButton btnSearchImage = new JButton("Search Image");
		add(btnSearchImage, "cell 3 6,aligny bottom");
		
		JLabel lblPicture = new JLabel();
		lblPicture.setIcon(new ImageIcon(MovieEdit.class.getResource("/image/"+movie.getNombre()+".png")));
		add(lblPicture, "cell 2 7");
		
		JButton btnRegister = new JButton("Register");
		add(btnRegister, "cell 2 9,alignx center");
	}
}