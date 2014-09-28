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
