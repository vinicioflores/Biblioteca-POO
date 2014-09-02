package app.model;

public class Pelicula extends Pertenencia{
	
	String genero;
	String director;
	String a�oPublicacion;
	
	public Pelicula(String nombre, String imagen, int calificacion,
			int vecesPrestado, Prestatario prestatario, String genero,
			String director, String a�oPublicacion) {
		super(nombre, imagen, calificacion, vecesPrestado, prestatario);
		this.genero = genero;
		this.director = director;
		this.a�oPublicacion = a�oPublicacion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getA�oPublicacion() {
		return a�oPublicacion;
	}

	public void setA�oPublicacion(String a�oPublicacion) {
		this.a�oPublicacion = a�oPublicacion;
	}

	@Override
	public String toString() {
		return "Pelicula [genero=" + genero + ", director=" + director
				+ ", a�oPublicacion=" + a�oPublicacion + ", nombre=" + nombre
				+ ", imagen=" + imagen + ", calificacion=" + calificacion
				+ ", vecesPrestado=" + vecesPrestado + ", prestatario="
				+ prestatario + "]";
	}
	
	
	
	
	
	

}
