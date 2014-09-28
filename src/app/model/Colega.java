package app.model;

public class Colega extends Prestatario{
	
	String puesto;

	public Colega(String nombre, String primerApellido, String segundoApellido,
			String telefono, String correoE, String puesto) {
		super(nombre, primerApellido, segundoApellido, telefono, correoE);
		this.puesto = puesto;
		RegistroPrestatarios.setSystemDate();
		this.ID = "CO"+RegistroPrestatarios.getSystemDateStringHour();
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
					+ "\nPertenencias prestadas: " + lendingLog;
			for(int i = 0; i < lendingLog.size(); i++){
				
				msj+="\t";
				msj+=lendingLog.get(i) + "\n";
			}
			return msj;
		}
	

}
