package it.progettobe.libro;

public class Libro
{
	private String nome; 
	private String autore;
	private int anno;
	private String isbn; 
	private int prezzo;

	public Libro(){}

	public Libro(String nome, String autore)
	{
		this.nome = nome;
		this.autore = autore;
	}

	public Libro(String nome, String autore, int anno)
	{
		this.nome = nome;
		this.autore = autore;
		this.anno = anno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	
	
}