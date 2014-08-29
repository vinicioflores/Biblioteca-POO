package corepack;

/**
 * IMPLEMENTACION DE OBJETO "REGISTRO" DONDE SE COLOCAN
 * A TODAS LAS PERSONAS CON SUS DATOS PERSONALES Y EL ID DE LOS
 * LIBROS QUE HAN RENTADO
 */

/**
 * @author  Vinicio Flores Hernández
 * 			Pedro Rodríguez de Oliveira
 * 			Faubricio Forester Soto
 * 			Roberto Chen Zheng
 *
 */


import java.io.*;

public class Registro extends Listas {
	private Estudiante[] estudiantes = new Estudiante[1000];	// Una lista de usuarios Estudiantes 
	private Colega[] colegas = new Colega[1000];				// Una lista de usuarios Colegas
	private Familiar[] familiares = new Familiar[100];			// Una lista de usuarios Familiares
	private int max_client_lim = 0;
	private int i_cli_est = 0;
	private int i_cli_col = 0;
	private int i_cli_fam = 0;
	//private int i_cli_fam = 0;
	private String STD_REGFILENAME = "clients.regf";
	private int MAX_BOOKS_PER_CLIENT = 150;
	
	// CONSTRUCTOR DEL REGISTRO DE CLIENTES
	public Registro(int lim){					// Aqui el limite de clientes es para CADA CATEGORIA POR APARTE!!, no en general
		max_client_lim = lim;
		familiares = new Familiar[max_client_lim];
		estudiantes = new Estudiante[max_client_lim];
		colegas = new Colega[max_client_lim];
		load_file_register(STD_REGFILENAME);		// El constructor carga los usuarios del archivo de registro con toda su información
	}
	
	/* Lee la informacion de cada cliente en el registro y la retorna como un array de Strings */
	public String toString(){
		int i = 0;
		String inforow = "";
		
		while(estudiantes[i] != null && i < i_cli_est){
			inforow += estudiantes[i].getNombre()+'\n'+estudiantes[i].getApellidos()[0]+'\n'+estudiantes[i].getApellidos()[1]+'\n'+estudiantes[i].getMail()+'\n'+estudiantes[i].getTelefono()+'\n'+estudiantes[i].getID()+'\n'+"Estudiante\n";
			i++;
		} i = 0;

		while(colegas[i] != null && i < i_cli_col) {
			inforow += colegas[i].getNombre()+'\n'+colegas[i].getApellidos()[0]+'\n'+colegas[i].getApellidos()[1]+'\n'+colegas[i].getMail()+'\n'+colegas[i].getTelefono()+'\n'+colegas[i].getID()+'\n'+"Colega\n";
			i++;
		} i = 0;
			
		while(familiares[i] != null && i < i_cli_fam) {
			inforow += familiares[i].getNombre()+'\n'+familiares[i].getApellidos()[0]+'\n'+familiares[i].getApellidos()[1]+'\n'+familiares[i].getMail()+'\n'+familiares[i].getTelefono()+'\n'+familiares[i].getID()+'\n'+"Familiar\n";
			i++;
		}
		
		return (inforow);
	}
	
	/* Agrega un nuevo estudiante como usuario */
	public void add_estudiante(String name, String middlename, String lastname, String email, int tel, double carnet, int pgrado, String inst){
				
		estudiantes[i_cli_est] = new Estudiante(MAX_BOOKS_PER_CLIENT);
		estudiantes[i_cli_est].setInfo(name, middlename, lastname, email, tel);
		estudiantes[i_cli_est].setCarnet(carnet);
		estudiantes[i_cli_est].setInstitucion(inst);
		estudiantes[i_cli_est].setGrado(pgrado);
		
		if (i_cli_est != 0)  estudiantes[i_cli_est].setID(estudiantes[i_cli_est-1].getID() + 1);
		else                 estudiantes[i_cli_est].setID(1);
		
		i_cli_est++;
	}
	
	public void add_colega(String name, String middlename, String lastname, String email, int tel, int nivel, String domicilio){
		
		colegas[i_cli_col] = new Colega(MAX_BOOKS_PER_CLIENT);
		colegas[i_cli_col].setInfo(name, middlename, lastname, email, tel);
		colegas[i_cli_col].setNivelAmistad(nivel);
		colegas[i_cli_col].setDomicilio(domicilio);
		
		if (i_cli_col != 0)  colegas[i_cli_col].setID(colegas[i_cli_col-1].getID() + 1);
		else                 colegas[i_cli_col].setID(1);
		
		i_cli_col++;
	}
	
	public void add_familiar(String name, String middlename, String lastname, String email, int tel, String pParentesco, int edad){
		familiares[i_cli_fam] = new Familiar(MAX_BOOKS_PER_CLIENT);
		familiares[i_cli_fam].setInfo(name, middlename, lastname, email, tel);
		familiares[i_cli_fam].setParentesco(pParentesco);
		familiares[i_cli_fam].setEdad(edad);
		
		if (i_cli_fam != 0)  familiares[i_cli_fam].setID(familiares[i_cli_fam-1].getID() + 1);
		else                 familiares[i_cli_fam].setID(1);
		
		i_cli_fam++;
	}
	
