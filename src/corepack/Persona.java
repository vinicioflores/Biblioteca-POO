package corepack;


/**
*
* @author 	Roberto Chen Zheng
* 			Vinicio Flores Hernández
* 			Faubricio Forester Soto
* 			Pedro Rodr�guez de Oliveira
* **/


/** Esta clase define el objeto base Cliente, el cual representa a cada persona
 * dentro del registro bibliotecario que haya rentado algún libro, los datos de dicha persona,
 * esta clase constituye a una persona usuaria de la biblioteca a rasgos generales   **/


public class Persona {
	
	private String nombre = "";
	private String apellido1 = "";
	private String apellido2 = "";
	private String correo = "";
	private int telefono = 0;
	private int[] libros_rentados = new int[100];
	private int libros_rentados_counter = 0;
	private int ID = 0;
	
	public Persona(int maxBookLim) {
		libros_rentados = new int[maxBookLim];
	}
	
	//----------------------------Conjunto de setters---------------------------------
	//Define nombre del cliente. Recibe string (nombre) y retorna nada.
	public void setNombre(String name){
		try {
			nombre = name;
		} catch (NullPointerException e){
			nombre = "";
		}
	}
	
	//Define apellidos del cliente. Recibe string (primer y segundo apellido respectivamente) y retorna nada.
	public void setApellidos(String primero, String segundo){
		try {
			apellido1 = primero;
			apellido2 = segundo;
		} catch (NullPointerException e) {
			apellido1 = "";
			apellido2 = "";
		}
	}
	
	//Define correo electrónico del cliente. Recibe string (mail) y retorna nada.
	public void setMail(String mail){
		correo = mail;
	}
	
	//Define teléfono del cliente. Recibe integer (teléfono) y retorna nada.
	public void setTel(int tel){
		telefono = tel;
	}
	
	//Define ID del cliente. Recibe integer (ID) y retorna nada.
	public void setID(int id){
		ID = id;
	}
	
	//Almacena libro prestado en su histórico de libros prestados. Recibe integer (ID del libro) y retorna nada 
	public void rentar(int bookid){
		libros_rentados[libros_rentados_counter] = bookid;
		libros_rentados_counter++;
	}
	
	
	public void setInfo(String name, String ap1, String ap2, String correo, int tel)
	{
		this.setNombre(name);
		this.setApellidos(ap1, ap2);
		this.setMail(correo);
		this.setTel(tel);
	}
	
	//----------------------------Conjunto de getters---------------------------------
	
	//Regresa nombre del cliente. Recibe nada y retorna nombre del cliente.
	public String getNombre() {
		return nombre;
	}
	
	//Regresa apellidos del cliente. Recibe nada y retorna nombre del cliente.
	public String[] getApellidos() {
		String[] apellidos = new String[2];
		apellidos[0] = apellido1;
		apellidos[1] = apellido2;
		return apellidos;
	}
	
	//Regresa teléfono del cliente. Recibe nada y retorna teléfono del cliente.
	public int getTelefono() {
		return telefono;
	}
	
	//Regresa correo electrónico del cliente. Recibe nada y retorna mail del cliente.
	public String getMail() {
		return correo;
	}
	
	//Regresa ID del cliente. Recibe nada y retorna ID del cliente.
	public int getID(){
		return ID;
	}
}
