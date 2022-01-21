package it.progettobe.generics;

import it.progettobe.ereditarieta.Persona;

public class ClasseUpperbound<T extends Persona>
{
	private T field;

	public ClasseUpperbound(T field) {
		this.field = field;
	}
	
	public ClasseUpperbound() {
	}

	public T getField() {
		return field;
	}

	public void setField(T field) {
		this.field = field;
	}
	
	
}
