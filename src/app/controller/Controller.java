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
        //
        if (source == view.getNewBorrowerBtn()) {
        	
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
        //
        else if(source == view.getCreditsBtn()){
        	
        	view.getCreditsPnl().setVisible(true);
        	view.getStartPnl().setVisible(false);
        	
        }
        //
        else if(source == view.getSettingsBtn()){
        	
        }
        //
        else if(source == view.getSearchBtn()){
        	
        	view.getSearchPnl().setVisible(true);
        	view.getStartPnl().setVisible(false);
        	
        }

	}

	private void registrateRelative() {
		// TODO Auto-generated method stub
		
	}

	private void registrateStudent() {
		// TODO Auto-generated method stub
		
	}

	private void registrateCoworker() {
		// TODO Auto-generated method stub
		
	}
	
	

}
