package Persona;

import java.util.Comparator;

public class ComparatorPersonaDni implements Comparator<Persona> {

	
	public ComparatorPersonaDni() {
		
	}
	@Override
	public int compare(Persona p1, Persona p2) {
		
		return p1.getDni().compareTo(p2.getDni());
	}

}
