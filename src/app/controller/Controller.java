package app.controller;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import app.model.*;
import app.view.*;

public class Controller implements ActionListener{
	
	private Model model;
	private View view;
	static String archivo = null;
	
	public Controller(Model model, View view) {
		super();
		this.model = model;
		this.view = view;
	}
	
	public void actionPerformed(ActionEvent evt){
		Object source = evt.getSource();
		
        //Start panel :: Search botton
		if(source == view.getSearchBtn()){
			
			view.getSearchPnl().setVisible(true);
			view.getStartPnl().setVisible(false);
		}
		
		///search panel :: back botton
		else if(source == view.getSearchBackBtn()){
			
			view.getStartPnl().setVisible(true);
			view.getSearchPnl().setVisible(false);
		}
		
		///seach :: book search
		else if(source == view.getBookCSearchBtn()){
			
			String parameter = getSelectedRadioButtonInGroupText(view.getBookBottonGroup());
			
			if( parameter.equals("All")){
				
				updateAllXwithBooks();
				
			}
			else if(parameter.equals("Borrowed")){
				
				updateBorrowedXwithBooks();
				
			}
			else if(parameter.equals("Available")){
				
				updateAvailableXwithBooks();			
				
			}
			else if(parameter.equals("Top")){
				
				updateTopXwithBooks();
			}
			else if(parameter.equals("Special search")){
				
				updateSpecialSwithBooks();
			}
			
		}///search :: movie 
		////////////Back buttons :: Book searches
		else if(source == view.getAllXSearchBackBtn()){
	
			view.getSearchPnl().setVisible(true);
			view.getAllXSearch().setVisible(false);
			
		}
		else if(source == view.getBorrowedXBackBtn()){
			
			view.getSearchPnl().setVisible(true);
			view.getBorrowedXPnl().setVisible(false);
			
		}
		else if(source == view.getTopXBackBtn()){
			view.getSearchPnl().setVisible(true);
			view.getTopXPnl().setVisible(false);
			
		}
		else if(source == view.getAvailableXBackBtn()){
			view.getSearchPnl().setVisible(true);
			view.getAvailableXPnl().setVisible(false);
			
		}
		else if(source == view.getSpecialSXBackBtn()){
			view.getSearchPnl().setVisible(true);
			view.getSpecialSXPnl().setVisible(false);
			
		}
		////////////////////////////////////////////////
		
		else if(source == view.getMovieCSearchBtn()){
			String parameter = getSelectedRadioButtonInGroupText(view.getMovieBottonGroup());
			
			if( parameter.equals("All")){
				
				updateAllXwithMovies();
				
			}
			else if(parameter.equals("Borrowed")){
				
				updateBorrowedXwithMovies();
				
			}
			else if(parameter.equals("Available")){
				
				updateAvailableXwithMovies();
				
			}
			else if(parameter.equals("Top")){
				
				updateTopXwithMovies();
				
			}
			else if(parameter.equals("Special search")){
				
				updateSpecialSwithMovies();
			}
			
		}
		
			////////////Back buttons :: Movies searches
			else if(source == view.getAllXSearchBackBtn()){
				view.getSearchPnl().setVisible(true);
				view.getAllXSearch().setVisible(false);
		
			}
			else if(source == view.getBorrowedXBackBtn()){
				view.getSearchPnl().setVisible(true);
				view.getBorrowedXPnl().setVisible(false);
		
			}
			else if(source == view.getTopXBackBtn()){
				view.getSearchPnl().setVisible(true);
				view.getTopXPnl().setVisible(false);
		
			}
			else if(source == view.getAvailableXBackBtn()){
				view.getSearchPnl().setVisible(true);
				view.getAvailableXPnl().setVisible(false);
		
			}
			else if(source == view.getSpecialSXBackBtn()){
				view.getSearchPnl().setVisible(true);
				view.getSpecialSXPnl().setVisible(false);
		
			}
	////////////////////////////////////////////////
		else if(source == view.getMagazineCSearchBtn()){
			String parameter = getSelectedRadioButtonInGroupText(view.getMagazineBottonGroup());
			
			if( parameter.equals("All")){
				
				updateAllXwithMagazines();
				
			}
			else if(parameter.equals("Borrowed")){
				
				updateBorrowedXwithMagazines();
				
			}
			else if(parameter.equals("Available")){
				
				updateAvailableXwithMagazines();
				
			}
			else if(parameter.equals("Top")){
				
				updateTopXwithMagazines();
			}
			else if(parameter.equals("Special search")){
				
				updateSpecialSwithMagazines();
				
			}

		}
		
////////////Back buttons :: Magzines searches
		else if(source == view.getAllXSearchBackBtn()){
			view.getSearchPnl().setVisible(true);
			view.getAllXSearch().setVisible(false);
	
		}
		else if(source == view.getBorrowedXBackBtn()){
			view.getSearchPnl().setVisible(true);
			view.getBorrowedXPnl().setVisible(false);
	
		}
		else if(source == view.getTopXBackBtn()){
			view.getSearchPnl().setVisible(true);
			view.getTopXPnl().setVisible(false);
	
		}
		else if(source == view.getAvailableXBackBtn()){
			view.getSearchPnl().setVisible(true);
			view.getAvailableXPnl().setVisible(false);
	
		}
		else if(source == view.getSpecialSXBackBtn()){
			view.getSearchPnl().setVisible(true);
			view.getSpecialSXPnl().setVisible(false);
	
		}
////////////////////////////////////////////////
		
		//start panel :: new belonging botton
		else if (source == view.getNewBelongingBtn()){
			view.getBelongingRegistrationPnl().setVisible(true);
			view.getStartPnl().setVisible(false);
		}
		///belonging registration panel :: back botton
		else if(source == view.getBelongingRegistrationBackBtn()){
			view.getStartPnl().setVisible(true);
			view.getBelongingRegistrationPnl().setVisible(false);
							
		}		
		/// new book registration
		else if(source == view.getNewBookBtn()){
			view.getBookRegistrationPnl().setVisible(true);
			view.getBelongingRegistrationPnl().setVisible(false);
		}
		//// get back from book registration
		else if(source == view.getBookRegistrationBackBtn()){
			
			view.getBelongingRegistrationPnl().setVisible(true);
			view.getBookRegistrationPnl().setVisible(false);
		}
		//// register a new book
		else if(source == view.getBookRegistrationBtn()){
			
			registerNewBook();
		}
		
		/// new magazine registration
		else if(source == view.getNewMagazineBtn()){
			view.getMagazineRegistrationPnl().setVisible(true);
			view.getBelongingRegistrationPnl().setVisible(false);
					
		}
		//// get back from magazine registration
		else if(source == view.getMagazineRegistrationBackBtn()){
			view.getBelongingRegistrationPnl().setVisible(true);
			view.getMagazineRegistrationPnl().setVisible(false);

		}
		///
		else if (source == view.getMagazineSearchImageBn()) {
			JFileChooser chooser = new JFileChooser(); //Creamos objeto de JFileChooser
			int opcion = chooser.showOpenDialog(view);//Abrir ventana de dialogo para escoger imagen
			if (opcion == JFileChooser.APPROVE_OPTION) { //Si hacemos click en Abrir o Aceptar
            	archivo= chooser.getSelectedFile().getPath(); //Obtener nombre del archivo
                ImageIcon imagen = new ImageIcon(archivo); //Imagen nueva
                imagen = new ImageIcon(imagen.getImage().getScaledInstance(256, 256, Image.SCALE_DEFAULT)); //resize imagen
                //BookImageLbl.setIcon(imagen);//Antes 
                view.getMagazineImagelbl().setIcon(imagen);
                //BookRegistrationPnl.add(BookImageLbl, "cell 2 6");
                view.getMagazineRegistrationPnl().add(view.getMagazineImagelbl(), "cell 2 5");
			}
		}
		////
		else if(source == view.getMagazineRegistrationBtn()){
			registerNewMagazine();
			
		}
		///
		else if(source == view.getNewMovieBtn()){
			view.getMovieRegistrationPnl().setVisible(true);
			view.getBelongingRegistrationPnl().setVisible(false);
							
		}
		////
		else if(source == view.getMovieRegistrationBackBtn()){
			view.getBelongingRegistrationPnl().setVisible(true);
			view.getMovieRegistrationPnl().setVisible(false);

			
		}
		///
		else if (source == view.getMovieSearchImageBn()) {
			JFileChooser chooser = new JFileChooser(); //Creamos objeto de JFileChooser
			int opcion = chooser.showOpenDialog(view);//Abrir ventana de dialogo para escoger imagen
			if (opcion == JFileChooser.APPROVE_OPTION) { //Si hacemos click en Abrir o Aceptar
            	archivo= chooser.getSelectedFile().getPath(); //Obtener nombre del archivo
                ImageIcon imagen = new ImageIcon(archivo); //Imagen nueva
                imagen = new ImageIcon(imagen.getImage().getScaledInstance(256, 256, Image.SCALE_DEFAULT)); //resize imagen
                //BookImageLbl.setIcon(imagen);//Antes 
                view.getMovieImagelbl().setIcon(imagen);
                //BookRegistrationPnl.add(BookImageLbl, "cell 2 6");
                view.getMovieRegistrationPnl().add(view.getMovieImagelbl(), "cell 2 7");
			}
		}
		////
		else if(source == view.getMovieRegistrationBtn()){
			registerNewMovie();
			
		}
		
		//
		else if (source == view.getNewBorrowerBtn()) {
        	
        	view.getBorrowerRegistrationPnl().setVisible(true);
        	view.getStartPnl().setVisible(false);      	
        
        }
        ///
        if (source == view.getBorrowerRegistrationBackBtn()) {
        	
        	view.getStartPnl().setVisible(true); 
        	view.getBorrowerRegistrationPnl().setVisible(false);
        	     	
        }
        ///
        else if (source == view.getNewCoworkerBtn()) {
        	
        	view.getCoworkerRegistrationPnl().setVisible(true);
        	view.getBorrowerRegistrationPnl().setVisible(false);
       ////
        }
        else if (source == view.getCoworkerRegistrationBackBtn()) {
        	
        	view.getBorrowerRegistrationPnl().setVisible(true);
        	view.getCoworkerRegistrationPnl().setVisible(false);
       
        }
        ////
        else if (source == view.getCoworkerRegistrationBtn()) {
        	
        	registerCoworker();
       
        }/// go to student registration
        else if (source == view.getNewStudentBtn()) {
        	
        	view.getStudentRegistrationPnl().setVisible(true);
        	view.getBorrowerRegistrationPnl().setVisible(false);
        	
        	
        }//// go back from student registration
        else if (source == view.getStudentRegistrationBackBtn()) {
        	
        	view.getBorrowerRegistrationPnl().setVisible(true);
        	view.getStudentRegistrationPnl().setVisible(false);
       
        }//// register a new student
        else if (source == view.getStudentRegistrationBtn()) {
        	
        	registerStudent();
       
        }/// go to relative registration
        else if (source == view.getNewRelativeBtn()) {
        	
        	view.getRelativeRegistrationPnl().setVisible(true);
        	view.getBorrowerRegistrationPnl().setVisible(false);
        }
        //// go back from relative registration
        else if (source == view.getRelativeRegistrationBackBtn()) {
        	
        	view.getBorrowerRegistrationPnl().setVisible(true);
        	view.getRelativeRegistrationPnl().setVisible(false);
       
        }//// register a relative
        else if (source == view.getRelativeRegistrationBtn()) {
        	
        	registerRelative();
       
        }
        //go to Credits btn
        else if(source == view.getCreditsBtn()){
        	
        	view.getCreditsPnl().setVisible(true);
        	view.getStartPnl().setVisible(false);
        	
        }
        /// credits back buttom
        else if(source == view.getCreditsBackBtn()){
        	
        	view.getStartPnl().setVisible(true);
        	view.getCreditsPnl().setVisible(false);
            	
        }
        // go to settings 
        else if(source == view.getSettingsBtn()){
        	view.getSettingPnl().setVisible(true);
        	view.getStartPnl().setVisible(false);
        	
        }
        ///settings panel : back bottom
        else if(source == view.getSettingBackBtn()){
        	view.getStartPnl().setVisible(true);
        	view.getSettingPnl().setVisible(false);
        }
        ///settings change loan days btn
        ///settings change tolerance days btn
        ///settings change SS times borrowed btn
        ///settings change SS months borrowed btn
        ///settings go to the future btn
        
        //
        else if(source == view.getSearchBtn()){
        	
        	view.getSearchPnl().setVisible(true);
        	view.getStartPnl().setVisible(false);
        	
        }
        else if(source == view.getAllXSearchBackBtn()){
        	view.getSearchPnl().setVisible(true);
        	       	
        }
        else if(source == view.getBookSearchImageBn()){
        	JFileChooser chooser = new JFileChooser(); //Creamos objeto de JFileChooser
			int opcion = chooser.showOpenDialog(view);//Abrir ventana de dialogo para escoger imagen
			if (opcion == JFileChooser.APPROVE_OPTION) { //Si hacemos click en Abrir o Aceptar
            	archivo= chooser.getSelectedFile().getPath(); //Obtener nombre del archivo
                ImageIcon imagen = new ImageIcon(archivo); //Imagen nueva
                imagen = new ImageIcon(imagen.getImage().getScaledInstance(256, 256, Image.SCALE_DEFAULT)); //resize imagen
                //BookImageLbl.setIcon(imagen);//Antes 
                view.getBookImageLbl().setIcon(imagen);
                //BookRegistrationPnl.add(BookImageLbl, "cell 2 6");
                view.getBookRegistrationPnl().add(view.getBookImageLbl(), "cell 2 6");
			}}

	}

