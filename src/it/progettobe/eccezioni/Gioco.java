package it.progettobe.eccezioni;

public class Gioco 
{
	public static int morraCinese(String primoGiocatore, String secondoGiocatore) throws CustomException
	{
		String[] listaMosse = {"S", "C", "F"};
		
		if(primoGiocatore == null || primoGiocatore.length() == 0 || secondoGiocatore == null || secondoGiocatore.length() == 0)
			throw new CustomException("Comandi non possono essere null o vuoti");
		
		/* controllo validita' primo comdando */
		boolean controlloComandi = false;
		for(String comando : listaMosse)
		{
			if(comando.equals(primoGiocatore))
			{
				controlloComandi = true;
				break;
			}
		}
		
		if(!controlloComandi)
			throw new CustomException("Il comando del primo giocatore non e' valido");
		
		/* controllo validita' secondo comando */
		controlloComandi = false;
		for(String comando : listaMosse)
		{
			if(comando.equals(secondoGiocatore))
			{
				controlloComandi = true;
				break;
			}
		}
		
		if(!controlloComandi)
			throw new CustomException("Il comando del secondo giocatore non e' valido");
		
		/* concatenazione dei comandi */
		String comandiConcatenati = primoGiocatore + secondoGiocatore;
		
		/* verifica del vincitore */
		switch(comandiConcatenati)
		{
			case "SF":
			case "CS":
			case "FC":
				return 1;
				
			case "SC":
			case "FS":
			case "CF":
				return 2;
				
			default:
				return 0;
				
		}
	}
}
