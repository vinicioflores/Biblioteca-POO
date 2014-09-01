package corepack;

class Familiar extends Persona {

	private String parentesco = "";
	private int edad = 0;
	public static int STD_EDAD = 15;
	
	public Familiar(int maxbooks) {
		super(maxbooks);
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