	// Este metodo carga informaciÃ³n de registro de clientes desde un archivo de texto
	public void load_file_register(String regname){
		File regfile = new File(regname);
		
		if( !regfile.exists() ){
			System.out.printf("No se pudo encontrar archivo de registro de clientes: %s, se creara uno nuevo ... ", regname);
			write_register(regname, "", false);
		} else {
				int i = 0;
				System.out.printf("Leyendo archivo de registro %s  \n", regname);
				String[] data = new String[MAXBUF];
				String category="";
				int n_tel=0;
				data = readlines(regname);
				// Lee todas las lineas del archivo
				while (data[i] != null && data[i].equals("") == false){
					category = get_saved_data(data[i], 6);
					
					try { n_tel = Integer.parseInt( get_saved_data(data[i], 5) ); } catch (Exception e) { n_tel = 0; }
					
					if(category.equals("Estudiante") == true) {
						double dcarnet = Double.parseDouble(get_saved_data(data[i], 7));
						int dgrado;
						try { dgrado = Integer.parseInt(get_saved_data(data[i],8)); } catch (Exception e) {dgrado = Estudiante.STD_GRADO; } 
						String dinst = get_saved_data(data[i], 9);				
						add_estudiante(get_saved_data(data[i], 1), get_saved_data(data[i], 2), get_saved_data(data[i], 3), get_saved_data(data[i], 4), n_tel, dcarnet, dgrado, dinst);
					} else if(category.equals("Colega") == true) {
						int dnivel;
						try { dnivel = Integer.parseInt(get_saved_data(data[i], 7)); } catch (Exception e) {dnivel = Colega.STD_NIVEL; }
						String ddom = get_saved_data(data[i], 8);
						add_colega(get_saved_data(data[i], 1), get_saved_data(data[i], 2), get_saved_data(data[i], 3), get_saved_data(data[i], 4), n_tel, dnivel, ddom);
					} else {
						int nedad;
						try { nedad =  Integer.parseInt(get_saved_data(data[i], 8)); } catch (Exception e) { nedad =  Familiar.STD_EDAD; }
						add_familiar(get_saved_data(data[i], 1), get_saved_data(data[i], 2), get_saved_data(data[i], 3), get_saved_data(data[i], 4), n_tel, get_saved_data(data[i], 7), nedad);
					}
					
					i++;
				}
		}
	}
		
	// Si el parametro client en este mÃ©todo es null, entonces solo crea un nuevo archivo de nombre regname, de lo contrario
	// Escribe la informacion de client en dicho archivo
	private void write_file_register_estudiante(String regname, Estudiante client, boolean append){
		String inforow = '#'+client.getNombre()+'#'+client.getApellidos()[0]+'#'+client.getApellidos()[1]+'#'+client.getMail() + '#' + String.valueOf(client.getTelefono()) +'#';
		String cat_str = "Estudiante"+'#'+String.valueOf(client.getCarnet()) + '#' +String.valueOf(client.getGrado()) + '#' + client.getInstitucion();
		write_register(regname, inforow+cat_str+'#', append);
	}
	
	private void write_file_register_colega(String regname, Colega client, boolean append){
		String inforow = '#'+client.getNombre()+'#'+client.getApellidos()[0]+'#'+client.getApellidos()[1]+'#'+client.getMail() + '#' + String.valueOf(client.getTelefono()) +'#';
		String cat_str = "Colega"+'#'+String.valueOf(client.getNivelAmistad()) + '#' +client.getDomicilio();
		write_register(regname, inforow+cat_str+'#', append);
	}
	
	private void write_file_register_familiar(String regname, Familiar client, boolean append) {
		String inforow = '#'+client.getNombre()+'#'+client.getApellidos()[0]+'#'+client.getApellidos()[1]+'#'+client.getMail() + '#' + String.valueOf(client.getTelefono()) +'#';
		String cat_str = "Familiar"+'#'+client.getParentesco() + '#' + String.valueOf(client.getEdad());
		write_register(regname, inforow+cat_str+'#', append);
	}
	
	/* Retorna el numero total de clientes estudiantes registrados hasta el momento */
	public int getEstudiantesTop()     	{ return i_cli_est;  }
	public int getColegasTop() 	    	{ return i_cli_col;  }
	public int getFamiliaresTop()   	{ return i_cli_fam;  }
	
	/* Vuelca toda la informacion de todo el registro en el archivo de registro */
	public void dump_register(){
		int i;
		write_file_register_estudiante(STD_REGFILENAME, estudiantes[0], false);			// Escribimos en el archivo desde cero
		for(i = 1; i < i_cli_est; i++)  write_file_register_estudiante(STD_REGFILENAME, estudiantes[i], true);  
		for(i = 0; i < i_cli_col; i++)  write_file_register_colega(STD_REGFILENAME, colegas[i], true);          
		for(i = 0; i < i_cli_fam; i++)  write_file_register_familiar(STD_REGFILENAME, familiares[i], true);    
	}
}

