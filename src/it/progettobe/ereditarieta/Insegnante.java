package it.progettobe.ereditarieta;

public class Insegnante extends Persona {
	private String matricola; 
	
	public Insegnante(String nome, String cognome, String codiceFiscale, int eta, String matricola)
	{
		super(nome, cognome, codiceFiscale, eta);
		this.matricola = matricola;
	}
	
	public Insegnante(String nome, String cognome, String codiceFiscale, int eta)
	{
		super(nome, cognome, codiceFiscale, eta);
	}
	
	@Override
	public void stampaDatiAggiuntivi() {
		super.stampaInfo();
		System.out.println("\nDATI AGGIUNTIVI \nMatricola: " + this.matricola);

	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	

}

