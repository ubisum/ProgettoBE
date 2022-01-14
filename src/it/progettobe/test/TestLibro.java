package it.progettobe.test;

import it.progettobe.libro.Libro;

public class TestLibro
{
	public static void main(String[] args)
	{
		Libro promessiSposi = new Libro();
		
		promessiSposi.setNome("Promessi Sposi");
		promessiSposi.setAnno(1827);
		promessiSposi.setAutore("Alessandro Manzoni");
		promessiSposi.setIsbn("978-8854165519");
		promessiSposi.setPrezzo(15);
		
		System.out.println(promessiSposi.getNome());
	}
}