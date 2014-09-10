package app.model;

public class Libro extends Pertenencia{
	
	String autor;
	String editorial;
	String edicion;
	
	/*
	 * private int score = 0;
	private boolean rentado = false;
	private int ID = 0;
	 */
	
	/**  En esta clase se desarrolla el objeto Libro, el cual incorpora como atributos
	 * caracteristicas basicas como titulo, autores, editorial, etc
	 * Este objeto está asociado con la clase Cliente porque cada cliente
	 * posee un arreglo de objetos Libro, donde se incorporan
	 * sus libros rentados  **/
	


	public String getAutor() {
		return autor;
	}

	public Libro(String nombre, String imagen, int calificacion) {
		super(nombre, imagen, calificacion);
		// TODO Auto-generated constructor stub
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	@Override
	public String toString() {
		return "\nLibro: " + nombre +"\nAutor: " + autor + "\nEditorial: " + editorial
				+ "\nEdicion: " + edicion + "\nPath de la imagen: "
				+ imagen + "/nCalificacion=" + calificacion
				+ "/nVeces prestado: " + vecesPrestado + ", Prestatario:"
				+ prestatario.toString() + "\n";
	}
	
	
	
	

}

