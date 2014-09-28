package app.model;

import java.util.ArrayList;   

import org.joda.time.DateTime;
import org.joda.time.Days;

import app.model.Pertenencia;

public class Biblioteca {
	
	private ArrayList<Pertenencia> pertenencias;
	private int diasBase;
	private int diasTolerancia;
	private int topX;
	private int tiempoBusquedaMeses;
	private int cantidasVecesBusqueda;
	private DateTime systemDate;
	
	public Biblioteca() {
		super();
		this.pertenencias = new ArrayList<Pertenencia>();
		this.diasBase = 30;
		this.diasTolerancia = 10;
		this.topX = 10;
		this.tiempoBusquedaMeses = 3;
		this.cantidasVecesBusqueda = 2;
		setSystemDate();
	}
	
	public int totalBelongings(){
		return pertenencias.size();
	}
	
	public void agregarNuevaPertenencia(Pertenencia pertenencia){
		pertenencias.add(pertenencia);
	}
	 	
	public int getNumberOfLendedBelongings(){
		int cnt = 0;
		for(int i = 0; i < pertenencias.size();i++){
			if(pertenencias.get(i).isPrestado == true){
				cnt++;
			}
		}
		return cnt;
	}
	public ArrayList<Pertenencia> searchAllBooks(){
		ArrayList<Pertenencia> matches = new ArrayList<Pertenencia>();
		for (int i = 0; i < pertenencias.size(); i++){
			if (pertenencias.get(i) instanceof Libro)
			{
				
					matches.add(pertenencias.get(i));
				
			}
			
		}
		return matches;
	}
	public ArrayList<Pertenencia> searchAllMovies(){
		ArrayList<Pertenencia> matches = new ArrayList<Pertenencia>();
		for (int i = 0; i < pertenencias.size(); i++){
			if (pertenencias.get(i) instanceof Pelicula)
			{
				
					matches.add(pertenencias.get(i));
				
			}
			
		}
		return matches;
	}
	
	public ArrayList<Pertenencia> searchAllMagazines(){
		ArrayList<Pertenencia> matches = new ArrayList<Pertenencia>();
		for (int i = 0; i < pertenencias.size(); i++){
			if (pertenencias.get(i) instanceof Revista)
			{
				
					matches.add(pertenencias.get(i));
				
			}
			
		}
		return matches;
	}
	public ArrayList<Pertenencia> searchBorrowedBooks(){
		ArrayList<Pertenencia> matches = new ArrayList<Pertenencia>();
		for (int i = 0; i < pertenencias.size(); i++){
			if (pertenencias.get(i) instanceof Libro)
			{
				if (pertenencias.get(i).isPrestado){
					matches.add(pertenencias.get(i));
				}
			}
			
		}
		return matches;
	}
	
	public ArrayList<Pertenencia> searchBorrowedMovies(){
		ArrayList<Pertenencia> matches = new ArrayList<Pertenencia>();
		for (int i = 0; i < pertenencias.size(); i++){
			if (pertenencias.get(i) instanceof Pelicula)
			{
				if (pertenencias.get(i).isPrestado){
					matches.add(pertenencias.get(i));
				}
			}
			
		}
		return matches;
	}
	
	public ArrayList<Pertenencia> searchBorrowedMagazines(){
		ArrayList<Pertenencia> matches = new ArrayList<Pertenencia>();
		for (int i = 0; i < pertenencias.size(); i++){
			if (pertenencias.get(i) instanceof Revista)
			{
				if (pertenencias.get(i).isPrestado){
					matches.add(pertenencias.get(i));
				}
			}
			
		}
		return matches;
	}
	//-----------------------------------------------------------
	//Search by ID
	//-----------------------------------------------------------
	public ArrayList<Pertenencia> searchContentByID(String ID){
		ArrayList<Pertenencia> matches = new ArrayList<Pertenencia>();
		for (int i = 0; i < pertenencias.size(); i++){
			if (pertenencias.get(i).getID() == ID){
				matches.add(pertenencias.get(i));
			}
		}
		return matches;
	}
	
	//-----------------------------------------------------------
	// Search by Books
	//-----------------------------------------------------------
	//Title
	public ArrayList<Libro> buscarLibrosPorTitulo(String titulo){
		ArrayList<Libro> matches = new ArrayList<Libro>();
		for (int i = 0; i < pertenencias.size(); i++){
			if (pertenencias.get(i) instanceof Libro){
				if( ((Libro)pertenencias.get(i)).getNombre().equals(titulo) ){
					matches.add( ((Libro)pertenencias.get(i)));
				}
			}
		}
		return matches;
	}

