package it.progettobe.ereditarieta;

public class Alunno extends Persona 
{
	private int posizionePostoFila;
	private int posizionePostoColonna;
	
	public Alunno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alunno(String nome, String cognome, String codiceFiscale, int eta, int posizionePostoFila, int posizionePostoColonna) {
		super(nome, cognome, codiceFiscale, eta);
		
		this.posizionePostoFila = posizionePostoFila;
		this.posizionePostoColonna = posizionePostoColonna;
	}

	public int getPosizionePostoFila() {
		return posizionePostoFila;
	}

	public void setPosizionePostoFila(int posizionePostoFila) {
		this.posizionePostoFila = posizionePostoFila;
	}

	public int getPosizionePostoColonna() {
		return posizionePostoColonna;
	}

	public void setPosizionePostoColonna(int posizionePostoColonna) {
		this.posizionePostoColonna = posizionePostoColonna;
	}

	@Override
	public void stampaDatiAggiuntivi() {
		super.stampaInfo();
		System.out.println("\nDATI AGGIUNTIVI\nPosizione fila: " + this.posizionePostoFila + "\nPosizione colonna: " + this.posizionePostoColonna);
	}

}
