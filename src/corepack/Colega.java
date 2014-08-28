package corepack;

public class Colega extends Persona {
	
	int nivelAmistad;    // Puntaje entero para clasificar al colega por cercanía amistosa
	String domicilio;
	
	public Colega(int maxbooklim) {
		super(maxbooklim);
	}

	public int getNivelAmistad() {
		return nivelAmistad;
	}

	public void setNivelAmistad(int nivelAmistad) {
		this.nivelAmistad = nivelAmistad;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
}