	//Author
	public ArrayList<Libro> buscarLibrosPorAutor(String autor){
		
		ArrayList<Libro> matches = new ArrayList<Libro>();
		for (int i = 0; i < pertenencias.size(); i++){
			
			if (pertenencias.get(i) instanceof Libro){
				
				if( ((Libro)pertenencias.get(i)).getAutor().equals(autor) ){
					
					matches.add( ((Libro)pertenencias.get(i)));
				}
			}
		}
		return matches;
	}
	
	//Editorial
	public ArrayList<Libro> buscarLibrosPorEditorial(String editorial){
		ArrayList<Libro> matches = new ArrayList<Libro>();
		for (int i = 0; i < pertenencias.size(); i++){

			if (pertenencias.get(i) instanceof Libro){

				if( ((Libro)pertenencias.get(i)).getEditorial().equals(editorial) ){

					matches.add( ((Libro)pertenencias.get(i)));
				}
			}
		}
		return matches;
	}

	//-----------------------------------------------------------
	//  Search by Magazines
	//-----------------------------------------------------------

	//Title
	public ArrayList<Revista> buscarRevistasPorTitulo(String titulo){
		ArrayList<Revista> matches = new ArrayList<Revista>();
		for (int i = 0; i < pertenencias.size(); i++){

			if (pertenencias.get(i) instanceof Revista){

				if( ((Revista)pertenencias.get(i)).getNombre().equals(titulo) ){

					matches.add( ((Revista)pertenencias.get(i)));
				}
			}
		}
		return matches;
	}

	//Theme
	public ArrayList<Revista> buscarRevistasPorTematica(String tematica){
		ArrayList<Revista> matches = new ArrayList<Revista>();
		for (int i = 0; i < pertenencias.size(); i++){

			if (pertenencias.get(i) instanceof Revista){

				if( ((Revista)pertenencias.get(i)).getTematica().equals(tematica) ){

					matches.add( ((Revista)pertenencias.get(i)));
				}
			}
		}
		return matches;
	}

	//-----------------------------------------------------------
	//  Movie
	//-----------------------------------------------------------

	//Title
	public ArrayList<Pelicula> buscarPeliculasPorTitulo(String titulo){
		ArrayList<Pelicula> matches = new ArrayList<Pelicula>();
		for (int i = 0; i < pertenencias.size(); i++){

			if (pertenencias.get(i) instanceof Pelicula){

				if( ((Pelicula)pertenencias.get(i)).getNombre().equals(titulo) ){

					matches.add( ((Pelicula)pertenencias.get(i)));
				}
			}
		}
		return matches;
	}

	//Genre
	public ArrayList<Pelicula> buscarPeliculasPorGenero(String genero){
		ArrayList<Pelicula> matches = new ArrayList<Pelicula>();
		for (int i = 0; i < pertenencias.size(); i++){

			if (pertenencias.get(i) instanceof Pelicula){

				if( ((Pelicula)pertenencias.get(i)).getGenero().equals(genero) ){

					matches.add( ((Pelicula)pertenencias.get(i)));
				}
			}
		}
		return matches;
	}

	//Director
	public ArrayList<Pelicula> buscarPeliculasPorDirector(String director){
		ArrayList<Pelicula> matches = new ArrayList<Pelicula>();
		for (int i = 0; i < pertenencias.size(); i++){

			if (pertenencias.get(i) instanceof Pelicula){

				if( ((Pelicula)pertenencias.get(i)).getDirector().equals(director) ){

					matches.add( ((Pelicula)pertenencias.get(i)));
				}
			}
		}
		return matches;
	}
	//Lower element of ArrayList<Pertenencia>
	//Receives an ArrayList<Pertenencia> y returns index of least rented material from list
	private int indexLowerElement(ArrayList<Pertenencia> top){
		int index = 0;
		int lowerElem = top.get(0).getVecesPrestado(); 
		for (int i = 1; i < top.size(); i++){
			if (lowerElem > top.get(i).getVecesPrestado()){
				index = i;
				lowerElem = top.get(i).getVecesPrestado();
			}
		}
		return index;
	}
	
	//Orders top X in descending order.
	//Receives ArrayList<Pertenencia> y returns same ArrayList<Pertenencia> ordered in descending order according to rented times.
	private ArrayList<Pertenencia> order(ArrayList<Pertenencia> list){
		int indexHigherElem = 0;
		ArrayList<Pertenencia> modifiedTop = new ArrayList<Pertenencia>();
		while(list.size() != 1){
			indexHigherElem = 0;
			for(int j = 1; j < list.size(); j++){
				if (list.get(indexHigherElem).getVecesPrestado() < list.get(j).getVecesPrestado()){
					indexHigherElem = j;
				}
			}
			modifiedTop.add(list.get(indexHigherElem));
			list.remove(indexHigherElem);
		}
		modifiedTop.add(list.get(0));
		return modifiedTop;
	}	
	
