package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import Persona.ComparatorPersonaApellido;
import Persona.ComparatorPersonaDni;
import Persona.ComparatorPersonaNombre;
import Persona.Persona;



public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set <Persona> listaPersonas= new HashSet<>();
		
		Persona p1 = new Persona("Vicente", "Villarreal", "555555x", LocalDate.of(2000, 5, 15));
		Persona p2 = new Persona("Juan", "Marquez", "555555b", LocalDate.of(2000, 6, 15));
		Persona p3 = new Persona("Amalia", "Hinojo", "555555z",LocalDate.of(2000, 2, 15));
		Persona p4 = new Persona("Pepe", "Astra", "555555r",LocalDate.of(2000, 1, 15));
		Persona p5 = new Persona("Manolo", "Concejal", "555555p",LocalDate.of(2000, 9, 15));
		
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		listaPersonas.add(p3);
		listaPersonas.add(p4);
		listaPersonas.add(p5);
		
		Iterator iteradorPersona = listaPersonas.iterator();
		
		while(iteradorPersona.hasNext()) {
			System.out.println(iteradorPersona.next());
		}
		System.out.println("######################################################################");
		
		List <Persona> listaPersonaArray = new ArrayList<>(listaPersonas);
		
		listaPersonaArray.sort(new ComparatorPersonaNombre().thenComparing(new ComparatorPersonaApellido().thenComparing(new ComparatorPersonaDni())));
		
		for (Persona p : listaPersonaArray){
			System.out.println(p);
		}
		System.out.println("#################################");
		System.out.println(ordenarPersonasApellidoyNombre(listaPersonaArray));
		System.out.println("#################################");
		System.out.println(ordenarPersonasDniyFecha(listaPersonaArray));
		System.out.println("#################################");
		System.out.println(ordenarPersonasNombreYApellido(listaPersonaArray));
		System.out.println("#################################");
	}
	public static List<Persona> ordenarPersonasNombreYApellido(List<Persona> listaPersona){		
		listaPersona.sort(new ComparatorPersonaNombre().thenComparing(new ComparatorPersonaApellido()));
		return listaPersona;
		
	}
	
	public static List<Persona> ordenarPersonasApellidoyNombre(List<Persona> listaPersona){		
		listaPersona.sort(new ComparatorPersonaApellido().thenComparing(new ComparatorPersonaNombre()));
		return listaPersona;
		
	}
	public static List<Persona> ordenarPersonasDniyFecha(List<Persona> listaPersona){		
		listaPersona.sort(new ComparatorPersonaApellido().thenComparing(new ComparatorPersonaNombre()));
		return listaPersona;
		
	}
}
