package app.model;

public class Estudiante extends Prestatario {
	
	String carnet;

	public Estudiante(String nombre, String primerApellido,
			String segundoApellido, String telefono, String correoE,
			String carnet) {
		super(nombre, primerApellido, segundoApellido, telefono, correoE);
		this.carnet = carnet;
	}
	
	
	
	

}
