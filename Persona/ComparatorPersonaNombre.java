package Persona;

import java.util.Comparator;

public class ComparatorPersonaNombre implements Comparator<Persona> {


	public ComparatorPersonaNombre() {
	}

	@Override
	public int  compare(Persona p1, Persona p2) {
		
		return p1.getNombre().compareTo(p2.getNombre());
	}

}