	private void registerNewMovie() {
		System.out.println("Movie Registration");
		
		boolean validTF = false;
		boolean validPath = false;
		
		String name = view.getMovieRegistrationName().getText().trim();
		String genre = view.getMovieRegistrationGenre().getText().trim();
		String director = view.getMovieRegistrationDirector().getText().trim();
		String releaseDate = view.getMovieRegistrationReleaseDate().getText().trim();
		
		
		int rating = (Integer)view.getMovieRatingSpinner().getValue();
		
		if(name.isEmpty()||genre.isEmpty()||director.isEmpty()||releaseDate.isEmpty()){
			validTF = false;
		}else{
			validTF = true;
		}
		
		if(archivo == null){
			validPath = false;
		}else{
			validPath = true;
		String imgPath = archivo;
		CopiarArchivo.getInstance().copiar(imgPath, ".\\src\\image\\"+name+".png");
		}
		
		if(validTF&&validPath){
			Pelicula movie = new Pelicula(name, ".\\src\\image\\"+name+".png", rating,
					genre,director,releaseDate);
			
			model.addBelonging(movie);
			System.out.println(movie.toString());
			ShowDialog("New movie registered: " + name);
			
			view.getStartPnl().setVisible(true); 
			view.getMovieRegistrationPnl().setVisible(false);
			
			///clean
			archivo = null;
			view.getMovieRegistrationName().setText("");
			view.getMovieRegistrationGenre().setText("");
			view.getMovieRegistrationDirector().setText("");
			view.getMovieRegistrationReleaseDate().setText("");
			
			view.getMovieRatingSpinner().setValue(0);
			view.getMovieImagelbl().setIcon(new ImageIcon(View.class.getResource("/image/default_image.png")));
		}else{
			if(!validTF){
				ShowDialog("Incomplete data");
				
			}
			else if(!validPath){
				ShowDialog("You must choose an image file first");
				
			}
			
		}
		
		//move to start panel
		/*
		view.getStartPnl().setVisible(true); 
		view.getMovieRegistrationPnl().setVisible(false);
		*/
	}

