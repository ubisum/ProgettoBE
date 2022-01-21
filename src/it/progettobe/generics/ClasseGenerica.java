package it.progettobe.generics;

public class ClasseGenerica<T> 
{
	/* campi di tipo generico */
	private T campoGenerico;
	
	/* costruttori con tipo geenerico */
	public ClasseGenerica(){}
	
	public ClasseGenerica(T campoGenerico)
	{
		this.campoGenerico = campoGenerico;
	}

	/* setter e getter generici */
	public T getCampoGenerico() {
		return campoGenerico;
	}

	public void setCampoGenerico(T campoGenerico) {
		this.campoGenerico = campoGenerico;
	}
	
	/* meetodo che usa tipo generico */
	public void controllaTipo()
	{
		if(campoGenerico instanceof String)
			System.out.println("Questa e' una stringa, con valore " + (String)campoGenerico);
		
		else
			System.out.println("Questa non e' una stringa");
	}
	
	/* metodo che usa un parametro dello stesso tipo generico */
	public void concatenaSomma(T param)
	{
		if(param instanceof String)
		{
			String temp = (String)param;
			System.out.println(temp + "_" + campoGenerico);
		}
		
		else if(param instanceof Integer)
		{
			Integer int1 = (Integer)campoGenerico;
			Integer int2 = (Integer)param;
			
			System.out.println(int1 + int2);
		}
	}
	
	/* metodo con altro tipo genrico */
	public <V> void metodoAltroGenerico(V altroTipo)
	{
		if(campoGenerico instanceof String && altroTipo instanceof String)
			System.out.println("I campi generici sono entrambi stringhe");
		
		else if (campoGenerico instanceof Integer && altroTipo instanceof Integer)
			System.out.println("I campi generici sono entrambi interi");
		
		else
			System.out.println("Nessuna coppia di stringhe o interi");
	}
	
}
