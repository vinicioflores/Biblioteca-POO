package app.model;

public class Pelicula extends Pertenencia{
	
	String genero;
	String director;
	String anhoPublicacion;
	
	public Pelicula(String nombre, String imagen, int calificacion,
			int vecesPrestado, Prestatario prestatario, String genero,
			String director, String anhoPublicacion) {
		super(nombre, imagen, calificacion, vecesPrestado, prestatario);
		this.genero = genero;
		this.director = director;
		this.anhoPublicacion = anhoPublicacion;
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

	public String getanhoPublicacion() {
		return anhoPublicacion;
	}

	public void setanhoPublicacion(String anhoPublicacion) {
		this.anhoPublicacion = anhoPublicacion;
	}

	@Override
	public String toString() {
		return "Pelicula [genero=" + genero + ", director=" + director
				+ ", anhoPublicacion=" + anhoPublicacion + ", nombre=" + nombre
				+ ", imagen=" + imagen + ", calificacion=" + calificacion
				+ ", vecesPrestado=" + vecesPrestado + ", prestatario="
				+ prestatario + "]";
	}
}
