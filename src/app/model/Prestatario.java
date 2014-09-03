package app.model;

import java.util.ArrayList;

// Clase Prestatario que hereda de la clase Persona

public class Prestatario extends Persona{
	
	// Esta clase Prestatario tiene una lista en donde se guaradan los libro que tiene en posesión
	ArrayList<Pertenencia> librosPrestados;
	
	public Prestatario(String nombre, String primerApellido,
			String segundoApellido, String telefono, String correoE) {
		super(nombre, primerApellido, segundoApellido, telefono, correoE);
		librosPrestados = new ArrayList<Pertenencia>();
	}
	
	// Getters y Setters

	@Override
	public String toString() {
		return "Prestatario [librosPrestados=" + librosPrestados + ", nombre="
				+ nombre + ", primerApellido=" + primerApellido
				+ ", segundoApellido=" + segundoApellido + ", telefono="
				+ telefono + ", correoE=" + correoE + "]";
	}
	
	

}
