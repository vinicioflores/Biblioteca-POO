package app.model;


// Clase Revista que hereda de la clase Pertenencia 

public class Revista extends Pertenencia {
	
	// Atributos propios de la revista
	
	String tiempoPublicaci�n;
	String tematica;
	
	//Constructor de la clase Revista 

	public Revista(String nombre, String imagen, int calificacion,
			int vecesPrestado, Prestatario prestatario, String tiempoPublicaci�n, String tematica) {
		
		
		super(nombre, imagen, calificacion, vecesPrestado, prestatario);
		
		
		
	}
	
	// Getters y Setters de la clase Revista

	public String getTiempoPublicaci�n() {
		return tiempoPublicaci�n;
	}

	public void setTiempoPublicaci�n(String tiempoPublicaci�n) {
		this.tiempoPublicaci�n = tiempoPublicaci�n;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	@Override
	public String toString() {
		return "Revista [tiempoPublicaci�n=" + tiempoPublicaci�n
				+ ", tematica=" + tematica + ", nombre=" + nombre + ", imagen="
				+ imagen + ", calificacion=" + calificacion
				+ ", vecesPrestado=" + vecesPrestado + ", prestatario="
				+ prestatario + "]";
	}
	
	
}
