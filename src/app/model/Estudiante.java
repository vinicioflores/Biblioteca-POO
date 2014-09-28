package app.model;

public class Estudiante extends Prestatario {
	
	String carnet;

	public Estudiante(String nombre, String primerApellido,
			String segundoApellido, String telefono, String correoE,
			String carnet) {
		super(nombre, primerApellido, segundoApellido, telefono, correoE);
		this.carnet = carnet;
		RegistroPrestatarios.setSystemDate();
		this.ID = "ST"+RegistroPrestatarios.getSystemDateStringHour();
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
					+ "\nPertenencias prestadas=" + lendingLog;
		for(int i = 0; i < lendingLog.size(); i++){
			
			msj+="\t";
			msj+=lendingLog.get(i) + "\n";
		}
			return msj;
		}
}
