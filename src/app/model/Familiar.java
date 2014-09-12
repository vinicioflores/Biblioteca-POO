package app.model;

public class Familiar extends Prestatario{
	
	String parentesco;

	public Familiar(String nombre, String primerApellido, String segundoApellido, String telefono, String correoE, String parentesco) {
		super(nombre, primerApellido, segundoApellido, telefono, correoE);
		this.parentesco = parentesco;
	}
	
	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	@Override
	public String toString() {
		
		String msj = "\nFamiliar: " + nombre + " " + primerApellido + " " + segundoApellido + ""
				+ "\nParentesco: " + parentesco + "\nTelefono: "
						+ telefono + "Correo electronico: " + correoE 
				+ "\nPertenencias prestadas=" + PertenenciasPrestadas;
		
		for(int i = 0; i < PertenenciasPrestadas.size(); i++){
			
			msj+="\t";
			if(PertenenciasPrestadas.get(i) instanceof Libro){
				
				msj += ((Libro)PertenenciasPrestadas.get(i)).toString() + "\n";
				
			}
			else if(PertenenciasPrestadas.get(i) instanceof Revista){
				
				msj += ((Revista)PertenenciasPrestadas.get(i)).toString() + "\n";
				
			}
			else if(PertenenciasPrestadas.get(i) instanceof Pelicula){
				
				msj += ((Pelicula)PertenenciasPrestadas.get(i)).toString() + "\n";
				
			}
		}
		return msj;
	}
	
	
	
	
	
	

}
