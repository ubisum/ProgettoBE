package it.progettobe.pattern;

public enum PersonaEnum 
{
	INSEGNANTE("INSEGNANTE"),
	ALUNNO("ALUNNO");
	
	private String persona;
	
	private PersonaEnum(String persona)
	{
		this.persona = persona;
	}

	public String getPersona() {
		return persona;
	}
}
