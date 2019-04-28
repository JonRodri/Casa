package poo.futbol;

public class Entrenador extends Persona {
	private String estrategia;

	public Entrenador(String nombre, String apellido, int edad, String estrategia) {
		super(nombre, apellido, edad);
		this.estrategia = estrategia;
	}

	public String getEstrategia() {
		return estrategia;
	}

	@Override
	public String toString() {
		return "-->Entrenador<-- \nNombre= " + nombre + "\nApellido= " + apellido + "\nEdad= "
				+ edad + "\nEstrategia= " + estrategia; 
	}
	
	
	
}
