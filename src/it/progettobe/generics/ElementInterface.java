package it.progettobe.generics;

public interface ElementInterface<T>
{
	public <V> void addElements(ElementInterface<V> otherImplementation);
	public T[] getElements();
}