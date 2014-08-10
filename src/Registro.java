/**
 * IMPLEMENTACION DE OBJETO "REGISTRO" DONDE SE COLOCAN
 * A TODAS LAS PERSONAS CON SUS DATOS PERSONALES Y EL ID DE LOS
 * LIBROS QUE HAN RENTADO
 */

/**
 * @author Vinicio Flores Hernández
 *
 */


import java.io.*;
import java.util.Scanner;

public class Registro {
	private Cliente[] clientes = null;
	private int max_client_lim = 0;
	private int MAXBUF = 100; 
	
	public Registro(int lim){
		max_client_lim = lim;
		clientes = new Cliente[max_client_lim]; 
		load_file_register("regfile.regf");
	}
	
	public int add(String name, String middlename, String lastname, String email, int tel, int category){
		
		int i;
		for(i=0;i<max_client_lim && clientes[i].getID() != 0; i++);
		clientes[i].setNombre(name);
		clientes[i].setApellidos(middlename, lastname);
		clientes[i].setMail(email);
		clientes[i].setTel(tel);
		clientes[i].setCategoria(category);
		if (i != 0)
			clientes[i].setID(clientes[i-1].getID()+1);
		else
			clientes[i].setID(clientes[i].getID()+1);	
		return clientes[i].getID();
	}
	
	// Este metodo carga información de registro de clientes desde un archivo de texto
	public void load_file_register(String regname){
		File regfile = new File(regname);
		
		if( !regfile.exists() ){
			System.out.printf("No se pudo encontrar archivo de registro de clientes: %s, se creara uno nuevo ... ", regname);
			write_file_register(regname, null);
		} else {
			Scanner s;
			
			try {
				s = new Scanner(regfile);
				int i = 0;
				
				String[] data = new String[MAXBUF];
				// Lee todas las lineas del archivo
				while (s.hasNextLine() ){
					String row = s.nextLine();
					data[i] = row;
					insert_regdata_client_list(data[i]);
					System.out.printf("%s",data[i]);
					i++;
				}
				
				System.out.printf("Leyendo archivo de registro %s  \n\n", regname);;
				
				s.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	/* 
	 * Este metodo es de uso interno de esta clase, se encarga de 
	 * de ir creando una instancia del objeto Cliente para cada linea de datos
	 * correspondiente a cada persona y las inserta en la lista 
	 * de clientes.
	 */
	private void insert_regdata_client_list(String data)
	{
		
		if(data == "")
		{
			System.out.println("No hay información que registrar ... ");
			return;
		}
		
		int i;
		
		String name = getClientData(data, 1);
		String ap1 = getClientData(data, 2);
		String ap2 = getClientData(data, 3);
		String mail = getClientData(data, 4);
		String tel = getClientData(data, 5);
		String id = getClientData(data, 6);
		String category = getClientData(data, 7);
		
		int n_id = Integer.parseInt(id);
		int n_tel = Integer.parseInt(tel), n_cat;
		
		if(category == "Estudiante") n_cat = 0;
		else if(category == "Colega") n_cat = 1;
		else n_cat = 2;
		
		for(i=0;i<max_client_lim;i++){
			clientes[i].setNombre(name);
			clientes[i].setApellidos(ap1, ap2);
			clientes[i].setMail(mail);
			clientes[i].setTel(n_tel);
			clientes[i].setID(n_id);
			clientes[i].setCategoria(n_cat);
		}
	}
	
	
	// Este metodo obtiene un string de dato de cliente especifico, y devuelve el string solo
	private String getClientData(String datarow, int n_token)
	{
		int i_token = 0, i  = 0;
		
		String acum="";
		boolean startacum = false;
		
		while(i < datarow.length() && acum != null)
		{
			try {
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
			} catch(StringIndexOutOfBoundsException e) {
				break;
				}
			
			i++;
	}
		
		System.out.printf("acum=%s\t",acum);
		return acum;
	}

	
	
	// Si el parametro client en este método es null, entonces solo crea un nuevo archivo de nombre regname, de lo contrario
	// Escribe la informacion de client en dicho archivo
	public void write_file_register(String regname, Cliente client){
		FileWriter fichero = null;
		PrintWriter pw = null;
		
		try {
			fichero = new FileWriter(regname);
			pw = new PrintWriter(fichero);
			if(client != null){
				pw.printf("%%%s#%s#%s#%s#%d#%d#%d",client.getNombre(), client.getApellidos()[0], client.getApellidos()[1], client.getMail(), client.getTelefono(), client.getID() );
				String cat_str = "";
				if(client.getCategoria() == 0)
					cat_str = "Estudiante";
				else if(client.getCategoria() == 1)
					cat_str = "Colega";
				else
					cat_str = "Familiar";
				pw.printf("#%d%%\n", cat_str);
			} else {
				pw.printf("%%");
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
}
