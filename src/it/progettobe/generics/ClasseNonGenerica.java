package it.progettobe.generics;

public class ClasseNonGenerica {
	public <T> void metodoGenerico(T param)
	{
		System.out.println("Questo e' un metodo generico in un a classe non generica");
		if(param instanceof String)
			System.out.println("La tipologia del parametro e' string");
	}
}
