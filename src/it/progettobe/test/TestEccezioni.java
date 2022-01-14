package it.progettobe.test;

import it.progettobe.libro.Libro;

public class TestEccezioni {

	public static void main(String[] args) 
	{
		Libro libro = new Libro();
		System.out.println(libro.getNome().toUpperCase());
		
		System.out.println("Fine main");

	}

}
