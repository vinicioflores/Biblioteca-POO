package app.model;

public class Pelicula extends Pertenencia{
	
	String genero;
	String director;
	String aņoPublicacion;
	
	public Pelicula(String nombre, String imagen, int calificacion,
			int vecesPrestado, Prestatario prestatario, String genero,
			String director, String aņoPublicacion) {
		super(nombre, imagen, calificacion, vecesPrestado, prestatario);
		this.genero = genero;
		this.director = director;
		this.aņoPublicacion = aņoPublicacion;
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

	public String getAņoPublicacion() {
		return aņoPublicacion;
	}

	public void setAņoPublicacion(String aņoPublicacion) {
		this.aņoPublicacion = aņoPublicacion;
	}

	@Override
	public String toString() {
		return "Pelicula [genero=" + genero + ", director=" + director
				+ ", aņoPublicacion=" + aņoPublicacion + ", nombre=" + nombre
				+ ", imagen=" + imagen + ", calificacion=" + calificacion
				+ ", vecesPrestado=" + vecesPrestado + ", prestatario="
				+ prestatario + "]";
	}
	
	
	
	
	
	

}