	private void registerNewMagazine() {
		System.out.println("Magazine Registration");
		boolean validTF = false;
		boolean validPath = false;
				
		String name = view.getMagazineRegistrationName().getText().trim();
		String publicationPeriod = view.getMagazineRegistrationPublicPeriod().getText().trim();
		String theme = view.getMagazineRegistrationTheme().getText().trim();
		
		if(name.isEmpty()||publicationPeriod.isEmpty()||theme.isEmpty()){
			validTF = false;
			
		}else{
			validTF = true;
		}
		
		int rating = Integer.parseInt(view.getMagazineRatingSpinner().getValue().toString());

		if(archivo == null){
			validPath = false;
		}
		else{
			validPath = true;
			String imgPath = archivo;
			CopiarArchivo.getInstance().copiar(imgPath, ".\\src\\image\\"+name+".png");
		}
		
		if(validTF&&validPath){
			
			Revista mag = new Revista(name,".\\src\\image\\"+name+".png", rating,theme, publicationPeriod );
			System.out.println(mag.toString());
			
			JOptionPane.showMessageDialog(view, "New magazine was registered: "+ name);
			
			//Add to the database
			model.addBelonging(mag);
			
			//Move to start?
			view.getStartPnl().setVisible(true); 
			view.getMagazineRegistrationPnl().setVisible(false);
			
			//clean
			archivo = null;
			view.getMagazineRegistrationName().setText("");
			view.getMagazineRegistrationPublicPeriod().setText("");
			view.getMagazineRegistrationTheme().setText("");
			
			view.getMagazineRatingSpinner().setValue(0);
			view.getMagazineImagelbl().setIcon(new ImageIcon(View.class.getResource("/image/default_image.png")));
			
		}else{
			if(!validTF){
				ShowDialog("Incomplete data");
				
			}
			else if(!validPath){
				ShowDialog("You must choose an image file first");
				
			}
		}
				
	}

