package corepack;

public class Estudiante extends Persona {
	
	double carnet;
	String institucion = "";
	int grado = 0;         // 1: Escolar  2: Colegial  3: Universitario
	
	public Estudiante(int maxbooklim) { 
		super(maxbooklim);
	}

	public double getCarnet() {
		return carnet;
	}

	public void setCarnet(double carnet) {
		this.carnet = carnet;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}
	
	
}
