package app.model;

public class Libro extends Pertenencia{
	
	String autor;
	String editorial;
	String edicion;
		
	public Libro(String nombre, String imagen, int calificacion, String autor, String editorial, String edicion) {
		super(nombre, imagen, calificacion);
		this.autor = autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.ID = "BO"+Biblioteca.getSystemDateString();
	}

	public String getAutor() {
		return autor;
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

	public String getID(){
		return ID;
	}
	
	public void setID(String ID){
		this.ID = ID;
	}

	@Override
	public String toString() {
		String msj = "\nID: " + ID + "\nLibro: " + nombre +"\nAutor: " + autor + "\nEditorial: " + editorial
				+ "\nEdicion: " + edicion + "\nPath de la imagen: "
				+ imagen + "\nCalificacion=" + calificacion
				+ "\nVeces prestado: " + vecesPrestado;
		
		msj += lendingLog.toString();
		
		return msj;
	}
	
	
	
	

}

