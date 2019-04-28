package poo.futbol;

public class Doctor extends Persona {
	private String titulacion;
	private int exp;
	
	
	public Doctor(String nombre, String apellido, int edad, String titulacion, int exp) {
		super(nombre, apellido, edad);
		this.titulacion = titulacion;
		this.exp = exp;
	}


	public String getTitulacion() {
		return titulacion;
	}


	public int getExp() {
		return exp;
	}


	@Override
	public String toString() {
		return "-->Doctor<-- \nTitulacion= " + titulacion + "\nExp=" + exp + "\nNombre=" + nombre + "\nApellido=" + apellido
				+ "\nEdad= " + edad;
	}
	
	
	
}
