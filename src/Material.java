/**
 * 
 */

/**
 * @author Vinicio Flores
 *
 */

/** Permite generar una extension del tipo de objetos que se pueden gestionar desde este sistema **
 * esto con el fin de no generar limitación unicamente a libros, esta clase propone una mayor facilidad de extension  */
public class Material {
	Libreria coleccion = null;
	private static int MAX_BOOKS   = 18000;
	// TO DO: Aqui se agregaran otros nuevos objetos de gestion de otros materiales 
	public Material() {
		coleccion = new Libreria(MAX_BOOKS);
	}
}
