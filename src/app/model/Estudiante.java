package app.model;

public class Estudiante extends Prestatario {
	
	String carnet;

	public Estudiante(String nombre, String primerApellido,
			String segundoApellido, String telefono, String correoE,
			String carnet) {
		super(nombre, primerApellido, segundoApellido, telefono, correoE);
		this.carnet = carnet;
	}
	
	public String getCarnet(){
		return carnet;
	}
	
	public void setCarnet(String carnet){
		this.carnet = carnet;
	}
	@Override
	public String toString(){
		String msj = "\nEstudiante: " + nombre + " " + primerApellido + " " + segundoApellido + ""
					+ "\nCarnet: " + carnet + "\nTelefono: "
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
