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
					i++;
				}
				
				System.out.printf("Leyendo archivo de registro %s  \n\n", regname);
				System.out.printf("%s",data);
				
				s.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		}
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
