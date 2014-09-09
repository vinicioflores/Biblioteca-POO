package app.jodatime;

import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.Days;
/**
 * 
 * @author Pedro Rodríguez de Oliveira
 * Test de librería con la cual se realizará todo lo referente al uso del tiempo.
 * Código basado en el siguiente link:
 * 			http://stackoverflow.com/questions/3299972/difference-in-days-between-two-dates-in-java.
 */

public class Testing {
	Date past = new Date(2010, 5, 20); // Junio 20th, 2010
	Date today = new Date(2014, 6, 24); // Julio 24th, 2014 
	int days = Days.daysBetween(new DateTime(past), new DateTime(today)).getDays(); // => 1495
}
