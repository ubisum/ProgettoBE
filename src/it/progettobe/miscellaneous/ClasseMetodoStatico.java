package it.progettobe.miscellaneous;

public class ClasseMetodoStatico {
	private static int contatore;

	public int getContatore() {
		return contatore;
	}

	public void setContatore(int contatore) {
		ClasseMetodoStatico.contatore = contatore;
	}
	
	public void incrementaContatore()
	{
		contatore++;
	}

}
