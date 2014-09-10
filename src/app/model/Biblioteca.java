package app.model;

import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Libro> libros;
	int diasBase;
	int diasTolerancia;
	int diasAdvertencia;
	int topX;
	int tiempoBusquedaMeses;
	int cantidasVecesBusqueda;
	
	
	
	public Biblioteca() {
		super();
		this.libros = new ArrayList<Libro>();
		this.diasBase = 30;
		this.diasTolerancia = 10;
		this.diasAdvertencia = 10;
		this.topX = 10;
		this.tiempoBusquedaMeses = 3;
		this.cantidasVecesBusqueda = 2;
	}
	 
	ArrayList<Libro> buscarLibrosPorAutor(String autor){
		ArrayList<Libro> matches = new ArrayList<Libro>();
		for (int i = 0; i < libros.size(); i++){
			if(libros.get(i).getAutor().equals(autor)){
				matches.add(libros.get(i));				
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
	public int getDiasAdvertencia() {
		return diasAdvertencia;
	}
	public void setDiasAdvertencia(int diasAdvertencia) {
		this.diasAdvertencia = diasAdvertencia;
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
	public ArrayList getPertenencias() {
		return pertenencias;
	}
	
	

}
