package app.model;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class Model {
	
	private Biblioteca biblioteca;
	private RegistroPrestatarios prestatarios;
	private ArrayList<Pertenencia> tempSearch;
	private Pertenencia belongingToEdit;
	final String pathLibrary = "src/xml/library.xml";
	final String pathRegistry = "src/xml/borrowerRegistry.xml";
	
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
	public String getPathLibrary(){
		return pathLibrary;
	}
	public String getPathRegistry(){
		return pathRegistry;
	}
	public Biblioteca getBiblioteca() {
		return biblioteca;
	}
	public void setBiblioteca(Biblioteca biblioteca){
		this.biblioteca = biblioteca;
	}
	public RegistroPrestatarios getPrestatarios() {
		return prestatarios;
	}
	public void setPrestatarios(RegistroPrestatarios registry){
		this.prestatarios = registry;
	}
	public ArrayList<Pertenencia> getTempSearch() {
		return tempSearch;
	}
	public void setTempSearch(ArrayList<Pertenencia> tempSearch) {
		this.tempSearch = tempSearch;
	}
	public Pertenencia getBelongingToEdit() {
		return belongingToEdit;
	}
	public void setBelongingToEdit(Pertenencia belongingToEdit) {
		this.belongingToEdit = belongingToEdit;
	}
	

}
