package app.model;


// Clase Revista que hereda de la clase Pertenencia 

public class Revista extends Pertenencia {
	
	// Atributos propios de la revista
	
	String tiempoPublicación;
	String tematica;
	
	//Constructor de la clase Revista 

	public Revista(String nombre, String imagen, int calificacion,
			int vecesPrestado, Prestatario prestatario, String tiempoPublicación, String tematica) {
		
		
		super(nombre, imagen, calificacion, vecesPrestado, prestatario);
		
		
		
	}
	
	// Getters y Setters de la clase Revista

	public String getTiempoPublicación() {
		return tiempoPublicación;
	}

	public void setTiempoPublicación(String tiempoPublicación) {
		this.tiempoPublicación = tiempoPublicación;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	@Override
	public String toString() {
		return "Revista [tiempoPublicación=" + tiempoPublicación
				+ ", tematica=" + tematica + ", nombre=" + nombre + ", imagen="
				+ imagen + ", calificacion=" + calificacion
				+ ", vecesPrestado=" + vecesPrestado + ", prestatario="
				+ prestatario + "]";
	}
	
	
}
