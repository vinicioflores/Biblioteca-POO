package app.model;

import java.util.ArrayList;

public class Prestatario extends Persona{
	
	
	ArrayList<Pertenencia> PertenenciasPrestadas;
	
	public Prestatario(String nombre, String primerApellido,
			String segundoApellido, String telefono, String correoE) {
		super(nombre, primerApellido, segundoApellido, telefono, correoE);
		PertenenciasPrestadas = new ArrayList<Pertenencia>();
	}

	@Override
	public String toString() {
		String msj = "";
		msj += "Prestatario: " + nombre + "\nPrimer apellido: " + primerApellido
				+ "\nSegundo apellido: " + segundoApellido + "\nTelefono:"
				+ telefono + "Correo Electronico: " + correoE + "\nLibros prestados: ";
		
		for(int i = 0; i < PertenenciasPrestadas.size(); i++){
			
			msj+="\t";
			if(PertenenciasPrestadas.get(i) instanceof Libro){
				
				msj += ((Libro)PertenenciasPrestadas.get(i)).toString() + "\n";
				
			}
			else if(PertenenciasPrestadas.get(i) instanceof Revista){
				
				msj += ((Revista)PertenenciasPrestadas.get(i)).toString() + "\n";
				
			}
			else if(PertenenciasPrestadas.get(i) instanceof Pelicula){
				
				msj += ((Pelicula)PertenenciasPrestadas.get(i)).toString() + "\n";
				
			}
		}
		return msj;
	}
	
	

	
	
	

}
