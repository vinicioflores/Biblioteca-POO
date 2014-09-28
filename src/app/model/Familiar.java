package app.model;

public class Familiar extends Prestatario{
	
	String parentesco;
	public Familiar(String nombre, String primerApellido, String segundoApellido, String telefono, String correoE, String parentesco) {
		super(nombre, primerApellido, segundoApellido, telefono, correoE);
		this.parentesco = parentesco;
		RegistroPrestatarios.setSystemDate();
		this.ID = "RE"+RegistroPrestatarios.getSystemDateStringHour();
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
						+ telefono + "\nCorreo electronico: " + correoE 
				+ "\nPertenencias prestadas: \n";
		
		for(int i = 0; i < lendingLog.size(); i++){
			
			msj+="\t";
			msj+=lendingLog.get(i) + "\n";
		}
		return msj;
	}
	
	
	
	
	
	

}
