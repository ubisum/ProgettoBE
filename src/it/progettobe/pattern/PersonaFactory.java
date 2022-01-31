package it.progettobe.pattern;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import it.progettobe.ereditarieta.Alunno;
import it.progettobe.ereditarieta.Insegnante;
import it.progettobe.ereditarieta.Persona;

public class PersonaFactory 
{
	public static Persona getPersonaImplementation(PersonaEnum personaEnum)
	{
		switch(personaEnum)
		{
			case ALUNNO:
				return new Alunno();
				
			default:
				return new Insegnante(RandomStringUtils.random(10, true, false), RandomStringUtils.random(10, true, false), 
						              RandomStringUtils.random(16, true, true).toUpperCase(), RandomUtils.nextInt(18, 101));
		}
	}
}
