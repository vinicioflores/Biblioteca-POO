package corepack;

/**
 * 
 */

/**
 * 
 * @author 	Roberto Chen Zheng
 * 			Vinicio Flores Hern�ndez
 * 			Faubricio Forester Soto
 * 			Pedro Rodr�guez de Oliveira
 *
 */

/**
  * Permite generar una extensión del tipo de objetos que se pueden gestionar desde este sistema,
  * esto con el fin de no generar limitación únicamente a libros. Esta clase propone una mayor
  * facilidad de extensión.
  *
  **/

public class Material {
	public Libreria coleccion = null;
	private static int MAX_BOOKS = 18000;
	
	//Aquí se agregarán otros nuevos objetos de gestión de otros materiales 
	public Material() {
		coleccion = new Libreria(MAX_BOOKS);
	}
}
