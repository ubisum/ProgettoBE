package it.progettobe.generics;

public class StringImplementation implements ElementInterface<String>
{
	private String[]elements;
	private int nextPosition;
	
	public StringImplementation(int size) throws Exception 
	{
		if(size < 1)
			throw new Exception("Impossibile costruire un array con meno di " + size + " elementi.");
		
		this.elements = new String[size];
		this.nextPosition = 0;
	}
	
	public StringImplementation(String[] elements) throws Exception
	{
		if(elements == null || elements.length < 1)
			throw new Exception("Impossibile costruire un array con meno di 1 elemento.");
		
		this.elements = elements;
		this.nextPosition = elements.length;
	}


	@Override
	public <V> void addElements(ElementInterface<V> otherImplementation)
	{
		if(otherImplementation.getElements() != null && otherImplementation.getElements().length > 0)
		{
			V firstElement = otherImplementation.getElements()[0];
			boolean checkTipe = firstElement instanceof String;
			
			for(int index = 0; index < otherImplementation.getElements().length; index++)
			{
				String elementToAdd = checkTipe ? (String)firstElement : firstElement.toString();
				
				if(nextPosition > elements.length - 1)
				{
					String[] tempList = new String[this.elements.length * 2];
					for(int pointer = 0; pointer < this.elements.length; pointer++)
						tempList[pointer] = this.elements[pointer];
					
					this.elements = tempList;
				}
				
				this.elements[nextPosition++] = elementToAdd;
			}

		}
	}

	@Override
	public String[] getElements()
	{
		return elements;
	}
}