package app.model;

import org.joda.time.DateTime;

/**
 * Class Lending
 * Class in charge of showing the date the material was lent and by who.
 * Created on September 13, 2014
 * @author Pedro Rodríguez de Oliveira
 *
 */

public class Lending {
	private DateTime lendingDate;
	private Prestatario borrower;
	
	//Constructor with Borrower only.
	//Receives a Prestatario with the borrower and creates an object.
	public Lending(Prestatario pBorrower){
		setBorrower(pBorrower);
		setLendingDate();
	}
	//Constructor for all attributes.
	//Receives a Prestatario with the borrower plus a DateTime, with the lending date, and creates an object.
	public Lending(Prestatario pBorrower, DateTime pLendingDate){
		setBorrower(pBorrower);
		setLendingDate(pLendingDate);
	}
	//Getter for the borrower attribute.
	//Receives nothing and returns a Prestatario with the borrower.
	public Prestatario getBorrower(){
		return borrower;
	}
	//Setter for the borrower attribute.
	//Receives a Prestatario with the borrower and returns nothing.
	public void setBorrower(Prestatario borrower){
		this.borrower = borrower;
	}
	//Getter for the LendingDate attribute (DateTime).
	//Receives nothing and returns a DateTime with the lending date.
	public DateTime getLendingDate() {
		return lendingDate;
	}
	//Getter for the LendingDate attribute (String).
	//Receives nothing and returns a String with the lending date.	
	public String getLendingDateString() {
		return lendingDate.toString("dd/MM/yyyy");
	}
	//Setter for the LendingDate attribute.
	//Receives and returns nothing.
	public void setLendingDate(){
		this.lendingDate = new DateTime();
	}
	//Setter for the LendingDate attribute.
	//Receives a DateTime with the lending date and returns nothing.
	public void setLendingDate(DateTime lendingDate){
		this.lendingDate = lendingDate;
	}
	//toString method
	//Receives nothing and returns a String with the object information
	public String toString(){
		String msg;
		msg = "\t" + getBorrower().getNombre() + " " + getBorrower().getPrimerApellido() +
				" " + getBorrower().getSegundoApellido() + "\t" + getLendingDateString() +
				"\n";
		return msg;
	}
}