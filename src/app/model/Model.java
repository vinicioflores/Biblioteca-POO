package app.model;

import org.joda.time.DateTime;

public class Model {
	
	private Biblioteca biblioteca;
	private RegistroPrestatarios prestatarios;
	
	
	
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

}
