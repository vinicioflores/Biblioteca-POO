package app.model;

public class Colega extends Prestatario{
	
	String puesto;

	public Colega(String nombre, String primerApellido, String segundoApellido,
			String telefono, String correoE, String puesto) {
		super(nombre, primerApellido, segundoApellido, telefono, correoE);
		this.puesto = puesto;
	}
	
	

}
