package app.model;

import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Pertenencia> pertenencias;
	int diasBase;
	int diasTolerancia;
	int topX;
	int tiempoBusquedaMeses;
	int cantidasVecesBusqueda;
	
	
	
	public Biblioteca() {
		super();
		this.pertenencias = new ArrayList<Pertenencia>();
		this.diasBase = 30;
		this.diasTolerancia = 10;
		this.topX = 10;
		this.tiempoBusquedaMeses = 3;
		this.cantidasVecesBusqueda = 2;
	}
	
	public void agregarNuevaPertenencia(Pertenencia pertenencia){
		pertenencias.add(pertenencia);
	}
	 
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
