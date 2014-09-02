package app.model;

public class Persona {
	
	String nombre;
	String primerApellido;
	String segundoApellido;
	String telefono;
	String correoE;
	
	public Persona(String nombre, String primerApellido,
			String segundoApellido, String telefono, String correoE) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.telefono = telefono;
		this.correoE = correoE;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreoE() {
		return correoE;
	}
	public void setCorreoE(String correoE) {
		this.correoE = correoE;
	}
	
	

}
