package app.model;

import java.util.ArrayList;

public class RegistroPrestatarios {
	private ArrayList<Prestatario> prestatarios;

	public RegistroPrestatarios() {
		super();
		prestatarios = new ArrayList<Prestatario>();
	}
	
	public void agregarPrestatario(Prestatario prestatario){
		prestatarios.add(prestatario);
	}
	
	
	public void guardar(){
		
	}
	
	public void cargar(){
		
	}
	
	

}
