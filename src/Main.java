

/** 
 * En este archivo se encuentra la clase principal del programa de gestión bibliotecario Alejandría. 
 *  Desde este módulo se corre todo el programa  
 *  
 *  **/

public class Main {
	private static Registro padron;
	private static Cliente nCli;

	public static void main(String[] args){
		System.out.println("Cargando sistema bibliotecario Alejandria ...");
		padron = new Registro(100);
		String[] cli_info = padron.getClientsInfo();
	
		int i = 0;
		while(i < padron.getClientsTop() ){
			System.out.printf("%s", cli_info[i] );
			i++;
		}
		
		Cliente nCli = new Cliente();
		nCli.setNombre("vinicio");
		nCli.setApellidos("flores", "hernandez");
		nCli.setMail("vfloreshdz@gmail.com");
		nCli.setTel(86841796);
		nCli.setCategoria(0);
		
		/* Prueba de agregar cliente */
		padron.write_file_register("clients.regf", nCli);
	}	
}
