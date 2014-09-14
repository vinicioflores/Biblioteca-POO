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
	/**
	 * 
	 * @param nombre
	 * @param imagen
	 * @param calificacion
	 * @param autor
	 * @param editorial
	 * @param edicion
	 */
	public Libro(String nombre, String imagen, int calificacion, String autor, String editorial, String edicion) {
		super(nombre, imagen, calificacion);
		this.autor = autor;
		this.editorial = editorial;
		this.edicion = edicion;
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
		String msj =   "\nLibro: " + nombre +"\nAutor: " + autor + "\nEditorial: " + editorial
				+ "\nEdicion: " + edicion + "\nPath de la imagen: "
				+ imagen + "\nCalificacion=" + calificacion
				+ "\nVeces prestado: " + vecesPrestado;
		if (prestatario!=null){
			msj += "Prestatario: " + prestatario.toString();
		}
		return msj;
	}
	
	
	
	

}

