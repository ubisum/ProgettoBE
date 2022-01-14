package it.progettobe.miscellaneous;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestMiscellaneous {

	public static void main(String[] args) {
		/* esempio di variabile statica */
		ClasseMetodoStatico object1 = new ClasseMetodoStatico();
		System.out.println("Valore variabile statica 1: " + object1.getContatore());
		
		ClasseMetodoStatico object2 = new ClasseMetodoStatico();
		object2.incrementaContatore();
		System.out.println("Valore variabile statica 2: " + object2.getContatore());
//		
		System.out.println("Valore variabile statica 1: " + object1.getContatore());
		
		System.out.println("\n--------------------------------------------------\n");
		
		/* preincremento e postincremento */
		int number = 10;
		
		System.out.println("Stampa con preincremento: " + ++number);
		System.out.println("Stampa con postincremento: " + number++);
		
		System.out.println("Valore finale: " + number);
		
		System.out.println("\n--------------------------------------------------\n");
		
		
		/* trasformare una data in una stringa con un formato specificato */
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		Date today = new Date(); // crea un oggetto con la data corrente
		
//		System.out.println(formatter.format(today));
		
		/* costruire una data a partire da una stringa in un formato specifico */
		String formatoData = "25-04-2021 12:15";
		Date formattedDate = null;
		try {
			formattedDate = formatter.parse(formatoData);
//			System.out.println(formattedDate.toString());
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Calendar c = Calendar.getInstance();
		c.setTime(today);
		c.add(Calendar.DATE, 10);  // esempio di aggiunta di dieci giorni
		System.out.println(formatter.format(c.getTime()));
		

	}

}