	private void registerNewBook() {
		
		System.out.println("Book Registration");
		boolean validTF = false;
		boolean validPath = false;
		
		String name = view.getBookName().getText().trim();
		String author = view.getBookAuthor().getText().trim();
		String editorial = view.getBookEditorial().getText().trim();
		String edition = view.getBookEdition().getText().trim();
		
		int rating = (Integer)view.getBookRatingSpinner().getValue();
		
		if(name.isEmpty()||author.isEmpty()||editorial.isEmpty()||edition.isEmpty()){
			validTF = false;
		}else{
			validTF = true;
		}
		
		
		if(archivo!=null){
			validPath = true;
			String imgPath = archivo;
			CopiarArchivo.getInstance().copiar(imgPath, ".\\src\\image\\"+name+".png");
		}else{
			validPath = false;
			
		}
		
		if(validTF&&validPath){
			Libro book = new Libro(name,".\\src\\image\\"+name+".png", rating,author, editorial, edition );
			System.out.println(book.toString());
			
			ShowDialog("New book was registered: "+ name);
			
			//Add to the database
			model.addBelonging(book);
			
			//Move to start?
			view.getStartPnl().setVisible(true); 
			view.getBookRegistrationPnl().setVisible(false);
			
			//clean
			archivo = null;
			
			view.getBookName().setText("");
			view.getBookAuthor().setText("");
			view.getBookEditorial().setText("");
			view.getBookEdition().setText("");
			
			view.getBookRatingSpinner().setValue(0);
			view.getBookImageLbl().setIcon(new ImageIcon(View.class.getResource("/image/default_image.png")));
			
		}else{
			if(!validTF){
				ShowDialog("Incomplete data");
				
			}
			else if(!validPath){
				ShowDialog("You must choose an image file first");
				
			}
		}
		
	}

