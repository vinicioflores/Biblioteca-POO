package app.model;
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
	private Cliente[] clientes = new Cliente[100];
	private int max_client_lim = 0;
	private int MAXBUF = 10000; 
	private int i_cli = 0;
	private String STD_REGFILENAME = "clients.regf";
	
	// CONSTRUCTOR DEL REGISTRO DE CLIENTES
	public Registro(int lim){
		max_client_lim = lim;
		clientes = new Cliente[max_client_lim];
		load_file_register(STD_REGFILENAME);
	}
	
	/* Lee la informacion de cada cliente en el registro y la retorna como un array de Strings */
	public String[] getClientsInfo(){
		int i = 0;
		String inforow = "";
		String[] info = new String[i_cli];
		
		while(clientes[i] != null && i < i_cli){
			inforow = clientes[i].getNombre()+'\n'+clientes[i].getApellidos()[0]+'\n'+clientes[i].getApellidos()[1]+'\n'+clientes[i].getMail()+'\n'+clientes[i].getTelefono()+'\n'+clientes[i].getID()+'\n';
			
			/* Como la categoria se representa como un entero, debo interpretar en palabras lo que representa dicho entero */
			if(clientes[i].getCategoria() == 0) inforow += "Estudiante\n";
			else if(clientes[i].getCategoria() == 1) inforow += "Colega\n";
			else inforow += "Familiar\n";
			info[i] = inforow;
			
			i++;
		}
		
		return info;
	}
	
	/* Agrega un nuevo cliente a la lista de clientes */
	public void add(String name, String middlename, String lastname, String email, int tel, int category){
				
		clientes[i_cli] = new Cliente();
		clientes[i_cli].setNombre(name);
		clientes[i_cli].setApellidos(middlename, lastname);
		clientes[i_cli].setMail(email);
		clientes[i_cli].setTel(tel);
		clientes[i_cli].setCategoria(category);
		
		if (i_cli != 0)  clientes[i_cli].setID(clientes[i_cli-1].getID() + 1);
		else             clientes[i_cli].setID(1);
		
		i_cli++;
	}
	
	// Este metodo carga información de registro de clientes desde un archivo de texto
	public void load_file_register(String regname){
		File regfile = new File(regname);
		
		if( !regfile.exists() ){
			System.out.printf("No se pudo encontrar archivo de registro de clientes: %s, se creara uno nuevo ... ", regname);
			write_file_register(regname, null, false);
		} else {
			Scanner s;
			
			try {
				s = new Scanner(regfile);
				int i = 0;
				
				System.out.printf("Leyendo archivo de registro %s  \n", regname);
				String[] data = new String[MAXBUF];
				String category="", row = "";
				int n_cat = 0, n_tel=0;
				
				// Lee todas las lineas del archivo
				while (s.hasNextLine() ){
					row = s.nextLine();
					data[i] = row;
					category = getClientData(data[i], 6);
					
					if(category.equals("Estudiante") == true) n_cat = 0;
					else if(category.equals("Colega") == true) n_cat = 1;
					else n_cat = 2;
					
					try {
						n_tel = Integer.parseInt( getClientData(data[i], 5) );
					} catch (Exception e) {
						n_tel = 0;
					}
			
					add(getClientData(data[i], 1), getClientData(data[i], 2), getClientData(data[i], 3), getClientData(data[i], 4),  n_tel, n_cat);
					//System.out.printf("\n%s\n",data[i]);
					i++;
				}
				
				s.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		}
	}
		
	// Este metodo obtiene un string de dato de cliente especifico, y devuelve el string solo
	private String getClientData(String datarow, int n_token)
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

	
	
	// Si el parametro client en este método es null, entonces solo crea un nuevo archivo de nombre regname, de lo contrario
	// Escribe la informacion de client en dicho archivo
	public void write_file_register(String regname, Cliente client, boolean append){
		FileWriter fichero = null;
		PrintWriter pw = null;
		
		try {
			
			if(client != null){
				fichero   = new FileWriter(regname, true);
				pw 		  = new PrintWriter(fichero);	
				pw.print('#'+client.getNombre()+'#'+client.getApellidos()[0]+'#'+client.getApellidos()[1]+'#'+client.getMail() + '#' + String.valueOf(client.getTelefono()) +'#');
				String cat_str = "";
				if(client.getCategoria() == 0) cat_str = "Estudiante";
				else if(client.getCategoria() == 1) cat_str = "Colega";
				else cat_str = "Familiar";
				pw.println(cat_str);
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
	
	/* Retorna el numero total de clientes registrados hasta el momento */
	public int getClientsTop()
	{
		return i_cli; 
	}
	
	/* Vuelca toda la informacion de todo el registro en el archivo de registro */
	public void dump_register(){
		int i;
		write_file_register(STD_REGFILENAME, clientes[0], false);
		for(i = 1; i < i_cli; i++){
			write_file_register(STD_REGFILENAME, clientes[i], true);
		}
	}
}
