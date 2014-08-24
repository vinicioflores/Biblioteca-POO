package corepack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/** 
 *  
 * @author 	Roberto Chen Zheng
 * 			Vinicio Flores Hernández
 * 			Faubricio Forester Soto
 * 			Pedro Rodríguez de Oliveira
 *
 *	El objeto más importante del sistema, ya que en este se encuentran toda la lista
 *  de libros de la Biblioteca. Además, aquí se renta un libro, se devuelve, entre
 *  otras funciones.
 * 
 */


public class Libreria {
	
	private String STD_BOOK_REGISTER = "collection.regf";
	private Libro[] libreria = null;
	private int booklim = 0;
	private int bookcount = 0;
	private int MAXBUF = 10000; 
	
	public Libreria(int Maxbooklim){
		libreria = new Libro[Maxbooklim];
		booklim = Maxbooklim;
		load_book_register(STD_BOOK_REGISTER);
	}
	
	/** Devuelve un array de String con la informaci�n de todos los libros existentes en la colecci�n **/
	public String[] getBooksInfo()
	{
		int i=0;
	
		String inforow="";
		String[] info = new String[bookcount];
		
		while(libreria[i] != null && i < bookcount){
			inforow = libreria[i].getTitulo()+'\n'+libreria[i].getAutores()+'\n'+libreria[i].getEditorial()+'\n'+  String.valueOf(libreria[i].getEdicion() ) +'\n'+libreria[i].getImg()+'\n';
			inforow += String.valueOf(libreria[i].getScore());
			System.out.println(inforow);
			info[i] = inforow;
			i++;
		}
		return info;
	}
	
	
	/** A�ade un nuevo libro a la biblioteca **/
	public boolean nuevoLibro(Libro newbook){
		try {
			if (libreria[0] == null){
				libreria[0] = newbook;
				libreria[0].setID(1);
				bookcount++;
			} else {
				libreria[bookcount] = newbook;
				libreria[bookcount].setID(libreria[bookcount-1].getID()+1);
				bookcount++;
			}
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
	
	/* Elimina un libro de la colecci�n */
	public boolean quitarLibro(int id){
		int i;
		for(i = 0; libreria[i].getID() != id && i < booklim; i++);
		libreria[i] = null;
		return true;
	}
	
	/* Permite marcar a nivel interno un libro como rentado */
	public int rentarLibro(int id){
		int i;
		for(i=0;i<booklim && libreria[i].getID() != id; i++);
		
		if(libreria[i].getEstado() != true) return libreria[i].rentar();
		else return -1;
	}
	
	public int rentarLibroTitulo(String title){
		int i;
		for(i=0;i<booklim && libreria[i].getTitulo() != title; i++);
		return libreria[i].rentar();
	}
	
	/* Permite devolver un libro a nivel interno */
	public boolean devolverLibro(int id)
	{
		int i;
		for(i=0;i<booklim && libreria[i].getID() != id; i++);
		if(libreria[i].getEstado() == false) return false;
		else { libreria[i].devolver(); return true; }
	}
	
	public int getTop(){
		return bookcount;
	}
	
	/* Los siguientes metodos est�n dirigidos a la habilidad del objeto Libreria para cargar
	 * un registro de coleccion de libros desde un archivo de texto externo */
	
	public void load_book_register(String regname)
	{
		File regfile = new File(regname);
		
		if( !regfile.exists() ){
			System.out.printf("No se pudo encontrar archivo de registro de clientes: %s, se creara uno nuevo ... ", regname);
			write_book_register(regname, null, false);
		} else {
			Scanner s;
			
			try {
				s = new Scanner(regfile);
				int i = 0;
				
				System.out.printf("Leyendo archivo de registro %s  \n\n", regname);
				String[] data = new String[MAXBUF];
				String  row = "";
	
				// Lee todas las lineas del archivo
				while (s.hasNextLine() ){
					row = s.nextLine();
					data[i] = row;
					
					Libro tmpbook = new Libro();
					
					tmpbook.setTitulo(getBookData(data[i], 1));
					tmpbook.setAutores(getBookData(data[i], 2));
					tmpbook.setEditorial(getBookData(data[i], 3));
					tmpbook.setEdicion(Integer.parseInt(getBookData(data[i], 4)));
					tmpbook.setImg(getBookData(data[i], 5));
					tmpbook.setScore(Integer.parseInt(getBookData(data[i], 6)));
					tmpbook.setStatus(Boolean.parseBoolean(getBookData(data[i], 7)));
					
					nuevoLibro(tmpbook);
					//System.out.printf("\n%s\n",data[i]);
					i++;
				}
				
				s.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				}
		}
	}


	private String getBookData(String datarow, int n_token)
	{
		int i_token = 0, i  = 0;
		
		String acum="";
		boolean startacum = false;
		
		while(i < datarow.length())
		{
				if(startacum == true && datarow.charAt(i) == '#'){
					startacum = false;
					break;
				}
				if(startacum == true)
					acum = acum + datarow.charAt(i);
				
				if(datarow.charAt(i) == '#' && i_token != n_token)
					i_token++;
				if(datarow.charAt(i) == '#' && i_token == n_token)
					startacum = true;
			i++;
		}
		return acum;
	}
	
	/* Escribe la informacion de un libro al archivo de registro de libros */
	public void write_book_register(String regname, Libro book, boolean append){
		FileWriter fichero = null;
		PrintWriter pw = null;
		
		try {
			
			if(book != null){
				fichero   = new FileWriter(regname, append);
				pw 		  = new PrintWriter(fichero);	
				pw.println('#'+book.getTitulo()+'#'+book.getAutores()+'#'+book.getEditorial()+'#'+String.valueOf(book.getEdicion()) + '#' + book.getImg() + '#' + String.valueOf(book.getScore()) + '#' +String.valueOf(book.getEstado()) + '#');
			} else {
				fichero   = new FileWriter(regname);
				pw 		  = new PrintWriter(fichero);
				pw.print("");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	/* Vuelca toda la informacion de toda la coleccion en el archivo de registro */
	public void dump_collection(){
		int i;
		write_book_register(STD_BOOK_REGISTER, libreria[0], false);
		for(i = 1; i < bookcount; i++){
			write_book_register(STD_BOOK_REGISTER, libreria[i], true);
		}
	}
}