	private void registerRelative() {
		System.out.println("registering relative");
		
		boolean validTF = false;
		boolean validEmail = false;
		
		String name = view.getRelativeName().getText().trim();
		String lastn1 = view.getRelativeFirstName().getText().trim();
		String lastn2 = view.getRelativeSecondLastName().getText().trim();
		String kin = view.getRelativeKinship().getText().trim();
		String email = view.getRelativeEmail().getText().trim();
		String phone = view.getRelativePhoneNumber().getText().trim();
		
		if(email.isEmpty()||lastn1.isEmpty()||name.isEmpty()||phone.isEmpty()||lastn2.isEmpty()||kin.isEmpty()){
			validTF = false;
		}else{
			validTF = true;
		}
		
		if(isCorreoValido(email)){
			validEmail = true;
		}else{
			validEmail = false;
		}
		
		if (validTF&&validEmail){
			
		Familiar relative = new Familiar(name, lastn1, lastn2,phone, email, kin);
		System.out.println(relative.toString());
		model.addBorrower(relative);
		
		ShowDialog("A new relative was registered: " + name + " " + lastn1);
		
		view.getStartPnl().setVisible(true);
		view.getRelativeRegistrationPnl().setVisible(false);
		
		view.getRelativeName().setText("");
		view.getRelativeFirstName().setText("");
		view.getRelativeSecondLastName().setText("");
		view.getRelativeKinship().setText("");
		view.getRelativeEmail().setText("");
		view.getRelativePhoneNumber().setText("");
		
		
		}else{
			
			if(!validEmail){
				
				ShowDialog("The email is no valid, try another");
			}
			else{
				
				ShowDialog("Complete all of the fields");
			}
		}
		

	}

	private void ShowDialog(String string) {
		JOptionPane.showMessageDialog(view, string);	
	}

