package app.controller;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import app.model.*;
import app.view.*;

public class Controller implements ActionListener{
	
	private Model model;
	private View view;
	
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
		}///search panel :: back botton
		else if(source == view.getSearchBackBtn()){
			view.getStartPnl().setVisible(true);
			view.getSearchPnl().setVisible(false);
		}
		///seach :: book search
		else if(source == view.getBookCSearchBtn()){
			String parameter = getSelectedRadioButtonInGroupText(view.getBookBottonGroup());
			
			if( parameter.equals("All")){
				
				view.getAllBookSearchPnl().setVisible(true);
				view.getSearchPnl().setVisible(false);
				
			}
			else if(parameter.equals("Borrowed")){
				
				view.getBorrowedBooksPnl().setVisible(true);
				view.getSearchPnl().setVisible(false);
				
			}
			else if(parameter.equals("Available")){
				
				view.getAvailableBooksPnl().setVisible(true);
				view.getSearchPnl().setVisible(false);
				
			}
			else if(parameter.equals("Top")){
				
				view.getTopBooksPnl().setVisible(true);
				view.getSearchPnl().setVisible(false);
			}
			else if(parameter.equals("Special search")){
				
				view.getSpecialSBooksPnl().setVisible(true);
				view.getSearchPnl().setVisible(false);
			}
			else{
				
			}
		}///search :: movie 
		////////////Back buttons :: Book searches
		else if(source == view.getAllBookSearchBackBtn()){
			view.getSearchPnl().setVisible(true);
			view.getAllBookSearchPnl().setVisible(false);
			
		}
		else if(source == view.getBorrowedBooksBackBtn()){
			view.getSearchPnl().setVisible(true);
			view.getBorrowedBooksPnl().setVisible(false);
			
		}
		else if(source == view.getTopBooksBackBtn()){
			view.getSearchPnl().setVisible(true);
			view.getTopBooksPnl().setVisible(false);
			
		}
		else if(source == view.getAvailableBooksBackBtn()){
			view.getSearchPnl().setVisible(true);
			view.getAvailableBooksPnl().setVisible(false);
			
		}
		else if(source == view.getSpecialSBooksBackBtn()){
			view.getSearchPnl().setVisible(true);
			view.getSpecialSBooksPnl().setVisible(false);
			
		}
		////////////////////////////////////////////////
		
		else if(source == view.getMovieCSearchBtn()){
			String parameter = getSelectedRadioButtonInGroupText(view.getMovieBottonGroup());
			
			if( parameter.equals("All")){
				
				view.getAllMovieSearchPnl().setVisible(true);
				view.getSearchPnl().setVisible(false);
				
			}
			else if(parameter.equals("Borrowed")){
				
				view.getBorrowedMoviesPnl().setVisible(true);
				view.getSearchPnl().setVisible(false);
				
			}
			else if(parameter.equals("Available")){
				
				view.getAvailableMoviesPnl().setVisible(true);
				view.getSearchPnl().setVisible(false);
				
			}
			else if(parameter.equals("Top")){
				
				view.getTopMoviesPnl().setVisible(true);
				view.getSearchPnl().setVisible(false);
			}
			else if(parameter.equals("Special search")){
				
				view.getSpecialSMoviesPnl().setVisible(true);
				view.getSearchPnl().setVisible(false);
			}
			else{
				
			}
		}
		
			////////////Back buttons :: Movies searches
			else if(source == view.getAllMoviesBackBtn()){
				view.getSearchPnl().setVisible(true);
				view.getAllMovieSearchPnl().setVisible(false);
		
			}
			else if(source == view.getBorrowedMoviesBackBtn()){
				view.getSearchPnl().setVisible(true);
				view.getBorrowedMoviesPnl().setVisible(false);
		
			}
			else if(source == view.getTopMoviesBackBtn()){
				view.getSearchPnl().setVisible(true);
				view.getTopMoviesPnl().setVisible(false);
		
			}
			else if(source == view.getAvailableMoviesBackBtn()){
				view.getSearchPnl().setVisible(true);
				view.getAvailableMoviesPnl().setVisible(false);
		
			}
			else if(source == view.getSpecialSMoviesBackBtn()){
				view.getSearchPnl().setVisible(true);
				view.getSpecialSMoviesPnl().setVisible(false);
		
			}
	////////////////////////////////////////////////
		else if(source == view.getMagazineCSearchBtn()){
			String parameter = getSelectedRadioButtonInGroupText(view.getMagazineBottonGroup());
			
			if( parameter.equals("All")){
				
				view.getAllMagazineSearchPnl().setVisible(true);
				view.getSearchPnl().setVisible(false);
				
			}
			else if(parameter.equals("Borrowed")){
				
				view.getBorrowedMagazinesPnl().setVisible(true);
				view.getSearchPnl().setVisible(false);
				
			}
			else if(parameter.equals("Available")){
				
				view.getAvailableMagazinesPnl().setVisible(true);
				view.getSearchPnl().setVisible(false);
				
			}
			else if(parameter.equals("Top")){
				
				view.getTopMagazinesPnl().setVisible(true);
				view.getSearchPnl().setVisible(false);
			}
			else if(parameter.equals("Special search")){
				
				view.getSpecialSMagazinesPnl().setVisible(true);
				view.getSearchPnl().setVisible(false);
			}
			else{
				
			}
		}
		
