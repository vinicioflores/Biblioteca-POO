package app.model;

public class Pelicula extends Pertenencia{
	
	String genero;
	String director;
	String añoPublicacion;
	
	public Pelicula(String nombre, String imagen, int calificacion,
			int vecesPrestado, Prestatario prestatario, String genero,
			String director, String añoPublicacion) {
		super(nombre, imagen, calificacion, vecesPrestado, prestatario);
		this.genero = genero;
		this.director = director;
		this.añoPublicacion = añoPublicacion;
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

	public String getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(String añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	@Override
	public String toString() {
		return "Pelicula [genero=" + genero + ", director=" + director
				+ ", añoPublicacion=" + añoPublicacion + ", nombre=" + nombre
				+ ", imagen=" + imagen + ", calificacion=" + calificacion
				+ ", vecesPrestado=" + vecesPrestado + ", prestatario="
				+ prestatario + "]";
	}
	
	
	
	
	
	

}
