package app.model;

public class Pelicula extends Pertenencia{
	
	String genero;
	String director;
	String anhoPublicacion;
	
	public Pelicula(String nombre, String imagen, int calificacion,
			String genero, String director, String anhoPublicacion) {
		super(nombre, imagen, calificacion);
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
		String msj = "\nPelicula: "+ nombre + "\nGenero: " + genero + "\nDirector: " + director
				+ "\nAnho publicacion: " + anhoPublicacion  
				+ "\nPath de la imagen: " + imagen + "\nCalificación=" + calificacion
				+ "\nVeces prestado=" + vecesPrestado + "";
		
		if (prestatario != null){
			msj += "\nPrestatario: " + prestatario.toString() + "\n";
		}
		
		return msj;
	}
}
