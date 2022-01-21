package it.progettobe.generics;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;

import it.progettobe.ereditarieta.Insegnante;
import it.progettobe.ereditarieta.Persona;

public class TestGenerics {

	public static void main(String[] args) throws Exception 
	{
		/* creazione classe generica */
		ClasseGenerica<String> genericaString = new ClasseGenerica<>();
		genericaString.setCampoGenerico("fjkfjfjeo");
		
		ClasseGenerica<Integer> genericaInteger = new ClasseGenerica<>();
		genericaInteger.setCampoGenerico(45);
		
//		genericaString.controllaTipo();
//		genericaInteger.controllaTipo();
//		
//		genericaInteger.concatenaSomma(50);
//		genericaString.concatenaSomma("test");
//		
//		genericaString.metodoAltroGenerico("ciao");
//		genericaString.metodoAltroGenerico(34);
		
		/* classe non generica */
//		ClasseNonGenerica nonGenerica = new ClasseNonGenerica();
//		nonGenerica.metodoGenerico("yrlfnd");
//		
//		/* classe con upper bound */
//		ClasseUpperbound<Persona> upper = new ClasseUpperbound<>();
//		ClasseUpperbound<Insegnante> upper2 = new ClasseUpperbound<>();
//				
//		
//		String[] elem1 = {"23", "st6", "lk12", "72"}; 
//		StringImplementation strImpl = new StringImplementation(elem1);
//		
//		Integer[] elem2 = {5, 10}; 
//		IntegerImplementation intImpl = new IntegerImplementation(elem2);
//		
//		intImpl.addElements(strImpl);
//		
//		for(int index = 0; index < intImpl.getElements().length; index++)
//		{
//			System.out.println("Elemento " + index + ": " + intImpl.getElements()[index]);
//		}
		
		String testString = "jdjoedoejde";
//		if(testString != null && !testString.equals(""))
//			System.out.println("Stringa non vuota e non nulla");
		
		if(StringUtils.isNotBlank(testString))
			System.out.println("Stringa non vuota e non nulla");
		
		int randomInt = RandomUtils.nextInt(0, 101);
		System.out.println(randomInt);
		
		String randomString = RandomStringUtils.random(16, true, true).toUpperCase();
		System.out.println(randomString);
	}

}
