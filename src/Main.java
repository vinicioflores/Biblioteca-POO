

/** 
 * En este archivo se encuentra la clase principal del programa de gestión bibliotecario Alejandría. 
 *  Desde este módulo se corre todo el programa  
 *  
 *  **/

/** .l. */

public class Main {
	private static Registro padron;
	private static Libreria coleccion;
	private static int MAX_CLIENTS = 9000;
	private static int MAX_BOOKS   = 18000;
	private static Interfaz MainWin = null; 

	public static void main(String[] args){
		
		System.out.println("Cargando sistema bibliotecario Alejandria ...");
		padron = new Registro(MAX_CLIENTS);
		coleccion = new Libreria(MAX_BOOKS);
		MainWin = new Interfaz();
	}	
}
