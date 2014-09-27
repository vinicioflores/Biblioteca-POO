package app.model;

import java.util.ArrayList;

public class Prestatario extends Persona{
	
	ArrayList<String> lendingLog;
	
	public Prestatario(String nombre, String primerApellido,
			String segundoApellido, String telefono, String correoE) {
		super(nombre, primerApellido, segundoApellido, telefono, correoE);
		lendingLog = new ArrayList<String>();
	}

	public void addNewLending(Pertenencia belonging){
		lendingLog.add(belonging.ID);
	}
	
	@Override
	public String toString() {
		String msj = "";
		msj += "Prestatario: " + nombre + "\nPrimer apellido: " + primerApellido
				+ "\nSegundo apellido: " + segundoApellido + "\nTelefono:"
				+ telefono + "Correo Electronico: " + correoE + "\nLibros prestados: ";
		
		for(int i = 0; i < lendingLog.size(); i++){
			msj+="\t";
			msj += lendingLog.get(i)+"\n";
		}
		return msj;
	}
	
	

	
	
	

}
