package app.model;

// Clase Estudiante que hereda de la clase Prestatario

public class Estudiante extends Prestatario {
	
	// Atributo propio de la clase Estudiante
	String carnet;

	public Estudiante(String nombre, String primerApellido,
			String segundoApellido, String telefono, String correoE,
			String carnet) {
		super(nombre, primerApellido, segundoApellido, telefono, correoE);
		this.carnet = carnet;
	}
	
	// Getters y Setters 

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	@Override
	public String toString() {
		return "Estudiante [carnet=" + carnet + ", librosPrestados="
				+ librosPrestados + ", nombre=" + nombre + ", primerApellido="
				+ primerApellido + ", segundoApellido=" + segundoApellido
				+ ", telefono=" + telefono + ", correoE=" + correoE + "]";
	}
	
	
	
	

}
