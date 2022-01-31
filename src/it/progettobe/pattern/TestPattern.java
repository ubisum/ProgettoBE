package it.progettobe.pattern;

import it.progettobe.ereditarieta.Alunno;
import it.progettobe.ereditarieta.Persona;

public class TestPattern 
{
	public static String controlloTipo(Persona persona)
	{
		if(persona instanceof Alunno)
			return "Alunno";
		
		else
			return "Insegnante";
	}
	
	public static void main(String[] args)
	{
		Persona persona1 = PersonaFactory.getPersonaImplementation(PersonaEnum.ALUNNO);
		Persona persona2 = PersonaFactory.getPersonaImplementation(PersonaEnum.INSEGNANTE);
		
		System.out.println(controlloTipo(persona1));
		System.out.println(controlloTipo(persona2));
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
	}
}
