package poo.futbol;

import java.util.ArrayList;
import java.util.Scanner;

import arrays.MediaDeN;

public class MainFutbol {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Futbolista> futbolistas = new ArrayList<Futbolista>();
	static ArrayList<Futbolista> titulares = new ArrayList<Futbolista>();
	static ArrayList<Futbolista> plantilla = new ArrayList<Futbolista>();
	static ArrayList<Futbolista> lesionados = new ArrayList<Futbolista>();
	
	public static void main(String[] args) {
		String nombreClub = "";
		String saltoDLinea = "";
		int opc;
		int numJornada = 1;
		int entrenosSemanales = 4;
		boolean salir = false;
		
		
		System.out.println("*************");
		System.out.println("*+*+*MENÚ*+*+*");
		System.out.println("*************");
		System.out.printf("Bienvenido, aquí podrás crear y gestionar el equipo de tus sueños.\nPara empezar démosle un nombre al club: ");
		nombreClub = sc.nextLine();
		System.out.println("-|-|-" + nombreClub + "-|-|-");
		while(!salir) {
			do {
				System.out.printf("1. Inscribir jugador\n2. Listar plantilla\n3. Entrenar\n4. Jugar partido\n5. Enfermería\n6. Salir\n\nElige una opción:");
				opc = sc.nextInt();
				saltoDLinea = sc.nextLine();
				
				switch(opc) {
				case 1:
					inscribirFutbolista();
					break;
				case 2:
					listarFutbolistas();
					break;
				case 3:
					if(entrenosSemanales > 0) {
						System.out.println("Dispones de " + entrenosSemanales + "entrenamientos.");
						entrenar();
						entrenosSemanales --;
					} else {
						System.out.println("Has entrenado suficiente por ahora.\n¡Ve a la cancha y demuestra lo que has trabajado en los entrenamientos!");
					}
					break;
				case 4:
					jugarPartido(numJornada, mediaDefensa, mediaAtaque, nombreClub);
					numJornada++;
					entrenosSemanales = 4;
					break;
				case 5:
					enfermeria(lesionados);
					break;
				case 6:
					salir = true;
					break;
				}
			} while(opc < 1 && opc > 6);
		}


	}//end main


	private static void enfermeria(ArrayList<Futbolista> lesionados) {
		
		Doctor doctor = new Doctor("Alberto", "Lopez", 54, "Doctorado", 15);
		
		//dependiendo de la experiencia del Doctor los jugadores se curan antes o después
		for(Futbolista l : lesionados) {
			if(doctor.getExp() < 5) {
				l.setDiasLesion(15);
			} else if(doctor.getExp() > 5 && doctor.getExp() < 10) {
				l.setDiasLesion(10);
			} else {
				l.setDiasLesion(5);
			}
		}
		
		

		
	}


	private static void entrenar() {
		float niuAtaque;
		float niuDefensa;
		float mediaAtaque;
		float mediaDefensa;
		float suma = 0;
		
		Entrenador e = new Entrenador("Sergio", "Gonzalez", 38, "Ataque");
		
		System.out.println("Vamos a entrenar " + e.getEstrategia());
		if("Ataque".equals(e.getEstrategia())){
			System.out.println("Entrenando los siguientes conceptos... ");
			System.out.printf("Pases\nTiros a puerta\nCentros\nRegates");
			for(Futbolista f : futbolistas) {
				niuAtaque = (float) (f.getAtaque() * 1.01);
				f.setAtaque(niuAtaque);
				suma += f.getAtaque();
			}
		} else if("Defensa".equals(e.getEstrategia())) {
			System.out.println("Entrenando los siguientes conceptos... ");
			System.out.println("Entradas\nFueras de juego\nSacar el balón desde atrás\nJugadas a balón parado");
			for(Futbolista f : futbolistas) {
				niuDefensa = (float) (f.getDefensa() * 1.01);
				f.setAtaque(niuDefensa);
				suma += f.getDefensa();
			}
		}
		
		mediaAtaque = suma / futbolistas.size();
		mediaDefensa = suma / futbolistas.size();
	}


