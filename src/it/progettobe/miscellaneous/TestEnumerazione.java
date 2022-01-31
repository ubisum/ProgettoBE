package it.progettobe.miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestEnumerazione {
	
	public static String controllaNano(SetteNaniEnumeration nanoEnum)
	{
		switch(nanoEnum)
		{
			case BRONTOLO:
				return "Brontola sempre";
				
			case CUCCIOLO:
				return "Vuole sempre carezze";

			case DOTTO:
				return "Sta sempre a studiare";
				
			case EOLO:
				return "Starnuntisce con forza";
				
			case GONGOLO:
				return "E' sempre felice";
				
			case MAMMOLO:
				return "Vuole sempre la mamma";
				
			default:
				return "Dorme sempre";
			
		}
	}
	
	public static void main(String args[])
	{
		/* uso del valore dell'enumerazione */
		SetteNaniEnumeration testEnum = SetteNaniEnumeration.EOLO;
//		System.out.println(controllaNano(testEnum));
		
		/* tutti i valori di una enumerazione */
		List<String> valori = Arrays.asList(SetteNaniEnumeration.values()).stream().map(n -> n.getNano()).sorted().collect(Collectors.toList());
		for(String nano : valori)
			System.out.println(nano);
	}

}
