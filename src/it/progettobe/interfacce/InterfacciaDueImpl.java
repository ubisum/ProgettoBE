package it.progettobe.interfacce;

public class InterfacciaDueImpl implements InterfacciaDue {

	@Override
	public void stampaInfoDue() {
		String[] elements = this.getClass().getName().split("\\.");
		System.out.println("STAMPA DUE della classe " + elements[elements.length - 1]);

	}

}