	private static ArrayList<Futbolista> jugarPartido(int numJornada, int mediaDefensa, int mediaAtaque, String nombreClub) {
		int numAleat = (int) (Math.random()*(10-30));	//numero aleatorio entre 10 y 30 que será la energía que consumió el jugador
		int jornadaLesion = (int) (Math.random()*(5-15));	//jornada de lesión aleatoria
		int niuFuerza;
		int indiceLesionado;
		int dorsalSeleccionado;
		int contJugadores = 0;
		boolean estupido = false;
		int locales = 0;
		int visitantes = 0;
		
		System.out.println("Dispones de los siguientes jugadores: ");
		listarFutbolistas();
		
		while(contJugadores < 11 || estupido) {
			System.out.println("Elige al once por sus dorsales: ");
			System.out.println("Dorsal: ");
			dorsalSeleccionado = sc.nextInt();
			contJugadores++;	
			
			for(Futbolista f : futbolistas) {
				if (f.getDorsal() == dorsalSeleccionado) {
					 titulares.add(f);
				} else {
					System.out.println("Selecciona un dorsal válido :/");
					estupido = true;
				}
			}
		}
		
		//goles del equipo contrario en base a la media defensiva
		if(mediaDefensa < 70) {
			visitantes = 4;
			System.out.println("El encuentro finalizó." + nombreClub + locales + ":" + visitantes + "Rival");
		}
		
		//por cada futbolista titular resto un porcentaje aleatorio de energía
		for(Futbolista t : titulares) {	
			niuFuerza = t.getFuerza();
			niuFuerza -= numAleat;
			t.setFuerza(niuFuerza);
		}
		
		//por cada lesionado resto una jornada para su recuperación
		for(Futbolista l : lesionados) {	
			l.setDiasLesion(l.getDiasLesion()-1);
		}
		
		//si en la jornada de lesión hay un jugador con menos del 60% de energía se lesiona
		if(numJornada == jornadaLesion) {	
			for(Futbolista l: lesionados) {
				for(Futbolista t : titulares) {
					if(t.getFuerza() < 60) {
						t.setLesionado(true);
						System.out.println(t.getNombre() + " " + t.getApellido() + " se ha lesionado en este encuentro y deberá pasar por la enfermería.");
						Futbolista lFutbolista = new Futbolista(t.getNombre(), t.getApellido(), t.getEdad(), t.getDorsal(), t.getPosicion());	//creo un nuevo objeto Futbolista e instancio con los atributos del lesionado
						lesionados.add(lFutbolista);	//agrego el objeto al ArrayList de lesionados
						indiceLesionado = futbolistas.indexOf(t);	
						futbolistas.remove(indiceLesionado);	//elimino de la plantilla al lesionado
					}
				}
			}

		}
		
		//recupero a los futbolistas que descansaron esta jornada
		for(Futbolista f : futbolistas) {
			f.setFuerza(100);
		}
		
		return lesionados;
	}


	private static void listarFutbolistas() {
		for(Futbolista fut : futbolistas) {
			System.out.println(fut.toString());
		}
		
	}


	private static void inscribirFutbolista() {
		String nombre, apellido, posicion, saltoDLinea;
		int edad, dorsal;
		char resp;
		
		do {
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			System.out.println("Apellido: ");
			apellido = sc.nextLine();
			System.out.println("Edad: ");
			edad = sc.nextInt();
			saltoDLinea = sc.nextLine();
			System.out.println("Dorsal: ");
			dorsal = sc.nextInt();
			saltoDLinea = sc.nextLine();
			System.out.println("Posicion: ");
			posicion = sc.nextLine();
			
			Futbolista f = new Futbolista(nombre, apellido, edad, dorsal, posicion);
			futbolistas.add(f);
			
			System.out.println("Deseas inscribir algun futbolista mas (S/N)");
			resp = sc.next().charAt(0);
			saltoDLinea = sc.nextLine();
		}while(resp != 'n' && resp != 'N');
	}
}
