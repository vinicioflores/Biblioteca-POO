package corepack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/** Implementa el manejo de listados, registros, entre otros. Esta clase corresponde a la clase Ancestral
 * de las clases Registro y Libreria
 * @author Vinicio Flores Hernández
 *	Tecnológico de Costa Rica, 2014
 */
protected class Listas {
	public int MAXBUF = 10000;			// Cantidad maxima de lineas, es publico para ser usada en clases hijas o descendientes
	private String header;   			// Titulo de la Lista
	
	public void setHeader(String name) {
		header = name;
	}
	
	public String getHeader() {
		return header;
	}
	
	public String[] readlines(String regname){
		String[] data = new String[MAXBUF];
		File regfile  = new File(regname);
		
		if( !regfile.exists() ){
			System.out.printf("No se pudo encontrar archivo de registro de clientes: %s, se creara uno nuevo ... ", regname);
			write_register(regname, null, false);
		} else {
			try {
				Scanner s = new Scanner(regfile);
				int i = 0;
				System.out.printf("Leyendo archivo de registro %s  \n\n", regname);
				// Lee todas las lineas del archivo
				while (s.hasNextLine() ){ data[i] = s.nextLine(); System.out.println(data[i]); i++; }
				s.close();
			} catch (FileNotFoundException e) { e.printStackTrace(); }
		}
		return data;
	}
	
	public void write_register(String regname, String line,  boolean append) {
		FileWriter fichero = null;
		PrintWriter pw = null;
		
		try {
			
			if(line != null){
				fichero   = new FileWriter(regname, append);
				pw 		  = new PrintWriter(fichero);	
				pw.println(line);
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
	
	public String get_saved_data(String datarow, int n_token)
	{
		String acum="";
		boolean startacum = false;
		int i_token = 0, i  = 0;
		
		while(i < datarow.length())
		{
				if(startacum == true && datarow.charAt(i) == '#'){ startacum = false; break; }
				if(startacum == true) acum = acum + datarow.charAt(i);
				if(datarow.charAt(i) == '#' && i_token != n_token) i_token++;
				if(datarow.charAt(i) == '#' && i_token == n_token) startacum = true;
				i++;
		}
		return acum;
	}
}