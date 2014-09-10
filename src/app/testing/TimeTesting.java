package app.testing;

import org.joda.time.DateTime; 
import org.joda.time.Days;
import java.lang.Math;

/**
 * 
 * @author Pedro Rodríguez de Oliveira
 * Método basado en http://www.leveluplunch.com/java/examples/number-of-days-between-two-dates/
 * Consiste en buscar diferencia de días entre las fechas insertadas.
 *
 */

public class TimeTesting {
	public static void main(String[] args){
		DateTime diaAntes = new DateTime(2014, 2, 1, 0, 0); // 1ro de febrero de 2014, 00:00
		
		DateTime diaHoy = new DateTime(); //Día de hoy
		diaHoy.plusDays(2);
		
		Days d = Days.daysBetween(diaHoy, diaAntes);
	    int days = Math.abs(d.getDays());
	    		
		System.out.println(days);
	}
}
