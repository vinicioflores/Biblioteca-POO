package corepack;


public class Colega extends Persona {
	
	private int nivelAmistad;    // Puntaje entero para clasificar al colega por cercanía amistosa
	private String domicilio;
	public static int STD_NIVEL = 5;
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
