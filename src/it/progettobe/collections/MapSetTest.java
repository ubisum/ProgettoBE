package it.progettobe.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import it.progettobe.ereditarieta.Alunno;
import it.progettobe.ereditarieta.Insegnante;
import it.progettobe.ereditarieta.Persona;

public class MapSetTest 
{
	public static void main(String[]args)
	{
		/* creazione di una mappa */
		Map<String, Persona> mappaPersone = new HashMap<>();
		
		/* popolamento della mappa */
		for(int counter = 0; counter < 10; counter++)
		{
			/* generazione di un flag */
			boolean insegnanteStudente = RandomUtils.nextInt(0, 2) == 0;
			
			if(insegnanteStudente)
			{
				Insegnante insegnante = new Insegnante(RandomStringUtils.random(10, true, false).toUpperCase(), 
						                               RandomStringUtils.random(10, true, false).toUpperCase(), 
						                               RandomStringUtils.random(16, true, false).toUpperCase(), 
						                               RandomUtils.nextInt(18, 101), 
						                               RandomStringUtils.random(8, true, true).toUpperCase());
				
				mappaPersone.put(insegnante.getCodiceFiscale(), insegnante);
			}
			
			else
			{
				Alunno alunno = new Alunno(RandomStringUtils.random(10, true, false).toUpperCase(), 
						                   RandomStringUtils.random(10, true, false).toUpperCase(), 
						                   RandomStringUtils.random(16, true, false).toUpperCase(), 
						                   RandomUtils.nextInt(5, 25), 
						                   RandomUtils.nextInt(1, 10), 
						                   RandomUtils.nextInt(1, 10));
				
				mappaPersone.put(alunno.getCodiceFiscale(), alunno);
			}
		}
		
		/* stampa usando le chiavi */
//		for(String chiave : mappaPersone.keySet())
//		{
//			Persona persona = mappaPersone.get(chiave);
//			System.out.println("Nome: " + persona.getNome());
//			System.out.println("Cognome: " + persona.getCognome());
//			System.out.println("Ruolo: " + (persona instanceof Insegnante ? "Insegnante" : "Alunno"));
//			System.out.println("----------------------------------------\n");
//		}
		
		/* set */
		Set<Integer> setInteri = new HashSet<>();
		setInteri.add(35);
		setInteri.add(22);
		setInteri.add(89);
		
		System.out.println(setInteri);
		
		setInteri.add(18);
		
		System.out.println(setInteri);
		
		
	}
}