////////////Back buttons :: Magzines searches
		else if(source == view.getAllMagazineSearchBackBtn()){
			view.getSearchPnl().setVisible(true);
			view.getAllMagazineSearchPnl().setVisible(false);
	
		}
		else if(source == view.getBorrowedMagazinesBackBtn()){
			view.getSearchPnl().setVisible(true);
			view.getBorrowedMagazinesPnl().setVisible(false);
	
		}
		else if(source == view.getTopMagazinesBackBtn()){
			view.getSearchPnl().setVisible(true);
			view.getTopMagazinesPnl().setVisible(false);
	
		}
		else if(source == view.getAvailableMagazinesBackBtn()){
			view.getSearchPnl().setVisible(true);
			view.getAvailableMagazinesPnl().setVisible(false);
	
		}
		else if(source == view.getSpecialSMagazinesBackBtn()){
			view.getSearchPnl().setVisible(true);
			view.getSpecialSMagazinesPnl().setVisible(false);
	
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
		///
		else if(source == view.getNewBookBtn()){
			view.getBookRegistrationPnl().setVisible(true);
			view.getBelongingRegistrationPnl().setVisible(false);
		}
		////
		else if(source == view.getBookRegistrationBackBtn()){
			
			view.getBelongingRegistrationPnl().setVisible(true);
			view.getBookRegistrationPnl().setVisible(false);
		}
		////
		else if(source == view.getBookRegistrationBtn()){
			
			registerNewBook();
		}
		
		///
		else if(source == view.getNewMagazineBtn()){
			view.getMagazineRegistrationPnl().setVisible(true);
			view.getBelongingRegistrationPnl().setVisible(false);
					
		}
		////
		else if(source == view.getMagazineRegistrationBackBtn()){
			view.getBelongingRegistrationPnl().setVisible(true);
			view.getMagazineRegistrationPnl().setVisible(false);

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
       
        }///
        else if (source == view.getNewStudentBtn()) {
        	
        	view.getStudentRegistrationPnl().setVisible(true);
        	view.getBorrowerRegistrationPnl().setVisible(false);
        	
        	
        }////
        else if (source == view.getStudentRegistrationBackBtn()) {
        	
        	view.getBorrowerRegistrationPnl().setVisible(true);
        	view.getStudentRegistrationPnl().setVisible(false);
       
        }////
        else if (source == view.getStudentRegistrationBtn()) {
        	
        	registerStudent();
       
        }///
        else if (source == view.getNewRelativeBtn()) {
        	view.getRelativeRegistrationPnl().setVisible(true);
        	view.getBorrowerRegistrationPnl().setVisible(false);
	
	
        }
        ////
        else if (source == view.getRelativeRegistrationBackBtn()) {
        	
        	view.getBorrowerRegistrationPnl().setVisible(true);
        	view.getRelativeRegistrationPnl().setVisible(false);
       
        }////
        else if (source == view.getRelativeRegistrationBtn()) {
        	
        	registerRelative();
       
        }
        //Credits
        else if(source == view.getCreditsBtn()){
        	
        	view.getCreditsPnl().setVisible(true);
        	view.getStartPnl().setVisible(false);
        	
        }
        ///
        else if(source == view.getCreditsBackBtn()){
        	
        	view.getStartPnl().setVisible(true);
        	view.getCreditsPnl().setVisible(false);
            	
        }
        //
        else if(source == view.getSettingsBtn()){
        	view.getSettingPnl().setVisible(true);
        	view.getStartPnl().setVisible(false);
        	
        }
        ///settings panel : back bottom
        else if(source == view.getSettingBackBtn()){
        	view.getStartPnl().setVisible(true);
        	view.getSettingPnl().setVisible(false);
        }
        //
        else if(source == view.getSearchBtn()){
        	
        	view.getSearchPnl().setVisible(true);
        	view.getStartPnl().setVisible(false);
        	
        }
        else if(source == view.getAllMagazineSearchBackBtn()){
        	view.getSearchPnl().setVisible(true);
        	
        	
        	
        }
        else if(source == view.getBookSearchImageBn()){
        	JFileChooser chooser = new JFileChooser(); //Creamos objeto de JFileChooser
			int opcion = chooser.showOpenDialog(view);//Abrir ventana de dialogo para escoger imagen
			if (opcion == JFileChooser.APPROVE_OPTION) { //Si hacemos click en Abrir o Aceptar
            	String archivo = chooser.getSelectedFile().getPath(); //Obtener nombre del archivo
                ImageIcon imagen = new ImageIcon(archivo); //Imagen nueva
                imagen = new ImageIcon(imagen.getImage().getScaledInstance(256, 256, Image.SCALE_DEFAULT)); //resize imagen
                //BookImageLbl.setIcon(imagen);//Antes 
                view.getBookImageLbl().setIcon(imagen);
                //BookRegistrationPnl.add(BookImageLbl, "cell 2 6");
                view.getBookRegistrationPnl().add(view.getBookImageLbl(), "cell 2 6");
			}}

	}

	private void registerNewMovie() {
		System.out.println("registering movie");
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(view, "new book registered.");
		
		//move to start panel
		/*
		view.getStartPnl().setVisible(true); 
		view.getMovieRegistrationPnl().setVisible(false);
		*/
	}

	private void registerNewMagazine() {
		System.out.println("registering magazine");
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(view, "new book registered.");
		
	}

	private void registerNewBook() {
		// TODO 
		System.out.println("Book Registration");
		String name = view.getBookName().getText();
		String author = view.getBookAuthor().getText();
		String editorial = view.getBookEditorial().getText();
		String edition = view.getBookEdition().getText();
		int rating;
		view.getBookRatingCombobox();
		//rating = ; //se debe obtener un int de lo de arriba
		
		String imgPath;
		view.getBookSearchImageBn();
		
		JOptionPane.showMessageDialog(view, "new book registered.");
		
	}

	private void registerRelative() {
		System.out.println("registering relative");
		try {
		String name = view.getRelativeName().getText();
		String lastName1 = view.getRelativeFirstName().getText();
		String lastName2 = view.getRelativeSecondLastName().getText();
		String kin = view.getRelativeKinship().getText();
		String email = view.getRelativeEmail().getText();
		String phone = view.getRelativePhoneNumber().getText();
		Familiar relative = new Familiar(name, lastName1, lastName2,phone, email, kin);
		System.out.println(relative.toString());
		model.addBorrower(relative);
		}catch(Exception e){
			ShowDialog("Incorrect registration");
		}
		
		//TODO show success dialog
	}

	private void ShowDialog(String string) {
		System.out.println("registering coworker");
		JOptionPane.showMessageDialog(view, string);
		// TODO Auto-generated method stub
		
	}

	private void registerStudent() {
		System.out.println("registering student");
		String studentId;
		// TODO Auto-generated method stub
		
	}

	private void registerCoworker() {
		// TODO Auto-generated method stub;
		System.out.println("registering coworker");
		
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
	
	

}
