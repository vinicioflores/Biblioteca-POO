package corepack;

/**
 * 
 */

/**
 * 
 * @author 	Roberto Chen Zheng
 * 			Vinicio Flores Hern醤dez
 * 			Faubricio Forester Soto
 * 			Pedro Rodr韌uez de Oliveira
 *
 */

/**
  * Permite generar una extensi贸n del tipo de objetos que se pueden gestionar desde este sistema,
  * esto con el fin de no generar limitaci贸n 煤nicamente a libros. Esta clase propone una mayor
  * facilidad de extensi贸n.
  *
  **/

public class Material {
	public Libreria coleccion = null;
	private static int MAX_BOOKS = 18000;
	
	//Aqu铆 se agregar谩n otros nuevos objetos de gesti贸n de otros materiales 
	public Material() {
		coleccion = new Libreria(MAX_BOOKS);
	}
}
