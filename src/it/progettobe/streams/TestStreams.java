package it.progettobe.streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import it.progettobe.ereditarieta.Insegnante;

public class TestStreams
{
	public static void main(String args[])
	{
		// String test = "televisore";
		// System.out.println(test.compareTo("vacanza"));
		// System.out.println(test.compareTo("bottiglia"));

		List<String> listaStringhe = new ArrayList<String>();
		listaStringhe.add("Paperino");
		listaStringhe.add("Paperoga");
		listaStringhe.add("Zio Paperone");
		listaStringhe.add("Paperina");
		listaStringhe.add("Gastone");
		listaStringhe.add("Archimede"); 
		listaStringhe.add("Rockerduck");
		listaStringhe.add("Brigitta");
		listaStringhe.add("Nonna Papera");
		listaStringhe.add("Ciccio");
		listaStringhe.add("Dinamite Bla");

		List<String> inizioP = listaStringhe.stream().filter(s -> s.startsWith("P")).map(s -> s.toUpperCase()).collect(Collectors.toList());
//		 System.out.println(inizioP);

//		System.out.println(listaStringhe.stream().sorted().collect(Collectors.toList()));

		Insegnante p1 = new Insegnante("Paperino", "Paolino", "FHDJFHJDHFHJDFKJFHHSD", 80);
		Insegnante p2 = new Insegnante("Paperoga", "Duck", "JFHDJFDFJOEOELEELE", 75);
		Insegnante p3 = new Insegnante("Gastone", "Fortunello", "PPGFJGFGJFJGOFDJGOJF", 78);
		Insegnante p4 = new Insegnante("Paperina", "McDuck", "ETGFNDFOJEOEJRER", 65);

		List<Insegnante> listaPersone = new ArrayList<Insegnante>();
		listaPersone.add(p1);
		listaPersone.add(p2);
		listaPersone.add(p3);
		listaPersone.add(p4);

//		List<String> sorted = listaPersone.stream().sorted(Comparator.comparing(Insegnante::getCodiceFiscale)).map(p -> p.getCodiceFiscale()).collect(Collectors.toList());
//		System.out.println(sorted);
//		listaPersone.stream().sorted(Comparator.comparing(Insegnante::getCodiceFiscale)).map(p -> p.getCodiceFiscale()).forEach(System.out::println);
//		listaPersone.stream().sorted().map(p -> p.getCodiceFiscale()).forEach(System.out::println);

		Optional<String> InsegnanteTrovata = listaStringhe.stream().filter(s -> s.startsWith("X")).findFirst();
//		if(InsegnanteTrovata.isPresent())
//			System.out.println("La stringa e' stata trovata ed e' " + InsegnanteTrovata.get());
//
//		else
//			System.out.println("La stringa non e' stata trovata");
		
		/* reduce con interi */
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		int result = numbers.stream().reduce(0, (subtotal, element) -> subtotal + element);
		
//		System.out.println("Risultato reduce: " + result);
		
		/* reduce con stringhe */
		List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
		String resultString = letters.stream().reduce("", (partialString, element) -> partialString + element);
		
		System.out.println(resultString);
		

	}
}