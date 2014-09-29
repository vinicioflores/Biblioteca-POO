package app.controller;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
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
		
        //Start panel :: Search button
		if(source == view.getSearchBtn()){
			
			view.getSearchPnl().setVisible(true);
			view.getStartPnl().setVisible(false);
		}
		
		///search panel :: back button
		else if(source == view.getSearchBackBtn()){
			
			view.getStartPnl().setVisible(true);
			view.getSearchPnl().setVisible(false);
		}
		
		///search :: book search
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
		
		////////////Back buttons :: searches
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
        
        ///settings change top x btn
		else if(source == view.getSettingsChangeTopXBtn()){
			//TODO
			view.getSettingsChangeTopXSpn();
			
        	
        }
        ///settings change tolerance days btn
		else if(source == view.getSettingsChangeLoanDaysBtn()){
			//TODO
			view.getSettingsChangeLoanDaysSpn();
        	
        }
        ///settings change SS times borrowed btn
		else if(source == view.getSettingsChangeToleranceDaysBtn()){
			//TODO
			view.getSettingsChangeToleranceDaysSpn();
        	
        }
        ///settings change SS months borrowed btn
		else if(source == view.getSettingsChangeMonthsBtn()){
			//TODO
			view.getSettingsChangeMonthsSpn();
        	
        }
        ///settings change SS times borrowed btn
		else if(source == view.getSettingsChangeTimesBorrowedBtn()){
			//TODO
			view.getSettingChangeTimesBorrowedSpn();
        	
        }       
        ///settings go to the future btn
		else if(source == view.getSettingsGoToTheFutureBtn()){
			
			//TODO
			view.getSettingsGoToTheFutureSpn();
        }
        
        //
        else if(source == view.getSearchBtn()){
        	
        	view.getSearchPnl().setVisible(true);
        	view.getStartPnl().setVisible(false);
        	
        }
        
        else if(source == view.getManualBtn()){
        	File pdf = new File("UserManual.pdf");
        	
        	try{
        		Desktop.getDesktop().open(pdf);
        	} catch (Exception e) {
        		System.out.println(e);
        	}
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
        
        else if(source == view.getCoworkerSearchBtn()){
        	//change label
        	view.getBorrowersSearchXLbl().setText("Coworkers");
        	       	
        	//fill with relatives items
        	view.getBorrowersSearchViewport();
        	view.getBorrowersSearchViewport().removeAll();
        	view.getBorrowersSearchViewport().setLayout(new BoxLayout(view.getBorrowersSearchViewport(), BoxLayout.PAGE_AXIS));
        	ArrayList<Prestatario> res = model.getPrestatarios().getCoworkers();
    		if(res.size() > 0){
    			
    			for(int i = 0; i < res.size(); i++)
    			{
    				Colega tcoworker = (Colega)res.get(i);
    				CoworkerItem coworkery = new CoworkerItem(tcoworker);
    				//save book in tempBook in biblioteca
    				view.getBorrowersSearchViewport().add(coworkery);
    				view.getBorrowersSearchViewport().repaint();
    				view.getBorrowersSearchViewport().revalidate();
    			}	
    		}
    		else
    		{
    			JLabel lab = new JLabel("There are no coworkers registered");
    			view.getBorrowersSearchViewport().add(lab);
    			
    		}
        	
        	view.getBorrowersSearchPnl().setVisible(true);
        	view.getSearchPnl().setVisible(false);
        	
        }
        else if(source == view.getStudentSearchBtn()){
        	//change label
        	view.getBorrowersSearchXLbl().setText("Students");
        	       	
        	//fill with relatives items
        	view.getBorrowersSearchViewport();
        	view.getBorrowersSearchViewport().removeAll();
        	view.getBorrowersSearchViewport().setLayout(new BoxLayout(view.getBorrowersSearchViewport(), BoxLayout.PAGE_AXIS));
        	ArrayList<Prestatario> res = model.getPrestatarios().getStudents();
    		if(res.size() > 0){
    			
    			for(int i = 0; i < res.size(); i++)
    			{
    				Estudiante tstudent = (Estudiante)res.get(i);
    				StudentItem studenty = new StudentItem(tstudent);
    				//save book in tempBook in biblioteca
    				view.getBorrowersSearchViewport().add(studenty);
    				view.getBorrowersSearchViewport().repaint();
    				view.getBorrowersSearchViewport().revalidate();
    			}	
    		}
    		else
    		{
    			JLabel lab = new JLabel("There are no students registered");
    			view.getBorrowersSearchViewport().add(lab);
    			
    		}
        	
        	view.getBorrowersSearchPnl().setVisible(true);
        	view.getSearchPnl().setVisible(false);
        	
        }
        else if(source == view.getSearchRelativesBtn()){
        	//change label
        	view.getBorrowersSearchXLbl().setText("Relatives");
        	       	
        	//fill with relatives items
        	view.getBorrowersSearchViewport();
        	view.getBorrowersSearchViewport().removeAll();
        	view.getBorrowersSearchViewport().setLayout(new BoxLayout(view.getBorrowersSearchViewport(), BoxLayout.PAGE_AXIS));
        	ArrayList<Prestatario> res = model.getPrestatarios().getRelatives();
    		if(res.size() > 0){
    			
    			for(int i = 0; i < res.size(); i++)
    			{
    				Familiar trelative = (Familiar)res.get(i);
    				RelativeItem relativey = new RelativeItem(trelative);
    				//save book in tempBook in biblioteca
    				view.getBorrowersSearchViewport().add(relativey);
    				view.getBorrowersSearchViewport().repaint();
    				view.getBorrowersSearchViewport().revalidate();
    			}	
    		}
    		else
    		{
    			JLabel lab = new JLabel("There are no relatives registered");
    			view.getBorrowersSearchViewport().add(lab);
    			
    		}
        	
        	view.getBorrowersSearchPnl().setVisible(true);
        	view.getSearchPnl().setVisible(false);
        	
        }
        
        else if(source == view.getBorrowersSearchBackBtn()){
        	view.getSearchPnl().setVisible(true);
        	view.getBorrowersSearchPnl().setVisible(false);
        	
        	
        }
        
        

	}

	private void registerNewMovie() {
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
		CopiarArchivo.getInstance().copiar(imgPath, ".\\src\\image\\" + "#Movie" +name + director+".png");
		}
		
		if(validTF&&validPath){
			Pelicula movie = new Pelicula(name, ".\\src\\image\\" + "#Movie" +name + director+".png", rating,
					genre,director,releaseDate);
			
			model.addBelonging(movie);
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
		
		updateStartPanelPanes();
		updateStartPanelLabels();
		//move to start panel
		/*
		view.getStartPnl().setVisible(true); 
		view.getMovieRegistrationPnl().setVisible(false);
		*/
	}

	private void registerNewMagazine() {
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
			CopiarArchivo.getInstance().copiar(imgPath, ".\\src\\image\\"+ "#Magazine" +name + theme +".png");
		}
		
		if(validTF&&validPath){
			
			Revista mag = new Revista(name,".\\src\\image\\" + "#Magazine" +name + theme+".png", rating,theme, publicationPeriod );
			
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
		updateStartPanelPanes();
		updateStartPanelLabels();		
	}

	private void registerNewBook() {
		
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
			CopiarArchivo.getInstance().copiar(imgPath, ".\\src\\image\\" + "#Book" +name + author+".png");
		}else{
			validPath = false;
			
		}
		
		if(validTF&&validPath){
			Libro book = new Libro(name,".\\src\\image\\" + "#Book" +name + author+".png", rating,author, editorial, edition );
			
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
		updateStartPanelPanes();
		updateStartPanelLabels();
		
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
		
		//Revisi�n del arroba.
		posArroba = correo.indexOf("@");
		if (posArroba <= 0){
			return false; //Caso el arroba no est� presente, o est� presente en primera posici�n del string, no es v�lido.
		}
		
		//Comprobar que antes del arroba hayan caracteres v�lidos.
		//Dividimos correo en dos Strings: Antes y despu�s del arroba.
		String antesArroba = correo.substring(0, posArroba);
		String despuesArroba = correo.substring(posArroba+1);
		
		//Verificaremos si hay caracteres v�lidos en el String antes del arroba (A-Z, a-z, 0-9, punto, gui�n y gui�n bajo).
		for(int i = 0; i<antesArroba.length(); i++){
			caracterLeido = antesArroba.charAt(i);
			if (!(caracterLeido > '/' && caracterLeido < ':' ||
					caracterLeido > '@' && caracterLeido < '[' ||
					caracterLeido > '`' && caracterLeido < '{' ||
					caracterLeido == '-' || caracterLeido == '.' ||
					caracterLeido == '_')){
				return false; //Caso los caracteres anteriores al arroba no sean los v�lidos, invalida el correo.
			}
		}
		
		//Comprobaremos que despu�s del arroba hayan caracteres v�lidos.
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
				return false; //Caso los caracteres posteriores al arroba sean inv�lidos
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
		updateSettingsSpinners();
	}
	private void updateSettingsSpinners(){
		//TODO
		view.getSettingsChangeLoanDaysSpn().setValue(model.getBiblioteca().getDiasBase());
		view.getSettingsChangeToleranceDaysSpn().setValue(model.getBiblioteca().getDiasTolerancia());
		view.getSettingsChangeTopXSpn().setValue(model.getBiblioteca().getTopX());
		view.getSettingChangeTimesBorrowedSpn().setValue(model.getBiblioteca().getCantidasVecesBusqueda());
		view.getSettingsChangeMonthsSpn().setValue(model.getBiblioteca().getTiempoBusquedaMeses());
		
	}
	private void updateStartPanelPanes()
	{
		updateAllBelongingsPane();
		//updateTopXBelongingsPane();
		//updateBorrowedBelongingsPane();
		
	}
	private void updateAllBelongingsPane(){
		
		view.getAllBelongingsViewport().removeAll();;
		
		view.getAllBelongingsViewport().setLayout(new BoxLayout(view.getAllBelongingsViewport(), BoxLayout.LINE_AXIS));
		ArrayList<Pertenencia> res = model.getBiblioteca().getPertenencias();
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				Pertenencia tper = res.get(i);
				BelongingItem item = new BelongingItem(tper);
				//save book in tempBook in biblioteca
				view.getAllBelongingsViewport().add(item);
				view.getAllBelongingsViewport().repaint();
				view.getAllBelongingsViewport().revalidate();
			}	
		}
		else
		{
			JLabel lab = new JLabel("There are not any belongings");
			view.getAllBelongingsViewport().add(lab);
			
		}
		
	}
	private void updateTopXBelongingsPane(){

		view.getTopXViewport().removeAll();
		
		view.getTopXViewport().setLayout(new BoxLayout(view.getAllBelongingsViewport(), BoxLayout.LINE_AXIS));
		ArrayList<Pertenencia> res = model.getBiblioteca().topX();
		
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				Pertenencia tper = res.get(i);
				BelongingItem item = new BelongingItem(tper);
				//save book in tempBook in biblioteca
				view.getTopXViewport().add(item);
				view.getTopXViewport().repaint();
				view.getTopXViewport().revalidate();
			}	
		}
		else
		{
			JLabel lab = new JLabel("There are not any belongings");
			view.getTopXViewport().add(lab);
			
		}
	}
	/**
	 * 
	 */
	private void updateBorrowedBelongingsPane(){
		
		view.getTopBorrowedBelongingsViewport();
		
		
		view.getTopBorrowedBelongingsViewport().removeAll();;
		
		view.getTopBorrowedBelongingsViewport().setLayout(new BoxLayout(view.getAllBelongingsViewport(), BoxLayout.LINE_AXIS));
		ArrayList<Pertenencia> res = model.getBiblioteca().getPertenencias();
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				if(res.get(i).isPrestado()){
					
					Pertenencia tper = res.get(i);
					BelongingItem item = new BelongingItem(tper);
					//save book in tempBook in biblioteca
					view.getTopBorrowedBelongingsViewport().add(item);
					view.getTopBorrowedBelongingsViewport().repaint();
					view.getTopBorrowedBelongingsViewport().revalidate();
				}
					
			}	
		}
		else
		{
			JLabel lab = new JLabel("There are not any borrowed belongings");
			view.getTopBorrowedBelongingsViewport().add(lab);
			
		}
		
	}
	public void updateOnStart()
	{
		updateStartPanelLabels();
		updateStartPanelPanes();
		updateSettingsLabels();
		 
	}
	private void updateBorrowedXwithBooks(){
		
		//update label x
		view.getAllXLbl().setText("books");
		//erase combobox contents
		view.getAllXSearchParametersComboBox().removeAllItems();
		//update combobox contents
		view.getAllXSearchParametersComboBox().setModel(new DefaultComboBoxModel<String>(new String[] { "Title","Author","Editorial", "Edition" }));
	
		view.getAllXViewport().removeAll();
		view.getAllXViewport().setLayout(new BoxLayout(view.getAllXViewport(), BoxLayout.PAGE_AXIS));
		ArrayList<Pertenencia> res = model.getBiblioteca().searchAllBooks();
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				if (res.get(i).getIsPrestado()){
					Libro tbook = (Libro)res.get(i);
					BookItem booky = new BookItem(tbook);
					//save book in tempBook in biblioteca
					view.getAllXViewport().add(booky);
					view.getAllXViewport().repaint();
					view.getAllXViewport().revalidate();
				}
			}	
		}
		else
		{
			JLabel lab = new JLabel("There are no books");
			view.getAllXViewport().add(lab);
			//display theres none
		}
		
		view.getAllXSearch().setVisible(true);
		view.getSearchPnl().setVisible(false);
		
	}
	private void updateBorrowedXwithMovies(){
		
		//update label x
		view.getAllXLbl().setText("movies");
		//erase combobox contents
		view.getAllXSearchParametersComboBox().removeAllItems();
		//update combobox contents
		view.getAllXSearchParametersComboBox().setModel(new DefaultComboBoxModel<String>(new String[] { "Title","Director","Genre", "Year" }));
	
		view.getAllXViewport().removeAll();
		view.getAllXViewport().setLayout(new BoxLayout(view.getAllXViewport(), BoxLayout.PAGE_AXIS));
		ArrayList<Pertenencia> res = model.getBiblioteca().searchAllMovies();
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				if (res.get(i).getIsPrestado()){
					Pelicula tmovie = (Pelicula)res.get(i);
					MovieItem moviey = new MovieItem(tmovie);
					//save book in tempBook in biblioteca
					view.getAllXViewport().add(moviey);
					view.getAllXViewport().repaint();
					view.getAllXViewport().revalidate();
				}
			}	
		}
		else
		{
			JLabel lab = new JLabel("There are no movies");
			view.getAllXViewport().add(lab);
			//display theres none
		}
		
		view.getAllXSearch().setVisible(true);
		view.getSearchPnl().setVisible(false);
		
	}
	private void updateBorrowedXwithMagazines(){
		
		//update label x
		view.getAllXLbl().setText("magazines");
		//erase combobox contents
		view.getAllXSearchParametersComboBox().removeAllItems();
		//update combobox contents
		view.getAllXSearchParametersComboBox().setModel(new DefaultComboBoxModel<String>(new String[] { "Title","Publishing period","Theme"}));
	
		view.getAllXViewport().removeAll();
		view.getAllXViewport().setLayout(new BoxLayout(view.getAllXViewport(), BoxLayout.PAGE_AXIS));
		ArrayList<Pertenencia> res = model.getBiblioteca().searchAllMagazines();
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				if (res.get(i).getIsPrestado()){
					Revista tmagazine = (Revista)res.get(i);
					MagazineItem magaziney = new MagazineItem(tmagazine);
					//save book in tempBook in biblioteca
					view.getAllXViewport().add(magaziney);
					view.getAllXViewport().repaint();
					view.getAllXViewport().revalidate();
				}
			}	
		}
		else
		{
			JLabel lab = new JLabel("There are no magazine");
			view.getAllXViewport().add(lab);
			//display theres none
		}
		
		view.getAllXSearch().setVisible(true);
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
		view.getAllXViewport().setLayout(new BoxLayout(view.getAllXViewport(), BoxLayout.PAGE_AXIS));
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
			JLabel lab = new JLabel("There are no books");
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
		view.getAllXSearchParametersComboBox().setModel(new DefaultComboBoxModel<String>(new String[] { "Title","Director","Genre", "Year" }));
	
		view.getAllXViewport().removeAll();
		view.getAllXViewport().setLayout(new BoxLayout(view.getAllXViewport(), BoxLayout.PAGE_AXIS));
		ArrayList<Pertenencia> res = model.getBiblioteca().searchAllMovies();
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				Pelicula tmovie = (Pelicula)res.get(i);
				MovieItem moviey = new MovieItem(tmovie);
				//save book in tempBook in biblioteca
				view.getAllXViewport().add(moviey);
				view.getAllXViewport().repaint();
				view.getAllXViewport().revalidate();
			}	
		}
		else
		{
			JLabel lab = new JLabel("There are no movies");
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
		view.getAllXSearchParametersComboBox().setModel(new DefaultComboBoxModel<String>(new String[] { "Title","Publishing period","Theme"}));
	
		view.getAllXViewport().removeAll();
		view.getAllXViewport().setLayout(new BoxLayout(view.getAllXViewport(), BoxLayout.PAGE_AXIS));
		ArrayList<Pertenencia> res = model.getBiblioteca().searchAllMagazines();
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				Revista tmagazine = (Revista)res.get(i);
				MagazineItem magaziney = new MagazineItem(tmagazine);
				//save book in tempBook in biblioteca
				view.getAllXViewport().add(magaziney);
				view.getAllXViewport().repaint();
				view.getAllXViewport().revalidate();
			}	
		}
		else
		{
			JLabel lab = new JLabel("There are no magazine");
			view.getAllXViewport().add(lab);
			//display theres none
		}
		
		view.getAllXSearch().setVisible(true);
		view.getSearchPnl().setVisible(false);
		
	}
	private void updateAvailableXwithBooks(){
		
		//update label x
		view.getAllXLbl().setText("books");
		//erase combobox contents
		view.getAllXSearchParametersComboBox().removeAllItems();
		//update combobox contents
		view.getAllXSearchParametersComboBox().setModel(new DefaultComboBoxModel<String>(new String[] { "Title","Author","Editorial", "Edition" }));
	
		view.getAllXViewport().removeAll();
		view.getAllXViewport().setLayout(new BoxLayout(view.getAllXViewport(), BoxLayout.PAGE_AXIS));
		ArrayList<Pertenencia> res = model.getBiblioteca().searchAllBooks();
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				if (!(res.get(i).getIsPrestado())){
					Libro tbook = (Libro)res.get(i);
					BookItem booky = new BookItem(tbook);
					//save book in tempBook in biblioteca
					view.getAllXViewport().add(booky);
					view.getAllXViewport().repaint();
					view.getAllXViewport().revalidate();
				}
			}	
		}
		else
		{
			JLabel lab = new JLabel("There are no books");
			view.getAllXViewport().add(lab);
			//display theres none
		}
		
		view.getAllXSearch().setVisible(true);
		view.getSearchPnl().setVisible(false);
		
	}
	private void updateAvailableXwithMovies(){
		
		//update label x
		view.getAllXLbl().setText("movies");
		//erase combobox contents
		view.getAllXSearchParametersComboBox().removeAllItems();
		//update combobox contents
		view.getAllXSearchParametersComboBox().setModel(new DefaultComboBoxModel<String>(new String[] { "Title","Director","Genre", "Year" }));
	
		view.getAllXViewport().removeAll();
		view.getAllXViewport().setLayout(new BoxLayout(view.getAllXViewport(), BoxLayout.PAGE_AXIS));
		ArrayList<Pertenencia> res = model.getBiblioteca().searchAllMovies();
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				if (!(res.get(i).getIsPrestado())){
					Pelicula tmovie = (Pelicula)res.get(i);
					MovieItem moviey = new MovieItem(tmovie);
					//save book in tempBook in biblioteca
					view.getAllXViewport().add(moviey);
					view.getAllXViewport().repaint();
					view.getAllXViewport().revalidate();
				}
			}	
		}
		else
		{
			JLabel lab = new JLabel("There are no movies");
			view.getAllXViewport().add(lab);
			//display theres none
		}
		
		view.getAllXSearch().setVisible(true);
		view.getSearchPnl().setVisible(false);
		
	}
	private void updateAvailableXwithMagazines(){
		
		//update label x
		view.getAllXLbl().setText("magazines");
		//erase combobox contents
		view.getAllXSearchParametersComboBox().removeAllItems();
		//update combobox contents
		view.getAllXSearchParametersComboBox().setModel(new DefaultComboBoxModel<String>(new String[] { "Title","Publishing period","Theme"}));
	
		view.getAllXViewport().removeAll();
		view.getAllXViewport().setLayout(new BoxLayout(view.getAllXViewport(), BoxLayout.PAGE_AXIS));
		ArrayList<Pertenencia> res = model.getBiblioteca().searchAllMagazines();
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				if (!(res.get(i).getIsPrestado())){
					Revista tmagazine = (Revista)res.get(i);
					MagazineItem magaziney = new MagazineItem(tmagazine);
					//save book in tempBook in biblioteca
					view.getAllXViewport().add(magaziney);
					view.getAllXViewport().repaint();
					view.getAllXViewport().revalidate();
				}
			}	
		}
		else
		{
			JLabel lab = new JLabel("There are no magazine");
			view.getAllXViewport().add(lab);
			//display theres none
		}
		
		view.getAllXSearch().setVisible(true);
		view.getSearchPnl().setVisible(false);
		
	}
	private void updateTopXwithBooks(){
		
		view.getAllXViewport().removeAll();
		view.getAllXViewport().setLayout(new BoxLayout(view.getAllXViewport(), BoxLayout.LINE_AXIS));
		ArrayList<Pertenencia> res = model.getBiblioteca().topXForBooks();
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				
				BookItem item = new BookItem((Libro)res.get(i));
				//save book in tempBook in biblioteca
				view.getAllXViewport().add(item);
				view.getAllXViewport().repaint();
				view.getAllXViewport().revalidate();
			}	
		}
		else
		{
			JLabel lab = new JLabel("There are no books");
			view.getAllXViewport().add(lab);
			
		}
		
		view.getTopXPnl().setVisible(true);
		view.getSearchPnl().setVisible(false);
		
	}
	private void updateTopXwithMovies(){
		
		view.getAllXViewport().removeAll();
		view.getAllXViewport().setLayout(new BoxLayout(view.getAllXViewport(), BoxLayout.PAGE_AXIS));
		ArrayList<Pertenencia> res = model.getBiblioteca().topXForMovies();
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++){
				
				MovieItem item = new MovieItem((Pelicula)res.get(i));
				//save book in tempBook in biblioteca
				view.getAllXViewport().add(item);
				view.getAllXViewport().repaint();
				view.getAllXViewport().revalidate();
			}	
		}
		else
		{
			JLabel lab = new JLabel("There are no movies");
			view.getAllXViewport().add(lab);
			
		}

		view.getTopXPnl().setVisible(true);
		view.getSearchPnl().setVisible(false);
	}
	private void updateTopXwithMagazines(){
		
		view.getAllXViewport().removeAll();
		view.getAllXViewport().setLayout(new BoxLayout(view.getAllXViewport(), BoxLayout.PAGE_AXIS));
		ArrayList<Pertenencia> res = model.getBiblioteca().topXForMagazines();
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				MagazineItem item = new MagazineItem((Revista)res.get(i));
				//save book in tempBook in biblioteca
				view.getAllXViewport().add(item);
				view.getAllXViewport().repaint();
				view.getAllXViewport().revalidate();
			}	
		}
		else
		{
			JLabel lab = new JLabel("There are no magazines");
			view.getAllXViewport().add(lab);
			
		}
		
		view.getTopXPnl().setVisible(true);
		view.getSearchPnl().setVisible(false);
	}
	private void updateSpecialSwithBooks(){
		
		view.getAllXViewport().removeAll();
		view.getAllXViewport().setLayout(new BoxLayout(view.getAllXViewport(), BoxLayout.PAGE_AXIS));
		ArrayList<Pertenencia> res = model.getBiblioteca().specialSearchForBooks(model.getBiblioteca().getCantidasVecesBusqueda(), model.getBiblioteca().getTiempoBusquedaMeses());
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				
				BookItem item = new BookItem((Libro)res.get(i));
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
		
		view.getSpecialSXPnl().setVisible(true);
		view.getSearchPnl().setVisible(false);
		
	}
	private void updateSpecialSwithMovies(){
		
		
		view.getAllXViewport().removeAll();
		view.getAllXViewport().setLayout(new BoxLayout(view.getAllXViewport(), BoxLayout.PAGE_AXIS));
		ArrayList<Pertenencia> res = model.getBiblioteca().specialSearchForMovies(model.getBiblioteca().getCantidasVecesBusqueda(), model.getBiblioteca().getTiempoBusquedaMeses());
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				MovieItem item = new MovieItem((Pelicula)res.get(i));
				//save book in tempBook in biblioteca
				view.getAllXViewport().add(item);
				view.getAllXViewport().repaint();
				view.getAllXViewport().revalidate();
			}	
		}
		else
		{
			JLabel lab = new JLabel("There are no movies that meet this criteria");
			view.getAllXViewport().add(lab);
			
		}
		

		view.getSpecialSXPnl().setVisible(true);
		view.getSearchPnl().setVisible(false);
		
	}
	private void updateSpecialSwithMagazines(){
		
		view.getAllXViewport().removeAll();
		view.getAllXViewport().setLayout(new BoxLayout(view.getAllXViewport(), BoxLayout.PAGE_AXIS));
		ArrayList<Pertenencia> res = model.getBiblioteca().specialSearchForMagazines(model.getBiblioteca().getCantidasVecesBusqueda(), model.getBiblioteca().getTiempoBusquedaMeses());
		if(res.size() > 0){
			
			for(int i = 0; i < res.size(); i++)
			{
				Revista tmagazine = (Revista)res.get(i);
				MagazineItem magaziney = new MagazineItem(tmagazine);
				//save book in tempBook in biblioteca
				view.getAllXViewport().add(magaziney);
				view.getAllXViewport().repaint();
				view.getAllXViewport().revalidate();
			}	
		}
		else
		{
			JLabel lab = new JLabel("There are no magazines that meet this criteria");
			view.getAllXViewport().add(lab);
			
		}
		
		view.getSpecialSXPnl().setVisible(true);
		view.getSearchPnl().setVisible(false);
	
	}

}
