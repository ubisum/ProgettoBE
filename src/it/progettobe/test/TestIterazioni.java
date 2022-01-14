package it.progettobe.test;

public class TestIterazioni
{
	public static void main(String[]args)
	{
		String[] listaStringhe = {"aaa", "bbb", "ccc", "ddd", "eee"};

		/* utilizzo WHILE */
		int index = 0;
		System.out.println("Esecuzione con WHILE:");
		while(index < listaStringhe.length) /* condizione uscita */
		{
			System.out.println(listaStringhe[index]);
			index++;
		}

		/* utilizzo FOR */
		System.out.println("\nEsecuzione con FOR:");
		for(int indexFor = 0; indexFor<listaStringhe.length; indexFor++)
			System.out.println(listaStringhe[indexFor].toUpperCase());

		/* utilizzo FOR EACH */
		System.out.println("\nEsecuzione con FOR EACH:");
		for(String stringa : listaStringhe)
			System.out.println(stringa + "_");

		/** DO-WHILE **/

	}
}