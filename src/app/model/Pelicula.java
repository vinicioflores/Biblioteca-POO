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
		Biblioteca.setSystemDate();
		this.ID = "MO"+Biblioteca.getSystemDateStringHour();
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

	public String getAnhoPublicacion() {
		return anhoPublicacion;
	}

	public void setAnhoPublicacion(String anhoPublicacion) {
		this.anhoPublicacion = anhoPublicacion;
	}	
	public String getID(){
		return ID;
	}
	
	public void setID(String ID){
		this.ID = ID;
	}
	@Override
	public String toString() {
		String msj = "\nID: " + ID + "\nPelicula: "+ nombre + "\nGenero: " + genero + "\nDirector: " + director
				+ "\nAnho publicacion: " + anhoPublicacion  
				+ "\nPath de la imagen: " + imagen + "\nCalificaci�n=" + calificacion
				+ "\nVeces prestado=" + vecesPrestado + "";
		
		msj += lendingLog.toString();
		
		return msj;
	}
}
