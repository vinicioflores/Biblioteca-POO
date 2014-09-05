package app.model;

public class Familiar extends Prestatario{
	
	String parentesco;

	public Familiar(String nombre, String primerApellido,
			String segundoApellido, String telefono, String correoE,
			String parentesco) {
		super(nombre, primerApellido, segundoApellido, telefono, correoE);
		this.parentesco = parentesco;
	}
	
	

}