	private void registerStudent() {
		System.out.println("registering student");
		boolean validTF = false;
		boolean validEmail = false;
		
		String email = view.getStudentEmail().getText().trim();
		String lastn1 =view.getStudentFirstLastName().getText().trim();
		String studentId =view.getStudentID().getText().trim();
		String name = view.getStudentName().getText().trim();
		String phone = view.getStudentPhoneNumber().getText().trim();
		String lastn2 = view.getStudentSecondLastName().getText().trim();	
		
		if(email.isEmpty()||lastn1.isEmpty()||name.isEmpty()||phone.isEmpty()||lastn2.isEmpty()||studentId.isEmpty()){
			validTF = false;
		}else{
			validTF = true;
		}
		
		if(isCorreoValido(email)){
			validEmail = true;
		}
		
		if(validEmail&&validTF){
			Estudiante student = new Estudiante(name, lastn1, lastn2, phone, email,studentId);
			System.out.println(student.toString());
			model.addBorrower(student);
			
			ShowDialog("New student was registered: " + name + " " + lastn1);
			
			view.getStartPnl().setVisible(true);
			view.getStudentRegistrationPnl().setVisible(false);
			
			view.getStudentEmail().setText("");
			view.getStudentFirstLastName().setText("");
			view.getStudentID().setText("");
			view.getStudentName().setText("");
			view.getStudentPhoneNumber().setText("");
			view.getStudentSecondLastName().setText("");	
			
		}else{
			if(!validEmail){
				ShowDialog("The email is no valid, try another");
			}
			else{
				ShowDialog("Complete all of the fields");
			}
		}
		
	}

	private void registerCoworker() {

		System.out.println("registering coworker");
		boolean validTF = false;
		boolean validEmail = false;
		
		String email = view.getCoworkerEmail().getText().trim();
		String lastn1 = view.getCoworkerFirstLastName().getText().trim();
		String name = view.getCoworkerName().getText().trim();
		String phone = view.getCoworkerPhoneNumber().getText().trim();
		String lastn2 = view.getCoworkerSecondLastName().getText().trim();
		String workpos = view.getCoworkerWorkPosition().getText().trim();
		
		
		if(email.isEmpty()||lastn1.isEmpty()||name.isEmpty()||phone.isEmpty()||lastn2.isEmpty()||workpos.isEmpty()){
			validTF = false;
		}else{
			validTF = true;
		}
		
		if(isCorreoValido(email)){
			validEmail = true;
		}
		
		if(validTF&&validEmail){
			Colega coworker = new Colega(name, lastn1, lastn2,
					phone, email, workpos);
			System.out.println(coworker.toString());
			model.addBorrower(coworker);
			
			ShowDialog("New coworker was registered: " + name + " " + lastn1);
			
			view.getStartPnl().setVisible(true);
			view.getCoworkerRegistrationPnl().setVisible(false);
			
			view.getCoworkerEmail().setText("");
			view.getCoworkerFirstLastName().setText("");
			view.getCoworkerName().setText("");
			view.getCoworkerPhoneNumber().setText("");
			view.getCoworkerSecondLastName().setText("");
			view.getCoworkerWorkPosition().setText("");
			
			
			
		}else{
			if(!validEmail){
				ShowDialog("The email is no valid, try another");
			}
			else{
				ShowDialog("Complete all of the fields");
			}
			
		}
	}
	
	private String getSelectedRadioButtonInGroupText(ButtonGroup group){
			
		for (Enumeration<AbstractButton> buttons = group.getElements(); buttons.hasMoreElements();) {
	            AbstractButton button = buttons.nextElement();

	            if (button.isSelected()) {
	                return button.getText();
	            }
	    }
		return null;
	}
	private static boolean isCorreoValido(String correo){
		char caracterLeido;
		int posArroba = 0;
		
		//Revisión del arroba.
		posArroba = correo.indexOf("@");
		if (posArroba <= 0){
			return false; //Caso el arroba no esté presente, o esté presente en primera posición del string, no es válido.
		}
		
		//Comprobar que antes del arroba hayan caracteres válidos.
		//Dividimos correo en dos Strings: Antes y después del arroba.
		String antesArroba = correo.substring(0, posArroba);
		String despuesArroba = correo.substring(posArroba+1);
		
		//Verificaremos si hay caracteres válidos en el String antes del arroba (A-Z, a-z, 0-9, punto, guión y guión bajo).
		for(int i = 0; i<antesArroba.length(); i++){
			caracterLeido = antesArroba.charAt(i);
			if (!(caracterLeido > '/' && caracterLeido < ':' ||
					caracterLeido > '@' && caracterLeido < '[' ||
					caracterLeido > '`' && caracterLeido < '{' ||
					caracterLeido == '-' || caracterLeido == '.' ||
					caracterLeido == '_')){
				return false; //Caso los caracteres anteriores al arroba no sean los válidos, invalida el correo.
			}
		}
		
		//Comprobaremos que después del arroba hayan caracteres válidos.
		//Verificaremos si hay al menos un punto para el dominio. 
		if (despuesArroba.indexOf(".") <= 1){
			return false;
		}
		for(int i = 0; i<despuesArroba.length(); i++){
			caracterLeido = despuesArroba.charAt(i);
			if (!(caracterLeido > '/' && caracterLeido < ':' ||
					caracterLeido > '@' && caracterLeido < '[' ||
					caracterLeido > '`' && caracterLeido < '{' ||
					caracterLeido == '-' || caracterLeido == '.' ||
					caracterLeido == '_')){
				return false; //Caso los caracteres posteriores al arroba sean inválidos
			}
		}
		return true;
		
	}

