

/** 
 * En este archivo se encuentra la clase principal del programa de gestión bibliotecario Alejandría. 
 *  Desde este módulo se corre todo el programa  
 *  
 *  **/

public class Main {
	private static Registro padron;
	private static Libreria coleccion;
	private static int MAX_CLIENTS = 9000;
	private static int MAX_BOOKS   = 18000;

	public static void main(String[] args){
		
		System.out.println("Cargando sistema bibliotecario Alejandria ...");
		padron = new Registro(MAX_CLIENTS);
		coleccion = new Libreria(MAX_BOOKS);
		coleccion.getBooksInfo();
		
		Libro book0 = new Libro();
		
		book0.setTitulo("math1");
		book0.setAutores("Murillo Ts");
		book0.setEditorial("ETCR");
		book0.setEdicion(4);
		book0.setScore(9);
		
		coleccion.write_book_register("collection.regf", book0, true);
	}	
}
