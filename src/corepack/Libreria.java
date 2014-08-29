package corepack;

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


protected class Libreria extends Listas {
	
	private String STD_BOOK_REGISTER = "collection.regf";
	private Libro[] libreria = null;
	private int booklim = 0;
	private int bookcount = 0; 
	
	public Libreria(int Maxbooklim){
		libreria = new Libro[Maxbooklim];
		booklim = Maxbooklim;
		load_book_register(STD_BOOK_REGISTER);
	}
	
	/** Devuelve un array de String con la informaci�n de todos los libros existentes en la colecci�n **/
	public String toString()
	{
		int i=0;
	
		String inforow="";
		
		while(libreria[i] != null && i < bookcount){
			inforow += libreria[i].getTitulo()+'\n'+libreria[i].getAutores()+'\n'+libreria[i].getEditorial()+'\n'+  String.valueOf(libreria[i].getEdicion() ) +'\n'+libreria[i].getImg()+'\n';
			inforow += String.valueOf(libreria[i].getScore());
			i++;
		}
		return inforow;
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
					int i = 0;
					Libro tmpbook;
					String[] data = readlines(regname);
					
					while (data[i] != null && data[i].equals("") == false){
						tmpbook = new Libro();
						tmpbook.setTitulo(get_saved_data(data[i], 1));
						tmpbook.setAutores(get_saved_data(data[i], 2));
						tmpbook.setEditorial(get_saved_data(data[i], 3));
						tmpbook.setEdicion(Integer.parseInt(get_saved_data(data[i], 4)));
						tmpbook.setImg(get_saved_data(data[i], 5));
						tmpbook.setScore(Integer.parseInt(get_saved_data(data[i], 6)));
						tmpbook.setStatus(Boolean.parseBoolean(get_saved_data(data[i], 7)));
						nuevoLibro(tmpbook);
						i++;
					}
	}
	
	
	/* Escribe la informacion de un libro al archivo de registro de libros */
	public void write_book_register(String regname, Libro book, boolean append){
		write_register(regname, '#'+book.getTitulo()+'#'+book.getAutores()+'#'+book.getEditorial()+'#'+String.valueOf(book.getEdicion()) + '#' + book.getImg() + '#' + String.valueOf(book.getScore()) + '#' +String.valueOf(book.getEstado()) + '#'  ,append);
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
