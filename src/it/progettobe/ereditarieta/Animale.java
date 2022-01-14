package it.progettobe.ereditarieta;

public class Animale 
{
	private String verso;
	private int numeroZampe;
	private String nome;
	
	public Animale(String verso, int numeroZampe, String nome) {
		this.verso = verso;
		this.numeroZampe = numeroZampe;
		this.nome = nome;
	}

	public String getVerso() {
		return verso;
	}

	public void setVerso(String verso) {
		this.verso = verso;
	}

	public int getNumeroZampe() {
		return numeroZampe;
	}

	public void setNumeroZampe(int numeroZampe) {
		this.numeroZampe = numeroZampe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void stampaInfo()
	{
		System.out.println("Stampa dalla classe madre\n");
		String info = "Nome dell'animale: " + this.nome + "\nVerso dell'animale: " + this.verso + "\nNumero zampe dell'animale: " + 
		              this.numeroZampe;
		
		System.out.println(info);
		
	}
}
