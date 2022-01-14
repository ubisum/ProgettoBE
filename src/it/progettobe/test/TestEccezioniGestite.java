package it.progettobe.test;

import it.progettobe.eccezioni.Gioco;
import it.progettobe.libro.Libro;

public class TestEccezioniGestite {

	public static void main(String[] args) {
		try
		{
			Libro libro = new Libro();
			libro.setNome("L'isola del tesoro");
			System.out.println(libro.getNome().toUpperCase());
			
			Gioco.morraCinese("S", "C");
		}
		
		catch(Exception ex)
		{
			System.out.println("Si e' verificata un'eccezione: " + ex.getMessage());
		}
		
		/* opzionale */
		finally
		{
			System.out.println("Fine main");
		}

	}

}
