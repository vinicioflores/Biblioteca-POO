package app.model;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class Model {
	
	private Biblioteca biblioteca;
	private RegistroPrestatarios prestatarios;
	private ArrayList<Pertenencia> tempSearch;
	
	public Model() {
		super();
		this.biblioteca = new Biblioteca();
		this.prestatarios = new RegistroPrestatarios();
	}
	public void addBelonging(Pertenencia belonging){
		biblioteca.agregarNuevaPertenencia(belonging);
	}
	public void addBorrower(Prestatario borrower){
		prestatarios.agregarPrestatario(borrower);
	}
	public int getNumberLentBelongings(){
		return biblioteca.getNumberOfLendedBelongings();
	}
	public DateTime getCurrentSystemDate(){
		return biblioteca.getSystemDate();
	}
	public int totalBelongings(){
		return biblioteca.totalBelongings();
	}
	public Biblioteca getBiblioteca() {
		return biblioteca;
	}
	public RegistroPrestatarios getPrestatarios() {
		return prestatarios;
	}
	public ArrayList<Pertenencia> getTempSearch() {
		return tempSearch;
	}
	public void setTempSearch(ArrayList<Pertenencia> tempSearch) {
		this.tempSearch = tempSearch;
	}
	

}
