package app.model;

import java.util.ArrayList; 

import org.joda.time.DateTime;

import app.model.Lending;

public class Pertenencia {
	
	String nombre;
	String imagen;
	int calificacion;
	int vecesPrestado;
	Prestatario prestatario;
	String ID;
	boolean isPrestado = false;
	DateTime fechaUltimoPrestamo; 
	ArrayList<Lending> lendingLog;
	
	public Pertenencia(String nombre, String imagen, int calificacion) {
		super();
		this.nombre = nombre;
		this.imagen = imagen;
		this.calificacion = calificacion;
		this.lendingLog = new ArrayList<Lending>();
	}

	public boolean isPrestado() {
		return isPrestado;
	}

	public void devolver() {
		this.isPrestado = false;
	}
	
	public void prestar() {
		this.isPrestado = true;
	}

	public DateTime getFechaUltimoPrestamo() {
		return fechaUltimoPrestamo;
	}
	
	public String getFechaUltimoPrestamoString() {
		return fechaUltimoPrestamo.toString("dd/MM/yyyy");
	}

	public void setFechaUltimoPrestamo(DateTime fechaUltimoPrestamo) {
		this.fechaUltimoPrestamo = fechaUltimoPrestamo;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	public boolean getIsPrestado(){
		return isPrestado;
	}
	public void setIsPrestado(boolean isPrestado){
		this.isPrestado = isPrestado;
	}
	public int getVecesPrestado() {
		return vecesPrestado;
	}

	public void setVecesPrestado(int vecesPrestado) {
		this.vecesPrestado = vecesPrestado;
	}

	public Prestatario getPrestatario() {
		return prestatario;
	}

	public void setPrestatario(Prestatario prestatario) {
		this.prestatario = prestatario;
	}
	//Getter for the lendingLog attribute.
	//Receives nothing and returns an ArrayList<Lending> with the lending history.
	public ArrayList<Lending> getLendingLog(){
		return lendingLog;
	}
	//Getter for the lendingLog attribute. Works like a toString() function.
	//Receives nothing and returns a String with the lending history.
	public String getLendingLogString(){
		String msg;
		msg = "\tBorrower \t                Lending date \n";
		for(int i = 0; i < lendingLog.size(); i++){
			msg += lendingLog.get(i).toString();
		}
		return msg;
	}
	public String getID(){
		return ID;
	}
}