	//Top X
	//It doesn't receive parameters and returns an ArrayList<Pertenencias> as an top X
	public ArrayList<Pertenencia> topX(){
		ArrayList<Pertenencia> top = new ArrayList<Pertenencia>();
		int listelem = 0;
		int index;
		for(int i = 0; i < pertenencias.size(); i++){
			if (listelem != getTopX()){
				top.add(pertenencias.get(i));
				listelem++;
			}
			else{
				index = indexLowerElement(top);
				if (top.get(index).getVecesPrestado() < pertenencias.get(i).getVecesPrestado()){
					top.remove(index);
					top.add(pertenencias.get(i));
				}
			}
		}
		top = order(top);
		return top;
	}
	
	//Special search function: Looks for material which was lent X times on the recent Y months, being X and Y modifiable parameters.
	//Receives two integers indicating the time the books were lent and the quantity of latter months user wishes to consult and re-
	//turns an ArrayList<Pertenencia> with the list of books.
	public ArrayList<Pertenencia> specialSearch(int timesLent, int monthsToConsult){
		ArrayList<Pertenencia> specialList = new ArrayList<Pertenencia>();
		int daysDifference = Days.daysBetween(getSystemDate().minusMonths(monthsToConsult), getSystemDate()).getDays();
		int counter;
		int quantityLendings;
		int fecha1;
		for(int i = 0; i < pertenencias.size(); i++){
			counter = 0;
			quantityLendings = 0;
			while (counter < pertenencias.get(i).getLendingLog().size()){
				fecha1 = Days.daysBetween(pertenencias.get(i).getLendingLog().get(counter).getLendingDate(), getSystemDate()).getDays();
				if (fecha1 < daysDifference){
					quantityLendings++;
				}
				counter++;
			}
			if (quantityLendings >= timesLent){
				specialList.add(pertenencias.get(i));
			}
		}
		return specialList;
	}
	public int getDiasBase() {
		return diasBase;
	}
	public void setDiasBase(int diasBase) {
		this.diasBase = diasBase;
	}
	public int getDiasTolerancia() {
		return diasTolerancia;
	}
	public void setDiasTolerancia(int diasTolerancia) {
		this.diasTolerancia = diasTolerancia;
	}
	public int getTopX() {
		return topX;
	}
	public void setTopX(int topX) {
		this.topX = topX;
	}
	public int getTiempoBusquedaMeses() {
		return tiempoBusquedaMeses;
	}
	public void setTiempoBusquedaMeses(int tiempoBusquedaMeses) {
		this.tiempoBusquedaMeses = tiempoBusquedaMeses;
	}
	public int getCantidasVecesBusqueda() {
		return cantidasVecesBusqueda;
	}
	public void setCantidasVecesBusqueda(int cantidasVecesBusqueda) {
		this.cantidasVecesBusqueda = cantidasVecesBusqueda;
	}
	public ArrayList<Pertenencia> getPertenencias() {
		return pertenencias;
	}
	//Getter for the systemDate attribute.
	//Receives nothing and returns a String indicating the date the system is working.
	public String getSystemDateString(){
		return systemDate.toString("dd/MM/yyyy");
	}
	//Getter for the systemDate attribute.
	//Receives nothing and returns a String indicating the date the system is working.
	public DateTime getSystemDate(){
		return systemDate;
	}
	//Setter for the systemDate attribute.
	//Receives and returns nothing.
	public void setSystemDate(){
		this.systemDate = new DateTime();
	}
	//Setter for the systemDate attribute.
	//Receives a DateTime with the system date and returns nothing.
	public void setSystemDate(DateTime systemDate){
		this.systemDate = systemDate;
	}
	
	@Override
	public String toString() {
		String msj;
		msj = "Pertenencias en Biblioteca: \n";
		for(int i = 0; i < pertenencias.size(); i++){
			if(pertenencias.get(i) instanceof Libro){
				
				msj += ((Libro)pertenencias.get(i)).toString() + "\n";
				
			}
			else if(pertenencias.get(i) instanceof Revista){
				
				msj += ((Revista)pertenencias.get(i)).toString() + "\n";
				
			}
			else if(pertenencias.get(i) instanceof Pelicula){
				
				msj += ((Pelicula)pertenencias.get(i)).toString() + "\n";
				
			}
			
		}
		return msj;
	}
}
