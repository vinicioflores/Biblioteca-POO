package app.model;

import java.util.ArrayList;

public class Prestatario extends Persona{
	
	String ID;
	ArrayList<String> lendingLog;
	
	public Prestatario(String nombre, String primerApellido,
			String segundoApellido, String telefono, String correoE) {
		super(nombre, primerApellido, segundoApellido, telefono, correoE);
		lendingLog = new ArrayList<String>();
	}

	public void addNewLending(Pertenencia belonging){
		lendingLog.add(belonging.ID);
	}
	public String getID(){
		return ID;
	}
	@Override
	public String toString() {
		String msj = "";
		msj += "ID: " + ID +"\nPrestatario: " + nombre + "\nPrimer apellido: " + primerApellido
				+ "\nSegundo apellido: " + segundoApellido + "\nTelefono:"
				+ telefono + "\nCorreo Electronico: " + correoE + "\nLibros prestados: ";
		
		for(int i = 0; i < lendingLog.size(); i++){
			msj+="\t";
			msj += lendingLog.get(i)+"\n";
		}
		return msj;
	}
	
	

	
	
	

}