	/**
	 * Updates the "Total belongings", "Total borrowed", "Current date" labels, in the start panel, to their current values
	 */
	private void updateStartPanelLabels()
	{
		view.getTotalBelongingsLblM().setText(model.totalBelongings() + "");
		view.getTotalBorrowedLblM().setText(model.getBiblioteca().getNumberOfLendedBelongings()+"");
		view.getCurrentSystemDate().setText(model.getBiblioteca().getSystemDateString()+"");
	}
	/**
	 * Updates all of the current labels in the settings panel
	 */
	private void updateSettingsLabels()
	{
		view.getSettingsCurrentToleranceDaysLbl().setText(model.getBiblioteca().getDiasTolerancia()+"");
		view.getSettingsCurrentLoanDaysLbl().setText(model.getBiblioteca().getDiasBase()+"");
		view.getSettingsCurrentTopXLbl().setText(model.getBiblioteca().getTopX()+"");
		view.getSettingsCurrentTimesBorrowedLbl().setText(model.getBiblioteca().getCantidasVecesBusqueda()+"");
		view.getSettingsCurrentMonthsLbl().setText(model.getBiblioteca().getTiempoBusquedaMeses()+"");
		view.getSettingsCurrentDateLbl().setText(model.getBiblioteca().getSystemDateString());
		
	}
	private void updateStartPanelPanes()
	{
		updateAllBelongingsPane();
		updateTopXBelongingsPane();
		updateBorrowedBelongingsPane();
		
	}
	private void updateAllBelongingsPane(){
		
	}
	private void updateTopXBelongingsPane(){
		
	}
	private void updateBorrowedBelongingsPane(){
		
	}
	public void updateOnStart()
	{
		updateStartPanelLabels();
		updateStartPanelPanes();
		updateSettingsLabels();
		//fill the belongings pane
		//fill the borrowed belongings 
	}
	private void updateBorrowedXwithBooks()
	{
		view.getBorrowedXLbl().setText("books");
		//load borrowed books
		//model.setTempSearch(model.getBiblioteca().searchBorrowedBooks());
		
		view.getAllXViewport().removeAll();
		ArrayList<Pertenencia> res = model.getBiblioteca().searchBorrowedBooks();
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				Libro tbelong = (Libro)res.get(i);
				BookItem item = new BookItem(tbelong);
				//save book in tempBook in biblioteca
				view.getAllXViewport().add(item);
				view.getAllXViewport().repaint();
				view.getAllXViewport().revalidate();
			}	
		}
		else
		{
			JLabel lab = new JLabel("There's no books borrowed");
			view.getAllXViewport().add(lab);
			//display theres none
		}
		
		view.getBorrowedXPnl().setVisible(true);
		view.getSearchPnl().setVisible(false);
		
	}
	private void updateBorrowedXwithMovies()
	{
		view.getBorrowedXLbl().setText("movies");
		
		view.getAllXViewport().removeAll();
		ArrayList<Pertenencia> res = model.getBiblioteca().searchBorrowedBooks();
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				Pelicula tbelong = (Pelicula)res.get(i);
				MovieItem item = new MovieItem();
				//save book in tempBook in biblioteca
				view.getAllXViewport().add(item);
				view.getAllXViewport().repaint();
				view.getAllXViewport().revalidate();
			}	
		}
		else
		{
			JLabel lab = new JLabel("There's no borrowed movies");
			view.getAllXViewport().add(lab);
			//display theres none
		}
		
		view.getBorrowedXPnl().setVisible(true);
		view.getSearchPnl().setVisible(false);
		
	}
	private void updateBorrowedXwithMagazines()
	{
		view.getBorrowedXPnl().setVisible(true);
		view.getSearchPnl().setVisible(false);
	}
	private void updateAllXwithBooks(){
		
		//update label x
		view.getAllXLbl().setText("books");
		//erase combobox contents
		view.getAllXSearchParametersComboBox().removeAllItems();
		//update combobox contents
		view.getAllXSearchParametersComboBox().setModel(new DefaultComboBoxModel<String>(new String[] { "Title","Author","Editorial", "Edition" }));
	
		view.getAllXViewport().removeAll();
		ArrayList<Pertenencia> res = model.getBiblioteca().searchAllBooks();
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				Libro tbook = (Libro)res.get(i);
				BookItem booky = new BookItem(tbook);
				//save book in tempBook in biblioteca
				view.getAllXViewport().add(booky);
				view.getAllXViewport().repaint();
				view.getAllXViewport().revalidate();
			}	
		}
		else
		{
			JLabel lab = new JLabel("There's no books");
			view.getAllXViewport().add(lab);
			//display theres none
		}
		
		view.getAllXSearch().setVisible(true);
		view.getSearchPnl().setVisible(false);
		
	}
	private void updateAllXwithMovies(){
		
		//update label x
		view.getAllXLbl().setText("movies");
		//erase combobox contents
		view.getAllXSearchParametersComboBox().removeAllItems();
		//update combobox contents
		view.getAllXSearchParametersComboBox().setModel(new DefaultComboBoxModel<String>(new String[] { "Title","Author","Editorial", "Edition" }));
		
		view.getAllXViewport().removeAll();
		ArrayList<Pertenencia> res = model.getBiblioteca().searchAllMovies();
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				Pelicula tbelong = (Pelicula)res.get(i);
				MovieItem item = new MovieItem();
				//save book in tempBook in biblioteca
				view.getAllXViewport().add(item);
				view.getAllXViewport().repaint();
				view.getAllXViewport().revalidate();
			}	
		}
		else
		{
			JLabel lab = new JLabel("There's no movies");
			view.getAllXViewport().add(lab);
			//display theres none
		}
		
		view.getAllXSearch().setVisible(true);
		view.getSearchPnl().setVisible(false);
		
	}
	private void updateAllXwithMagazines(){
		
		//update label x
		view.getAllXLbl().setText("magazines");
		//erase combobox contents
		view.getAllXSearchParametersComboBox().removeAllItems();
		//update combobox contents
		view.getAllXSearchParametersComboBox().setModel(new DefaultComboBoxModel<String>(new String[] { "Title","Author","Editorial", "Edition" }));
		
		view.getAllXViewport().removeAll();
		ArrayList<Pertenencia> res = model.getBiblioteca().searchAllMovies();
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				Revista tbelong = (Revista)res.get(i);
				MagazineItem item = new MagazineItem();
				//save book in tempBook in biblioteca
				view.getAllXViewport().add(item);
				view.getAllXViewport().repaint();
				view.getAllXViewport().revalidate();
			}	
		}
		else
		{
			JLabel lab = new JLabel("There's no magazines");
			view.getAllXViewport().add(lab);
			
		}
		
		view.getAllXSearch().setVisible(true);
		view.getSearchPnl().setVisible(false);
	
	}
	private void updateAvailableXwithBooks(){
		
		view.getAvailableXPnl().setVisible(true);
		view.getSearchPnl().setVisible(false);
		
	}
	private void updateAvailableXwithMovies(){
		
		view.getAvailableXPnl().setVisible(true);
		view.getSearchPnl().setVisible(false);
		
	}
	private void updateAvailableXwithMagazines(){
		
		view.getBorrowedXPnl().setVisible(true);
		view.getSearchPnl().setVisible(false);
		
	}
	private void updateTopXwithBooks()
	{
		view.getTopXPnl().setVisible(true);
		view.getSearchPnl().setVisible(false);
		
	}
	private void updateTopXwithMovies()
	{

		view.getTopXPnl().setVisible(true);
		view.getSearchPnl().setVisible(false);
	}
	private void updateTopXwithMagazines()
	{
		view.getTopXPnl().setVisible(true);
		view.getSearchPnl().setVisible(false);
	}
	private void updateSpecialSwithBooks(){
		
		view.getSpecialSXPnl().setVisible(true);
		view.getSearchPnl().setVisible(false);
		
	}
	private void updateSpecialSwithMovies(){
		

		view.getSpecialSXPnl().setVisible(true);
		view.getSearchPnl().setVisible(false);
		
	}
	private void updateSpecialSwithMagazines(){
		view.getSpecialSXPnl().setVisible(true);
		view.getSearchPnl().setVisible(false);
	
	}

}
