/** 
 * 
 * 
 * @author Vinicio Flores Hern�ndez
 *
 *	El objeto m�s importante del sistema, ya que en este se encuentran toda la lista
 * de libros de la Biblioteca, aqui se renta un libro, se devuelve, etc.
 * 
 */


public class Libreria {
	
	private Libro[] libreria = null;
	
	public Libreria(int Maxbooklim){
		libreria = new Libro[Maxbooklim];
	}
	
	/** A�ade un nuevo libro a la biblioteca **/
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
}
