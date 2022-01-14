package it.progettobe.test;

import it.progettobe.eccezioni.CustomException;
import it.progettobe.eccezioni.Gioco;
import it.progettobe.libro.Libro;

public class TestEccezioniMultiple 
{
	public static void main(String[] args) 
	{
		try
		{
//			Libro libro = new Libro();
//			System.out.println(libro.getNome().toUpperCase());
			
//			Integer.parseInt("xxx");
			
//			int[] arrayInteri = new int[5];
//			System.out.println(arrayInteri[9]);
			
			switch(Gioco.morraCinese("X", "C"))
			{
				case 1: 
					System.out.println("Vince il primo giocatore");
					break;
					
				case 2:
					System.out.println("Vince il secondo giocatore");
					break;
					
				default:
					System.out.println("Pareggio");
			}

		}
		
		catch(NullPointerException npe)
		{
			System.out.println("Si e' verificata una NullPointerException");
		}
		
		catch(NumberFormatException nfe)
		{
			System.out.println("Si e' verificata una NumberFormatException");
		}
		
		catch(CustomException ce)
		{
			System.out.println("Si e' verificata una CustomException");
			ce.printStackTrace();
		}
		
		catch(Exception ex)
		{
			System.out.println("Si e' verificata un'eccezione generica: " + ex);
		}
		
		finally
		{
			System.out.println("Fine esecuzione");
		}
	}
}
