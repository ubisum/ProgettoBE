package it.progettobe.test;

public class TestDecisionali
{
	public static void main(String[]args)
	{
		/* esempio semplice di IF-ELSE */
		String[] listaStringhe = {"aaa", "bbb", "ccc", "ddd", "eee"};
		for(String stringa : listaStringhe)
		{
			if(stringa.startsWith("a"))
				System.out.println(stringa.toUpperCase());

			else if(stringa.startsWith("c"))
				System.out.println(stringa + "_");

			else
				System.out.println(stringa);
		}

		/* Esempio di ricerca 1 */
		String stringaDaCercare = "ddd";
		boolean trovato = false; 
		for(String stringa : listaStringhe)
		{
			if(stringa.equals(stringaDaCercare))
			{
				trovato = true;
				break;
			}
		}

		System.out.println("Risultato ricerca 1: " + trovato);

		/* Esempio di ricerca 1 */
		trovato = false;
		for(String stringa : listaStringhe)
		{
			if(!stringa.equals(stringaDaCercare))
				continue;
		
				trovato = true;
				break;
		}

		System.out.println("Risultato ricerca 2: " + trovato);
	}
}