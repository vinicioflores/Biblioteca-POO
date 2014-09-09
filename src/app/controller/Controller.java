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
        
        if (source == null) {
   
        	
        
        }
        else if (source == null) {
        }

	}
	
	

}
