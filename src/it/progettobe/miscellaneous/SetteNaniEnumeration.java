package it.progettobe.miscellaneous;

public enum SetteNaniEnumeration 
{
	EOLO("EOLO"),
	MAMMOLO("MAMMOLO"),
	PISOLO("PISOLO"),
	BRONTOLO("BRONTOLO"),
	CUCCIOLO("CUCCIOLO"),
	DOTTO("DOTTO"),
	GONGOLO("GONGOLO");
	
	private String nano;
	
	private SetteNaniEnumeration(String nano)
	{
		this.nano = nano;
	}

	public String getNano() {
		return nano;
	}

	
}
