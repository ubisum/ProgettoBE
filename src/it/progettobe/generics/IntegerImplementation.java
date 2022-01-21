package it.progettobe.generics;

public class IntegerImplementation implements ElementInterface<Integer> {

	private Integer[]elements;
	private int nextPosition;
	
	public IntegerImplementation(int size) throws Exception 
	{
		if(size < 1)
			throw new Exception("Impossibile costruire un array con meno di " + size + " elementi.");
		
		this.elements = new Integer[size];
		this.nextPosition = 0;
	}
	
	public IntegerImplementation(Integer[] elements) throws Exception
	{
		if(elements == null || elements.length < 1)
			throw new Exception("Impossibile costruire un array con meno di 1 elemento.");
		
		this.elements = elements;
		this.nextPosition = elements.length;
	}
	
	@Override
	public <V> void addElements(ElementInterface<V> otherImplementation) {
		if(otherImplementation.getElements() != null && otherImplementation.getElements().length > 0)
		{
			V firstElement = otherImplementation.getElements()[0];
			boolean checkTipe = firstElement instanceof Integer;
			
			for(int index = 0; index < otherImplementation.getElements().length; index++)
			{
				Integer elementToAdd = null;
								
				try 
				{
					elementToAdd = checkTipe ? (Integer)firstElement : Integer.valueOf((String)otherImplementation.getElements()[index]);
				} 
				
				catch (Exception e) {
					// TODO Auto-generated catch block
					elementToAdd = -1;
				}
				
				if(nextPosition > elements.length - 1)
				{
					Integer[] tempList = new Integer[this.elements.length * 2];
					for(int pointer = 0; pointer < this.elements.length; pointer++)
						tempList[pointer] = this.elements[pointer];
					
					this.elements = tempList;
				}
				
				this.elements[nextPosition++] = elementToAdd;
			}

		}
		
	}

	@Override
	public Integer[] getElements() {
		return this.elements;
	}

}
