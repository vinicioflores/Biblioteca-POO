package corepack;

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

public class Registro extends Listas {
	private Cliente[] clientes = new Cliente[1000];
	private int max_client_lim = 0;
	private int i_cli = 0;
	private String STD_REGFILENAME = "clients.regf";
	private int MAX_BOOKS_PER_CLIENT = 150;
	
	// CONSTRUCTOR DEL REGISTRO DE CLIENTES
	public Registro(int lim){
		max_client_lim = lim;
		clientes = new Cliente[max_client_lim];
		load_file_register(STD_REGFILENAME);
	}
	
	/* Lee la informacion de cada cliente en el registro y la retorna como un array de Strings */
	public String toString(){
		int i = 0;
		String inforow = "";
		
		while(clientes[i] != null && i < i_cli){
			inforow += clientes[i].getNombre()+'\n'+clientes[i].getApellidos()[0]+'\n'+clientes[i].getApellidos()[1]+'\n'+clientes[i].getMail()+'\n'+clientes[i].getTelefono()+'\n'+clientes[i].getID()+'\n';
			
			/* Como la categoria se representa como un entero, debo interpretar en palabras lo que representa dicho entero */
			if(clientes[i].getCategoria() == 0) inforow += "Estudiante\n";
			else if(clientes[i].getCategoria() == 1) inforow += "Colega\n";
			else inforow += "Familiar\n";
			
			i++;
		}
		
		return (inforow);
	}
	
	/* Agrega un nuevo cliente a la lista de clientes */
	public void add(String name, String middlename, String lastname, String email, int tel, int category){
				
		clientes[i_cli] = new Cliente(MAX_BOOKS_PER_CLIENT);
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
				int i = 0;
				System.out.printf("Leyendo archivo de registro %s  \n", regname);
				String[] data = new String[MAXBUF];
				String category="";
				int n_cat = 0, n_tel=0;
				data = readlines(regname);
				// Lee todas las lineas del archivo
				while (data[i] != null && data[i].equals("") == false){
					category = get_saved_data(data[i], 6);
					
					if(category.equals("Estudiante") == true) n_cat = 0;
					else if(category.equals("Colega") == true) n_cat = 1;
					else n_cat = 2;
					
					try { n_tel = Integer.parseInt( get_saved_data(data[i], 5) ); } catch (Exception e) { n_tel = 0; }
					add(get_saved_data(data[i], 1), get_saved_data(data[i], 2), get_saved_data(data[i], 3), get_saved_data(data[i], 4),  n_tel, n_cat);
					
					i++;
				}
		}
	}
		
	// Si el parametro client en este método es null, entonces solo crea un nuevo archivo de nombre regname, de lo contrario
	// Escribe la informacion de client en dicho archivo
	public void write_file_register(String regname, Cliente client, boolean append){
		String inforow = '#'+client.getNombre()+'#'+client.getApellidos()[0]+'#'+client.getApellidos()[1]+'#'+client.getMail() + '#' + String.valueOf(client.getTelefono()) +'#';
		String cat_str = "";
		if(client.getCategoria() == 0) 		cat_str = "Estudiante";
		else if(client.getCategoria() == 1) cat_str = "Colega";
		else 								cat_str = "Familiar";
		write_register(regname, inforow+cat_str+'#', append);
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

