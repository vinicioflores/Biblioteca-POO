package app.model;

public class Colega extends Prestatario{
	
	String puesto;

	public Colega(String nombre, String primerApellido, String segundoApellido,
			String telefono, String correoE, String puesto) {
		super(nombre, primerApellido, segundoApellido, telefono, correoE);
		this.puesto = puesto;
	}
	
	public String getPuesto(){
		return puesto;
	}
	
	public void setPuesto(String puesto){
		this.puesto = puesto;
	}
	
	@Override
	public String toString(){
		String msj = "\nColega: " + nombre + " " + primerApellido + " " + segundoApellido + ""
					+ "\nPuesto: " + puesto + "\nTelefono: "
					+ telefono + "Correo electronico: " + correoE 
					+ "\nPertenencias prestadas: " + PertenenciasPrestadas;
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
