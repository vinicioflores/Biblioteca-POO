package app.model;

// Clase Colega que hereda de la clase Prestatario

public class Colega extends Prestatario{
	
	// Atributo propio de la clase Colega
	String puesto;

	public Colega(String nombre, String primerApellido, String segundoApellido,
			String telefono, String correoE, String puesto) {
		super(nombre, primerApellido, segundoApellido, telefono, correoE);
		this.puesto = puesto;
	}
	
	// Getters y Setters

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Colega [puesto=" + puesto + ", librosPrestados="
				+ librosPrestados + ", nombre=" + nombre + ", primerApellido="
				+ primerApellido + ", segundoApellido=" + segundoApellido
				+ ", telefono=" + telefono + ", correoE=" + correoE + "]";
	}

	
	

}
