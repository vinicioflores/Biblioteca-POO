/**
*
* @author Vinicio Flores Hern�ndez
* 
* **/


/** Esta clase define el objeto base Cliente, el cual representa a cada persona
 * dentro del registro bibliotecario que haya rentado algun libro, los datos de dicha persona,
 * su clasificacion interna (0: Estudiante, 1: Colega, 2: Familiar)   **/


public class Cliente {
	
	private String nombre = "";
	private String apellido1 = "";
	private String apellido2 = "";
	private String correo = "";
	private int telefono = 0;
	private int categoria = 0;
	private int[] libros_rentados = new int[100];
	private int libros_rentados_counter = 0;
	private int ID = 0;
	
	public Cliente(){
		libros_rentados = new int[100];
		nombre = "";
		apellido1 = "";
		apellido2 = "";
		correo = "";
	}
	
	//----------------------------Definición de setters---------------------------------
	
	public void setNombre(String name){
		try {
			nombre = name;
		} catch (NullPointerException e){
			nombre = "";
		}
	}
	
	public void setApellidos(String primero, String segundo){
		try {
			apellido1 = primero;
			apellido2 = segundo;
		} catch (NullPointerException e) {
			apellido1 = "";
			apellido2 = "";
		}
	}
	
	public void setMail(String mail){
		correo = mail;
	}
	
	public void setTel(int tel){
		telefono = tel;
	}
	
	public void setCategoria(int cat){
		categoria = cat;
	}
	
	public void setID(int id){
		ID = id;
	}
	
	public void rentar(int bookid){
		libros_rentados[libros_rentados_counter] = bookid;
		libros_rentados_counter++;
	}
	
	public int getCategoria(){
		return categoria;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String[] getApellidos() {
		String[] apellidos = new String[2];
		apellidos[0] = apellido1;
		apellidos[1] = apellido2;
		return apellidos;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	public String getMail() {
		return correo;
	}
	
	public int getID(){
		return ID;
	}
}
