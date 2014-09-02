package app.model;

import java.util.ArrayList;

public class Prestatario extends Persona{
	
	
	ArrayList<Pertenencia> librosPrestados;
	
	public Prestatario(String nombre, String primerApellido,
			String segundoApellido, String telefono, String correoE) {
		super(nombre, primerApellido, segundoApellido, telefono, correoE);
		librosPrestados = new ArrayList<Pertenencia>();
	}

	
	
	

}
