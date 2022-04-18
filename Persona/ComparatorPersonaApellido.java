package Persona;

import java.util.Comparator;

public class ComparatorPersonaApellido implements Comparator<Persona> {

	
	public ComparatorPersonaApellido() {
		
	}
	@Override
	public int compare(Persona p1, Persona p2) {
		
		return p1.getApellido().compareTo(p2.getApellido());
	}

}
