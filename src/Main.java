

/** 
 * En este archivo se encuentra la clase principal del programa de gesti�n bibliotecario Alejandr�a. 
 *  Desde este m�dulo se corre todo el programa  
 *  
 *  **/

public class Main {
	private static Registro padron;

	public static void main(String[] args){
		System.out.println("Cargando sistema bibliotecario Alejandria ...");
		padron = new Registro(800);
	}	
}
