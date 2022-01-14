package it.progettobe.ereditarieta;

public abstract class Persona 
{
	private String nome;
	private String cognome;
	private String codiceFiscale;
	private int eta;
	
	public Persona(String nome, String cognome, String codiceFiscale, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		this.eta = eta;
	}
	
	public Persona() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public void stampaInfo()
	{
		String datiPersona = "Nome: " + this.nome + "\nCognome: " + this.cognome + "\nCodice fiscale: " + this.codiceFiscale +
				             "\nEta': " + this.eta;
		
		System.out.println(datiPersona);
	}
	
	public abstract void stampaDatiAggiuntivi();
	
}
