package poo.futbol;

public class Futbolista extends Persona {
	private int dorsal;
	private String posicion;
	private int fuerza;
	private boolean isLesionado;
	private int diasLesion;
	private float ataque;
	private float defensa;
	
	
	public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion) {
		super(nombre, apellido, edad);
		this.dorsal = dorsal;
		this.posicion = posicion;
		this.fuerza = 100;
		this.isLesionado = false;
		this.diasLesion = 0;
		this.ataque = 65;
		this.defensa = 65;
	}
	
	
	public float getAtaque() {
		return ataque;
	}


	public void setAtaque(float ataque) {
		this.ataque = ataque;
	}


	public float getDefensa() {
		return defensa;
	}


	public void setDefensa(float defensa) {
		this.defensa = defensa;
	}


	public int getDiasLesion() {
		return diasLesion;
	}


	public void setDiasLesion(int diasLesion) {
		this.diasLesion = diasLesion;
	}

	
	public int getDorsal() {
		return dorsal;
	}


	public String getPosicion() {
		return posicion;
	}
	
	
	public int getFuerza() {
		return fuerza;
	}


	public boolean isLesionado() {
		return isLesionado;
	}


	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}


	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}


	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}


	public void setLesionado(boolean isLesionado) {
		this.isLesionado = isLesionado;
	}


	@Override
	public String toString() {
		return "-->Futbolista<-- \nNombre= " + super.nombre + "\nApellido= " + super.apellido + "\nEdad= " + super.edad + "\nDorsal= " + dorsal + "\nPosicion= " + posicion + "\nEnergia= " + fuerza + "\nLesion= " + isLesionado;
	}
	
	
	
}
