package it.progettobe.interfacce;

public class EstensioneClass extends AbstractClass {

	@Override
	public void stampaInfoUno() {
		String[] elements = this.getClass().getName().split("\\.");
		System.out.println("STAMPA UNO della classe " + elements[elements.length - 1]);

	}

	@Override
	public void stampaInfoDue() {
		String[] elements = this.getClass().getName().split("\\.");
		System.out.println("STAMPA DUE della classe " + elements[elements.length - 1]);

	}

	@Override
	public void stampaCombo() {
		stampaInfoUno();
		stampaInfoDue();

	}

}
