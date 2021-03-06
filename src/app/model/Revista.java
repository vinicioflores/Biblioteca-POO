package app.model;

public class Revista extends Pertenencia{

	String tematica;
	String periodoPublicacion;


	public Revista(String nombre, String imagen, int calificacion,
			String tematica, String periodoPublicacion) {
		super(nombre, imagen, calificacion);
		this.tematica = tematica;
		this.periodoPublicacion = periodoPublicacion;
		Biblioteca.setSystemDate();
		this.ID = "MA"+Biblioteca.getSystemDateStringHour();
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public String getPeriodoPublicacion() {
		return periodoPublicacion;
	}

	public void setPeriodoPublicacion(String periodoPublicacion) {
		this.periodoPublicacion = periodoPublicacion;
	}	
	public String getID(){
		return ID;
	}
	
	public void setID(String ID){
		this.ID = ID;
	}
	@Override
	public String toString() {
		String msj = "\nID: " + ID + "\nRevista: " + nombre + "\nTematica: " + tematica
				+ "\nPeriodo publicacion:" + periodoPublicacion + "\nPath de la imagen:"
				+ imagen + "\nCalificacion=" + calificacion
				+ "\nVeces prestado:" + vecesPrestado+ "\nEsta prestado?: " + isPrestado;
		
		msj += lendingLog.toString();
		
		return msj;
	}
}
