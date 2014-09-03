package app.model;

// Clase Pertenencia 

public class Pertenencia {
	
	// Atributos propios de la clase Pertenencia
	String nombre;
	String imagen;
	int calificacion;
	int vecesPrestado;
	static int codigo = 0;
	Prestatario prestatario;
	
	public Pertenencia(String nombre, String imagen, int calificacion,
			int vecesPrestado, Prestatario prestatario) {
		super();
		
		this.nombre = nombre;
		this.imagen = imagen;
		this.calificacion = calificacion;
		this.vecesPrestado = vecesPrestado;
		this.prestatario = prestatario;
	}
	
	// Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public int getVecesPrestado() {
		return vecesPrestado;
	}

	public void setVecesPrestado(int vecesPrestado) {
		this.vecesPrestado = vecesPrestado;
	}

	public Prestatario getPrestatario() {
		return prestatario;
	}

	public void setPrestatario(Prestatario prestatario) {
		this.prestatario = prestatario;
	}

	@Override
	public String toString() {
		return "Pertenencia [nombre=" + nombre + ", imagen=" + imagen
				+ ", calificacion=" + calificacion + ", vecesPrestado="
				+ vecesPrestado + ", prestatario=" + prestatario + "]";
	}
	
	
	
	

}
