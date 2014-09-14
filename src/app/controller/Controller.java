package app.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        //Search botton
		if(source == view.getSearchBtn()){
			view.getSearchPnl().setVisible(true);
			view.getStartPnl().setVisible(false);
		}///
		else if(source == view.getSearchBackBtn()){
			view.getStartPnl().setVisible(true);
			view.getSearchPnl().setVisible(false);
		}
		//
		else if (source == view.getNewBelongingBtn()){
			view.getBelongingRegistrationPnl().setVisible(true);
			view.getStartPnl().setVisible(false);
		}
		///
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
        	
        	registrateCoworker();
       
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
        	
        	registrateStudent();
       
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
        	
        	registrateRelative();
       
        }//
        else if (source == view.getNewBelongingBtn()) {
       	
        	
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
        	
        }
        //
        else if(source == view.getSearchBtn()){
        	
        	view.getSearchPnl().setVisible(true);
        	view.getStartPnl().setVisible(false);
        	
        }
        else if(source == view.getAllMagazineSearchBackBtn()){
        	view.getSearchPnl().setVisible(true);
        	
        	
        	
        }
        else if(source == view.getSettingsBtn()){
 	
        }
        

	}

	private void registerNewMovie() {
		// TODO Auto-generated method stub
		
	}

	private void registerNewMagazine() {
		// TODO Auto-generated method stub
		
	}

	private void registerNewBook() {
		// TODO Auto-generated method stub
		
	}

	private void registrateRelative() {
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
		// TODO Auto-generated method stub
		
	}

	private void registrateStudent() {
		// TODO Auto-generated method stub
		
	}

	private void registrateCoworker() {
		// TODO Auto-generated method stub
		
	}
	
	

}
