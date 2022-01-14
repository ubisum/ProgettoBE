package it.progettobe.interfacce;

public class InterfacciaUnoImpl implements InterfacciaUno {

	@Override
	public void stampaInfoUno() {
		String[] elements = this.getClass().getName().split("\\.");
		System.out.println("STAMPA UNO della classe " + elements[elements.length - 1]);

	}
}


