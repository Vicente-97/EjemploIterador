package Persona;

import java.time.LocalDate;
import java.util.Objects;

public class Persona{

	
	private String nombre;
	private String apellido;
	private String dni;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, String apellido, String dni, LocalDate fecha) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNacimiento=fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales= false;
		Persona other= (Persona) obj;
		if(obj != null) {
			if (this.dni.equalsIgnoreCase(other.getDni())&&this.nombre.equalsIgnoreCase(other.getNombre()))
				sonIguales = true;
			
			}
		return sonIguales;
	}

	@Override
	public String toString() {
		return "nombre = " + nombre + ", apellido = " + apellido + ", dni = " + dni + " fechaNacimiento ="+ fechaNacimiento;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}





	
	
}
