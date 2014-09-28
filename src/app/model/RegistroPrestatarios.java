package app.model;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class RegistroPrestatarios {
	private ArrayList<Prestatario> prestatarios;
	private static DateTime systemDate;

	public RegistroPrestatarios() {
		super();
		prestatarios = new ArrayList<Prestatario>();
	}
	
	public void agregarPrestatario(Prestatario prestatario){
		prestatarios.add(prestatario);
	}
	
	public void deleteBorrower(String toCompare){
		boolean isEqual = false;
		int i = 0;
		while (!isEqual){
			if (i == prestatarios.size()){
				isEqual = true;
			}else{
				if (prestatarios.get(i).getID().compareTo(toCompare) == 0){
					prestatarios.remove(i);
					isEqual = true;
				}else{
					i++;
				}
			}
		}
	}
	private void orderingNewBorrower(Prestatario borrower){
		boolean inserted = false;
		int i = 0;
		while(!inserted){
			if (i >= prestatarios.size()){
				prestatarios.add(i,borrower);
				inserted = true;
			}
			else{
				if (prestatarios.get(i).getNombre().compareToIgnoreCase(borrower.getNombre()) > 0){
					prestatarios.add(i,borrower);
					inserted = true;
				} else if (prestatarios.get(i).getNombre().compareToIgnoreCase(borrower.getNombre()) == 0){ //In case names are the same
					if (prestatarios.get(i).getPrimerApellido().compareToIgnoreCase(borrower.getPrimerApellido()) > 0){
						prestatarios.add(i,borrower);
						inserted = true;
					} else if (prestatarios.get(i).getPrimerApellido().compareToIgnoreCase(borrower.getPrimerApellido()) == 0){ //In case FN's are the same
						if (prestatarios.get(i).getSegundoApellido().compareToIgnoreCase(borrower.getSegundoApellido()) > 0){
							prestatarios.add(i,borrower);
							inserted = true;
						} else {
							i++;
						}
					} else {
						i++;
					}
				} else {
					i++;
				}
			}
		}
	}
	public ArrayList<Prestatario> getPrestatarios(){
		return prestatarios;
	}
	
	//Getter for the systemDate attribute.
	//Receives nothing and returns a String indicating the date the system is working.
	public static String getSystemDateString(){
		return systemDate.toString("dd/MM/yyyy");
	}
	//Getter for the systemDate attribute.
	//Receives nothing and returns a String indicating the date the system is working, plus the hour.
	public static String getSystemDateStringHour(){
		return systemDate.toString("(dd/MM/yyyy_hh:mm:ss)");
	}
	//Getter for the systemDate attribute.
	//Receives nothing and returns a String indicating the date the system is working.
	public static DateTime getSystemDate(){
		return systemDate;
	}
	//Setter for the systemDate attribute.
	//Receives and returns nothing.
	public static void setSystemDate(){
		RegistroPrestatarios.systemDate = new DateTime();
	}
	//Setter for the systemDate attribute.
	//Receives a DateTime with the system date and returns nothing.
	public static void setSystemDate(DateTime systemDate){
		RegistroPrestatarios.systemDate = systemDate;
	}
}
