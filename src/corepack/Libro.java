package corepack;


/**
*
* @author Vinicio Flores Hernández
* 
* **/



/**  En esta clase se desarrolla el objeto Libro, el cual incorpora como atributos
 * caracteristicas basicas como titulo, autores, editorial, etc
 * Este objeto está asociado con la clase Cliente porque cada cliente
 * posee un arreglo de objetos Libro, donde se incorporan
 * sus libros rentados  **/


public class Libro {
	
	private String Titulo = "";
	private String Autores = "";
	private String Editorial = "";
	private int Edicion = 0;
	private String imgAddr = ".";
	private int score = 0;
	private boolean rentado = false;
	private int ID = 0;
	
	public void setTitulo(String title){
		Titulo = title;
	}
	
	public void setAutores(String authors){
		Autores = authors;
	}
	
	public void setEditorial(String editorial){
		Editorial = editorial;
	}
	
	public void setEdicion(int edition){
		Edicion = edition;
	}
	
	public void setImg(String address){
		imgAddr = address;
	}
	
	public void setScore(int nota){
		score = nota;
	}
	
	public void setID(int id){
		ID = id;
	}
	
	public void setStatus(boolean s){
		rentado = s;
	}
	
	public int rentar(){
		rentado = true;
		return ID;
	}
	
	public void devolver(){
		rentado = false;
	}
	
	// ****************** Lectura externa a atributos
	
	public String getTitulo(){
		return Titulo;
	}
	
	public String getAutores(){
		return Autores;
	}
	
	public String getEditorial(){
		return Editorial;
	}
	
	public int getEdicion(){
		return Edicion;
	}
	
	public String getImg(){
		return imgAddr;
	}
	
	public int getScore(){
		return score;
	}
	
	public boolean getEstado(){
		return rentado;
	}
	
	public int getID(){
		return ID;
	}
}
