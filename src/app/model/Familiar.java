package app.model;


// Clase Familiar que hereda de la clase Prestatario

public class Familiar extends Prestatario{
	
	// Atributo propio de la clase Familiar
	String parentesco;

	public Familiar(String nombre, String primerApellido,
			String segundoApellido, String telefono, String correoE,
			String parentesco) {
		super(nombre, primerApellido, segundoApellido, telefono, correoE);
		this.parentesco = parentesco;
	}
	
	// Getters y Setters

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	@Override
	public String toString() {
		return "Familiar [parentesco=" + parentesco + ", librosPrestados="
				+ librosPrestados + ", nombre=" + nombre + ", primerApellido="
				+ primerApellido + ", segundoApellido=" + segundoApellido
				+ ", telefono=" + telefono + ", correoE=" + correoE + "]";
	}
	
	

}
