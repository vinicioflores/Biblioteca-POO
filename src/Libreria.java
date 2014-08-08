/** 
 * 
 * 
 * @author Vinicio Flores Hernández
 *
 *	El objeto más importante del sistema, ya que en este se encuentran toda la lista
 * de libros de la Biblioteca, aqui se renta un libro, se devuelve, etc.
 * 
 */


public class Libreria {
	
	private Libro[] libreria = null;
	private int booklim = 0;
	
	public Libreria(int Maxbooklim){
		libreria = new Libro[Maxbooklim];
		booklim = Maxbooklim;
	}
	
	/** Añade un nuevo libro a la biblioteca **/
	public boolean nuevoLibro(Libro newbook){
		if (libreria[0] == null){
			libreria[0] = newbook;
		} else {
			int i;
			for(i = 0; libreria[i] != null; i++);
			libreria[i] = newbook;
		}
		
		return true;
	}
	
	public boolean quitarLibro(int id){
		int i;
		for(i = 0; libreria[i].getID() != id && i < ; i++);
		libreria[i] = null;
	}
	
	public int rentarLibro(int id){
		int i;
		for(i=0;i<booklim && libreria[i].getID() != id; i++);
		return libreria[i].rentar();
	}
	
	public int rentarLibroTitulo(String title){
		int i;
		for(i=0;i<booklim && libreria[i].getTitulo() != title; i++);
		return libreria[i].rentar();
	}
}
