package cadenas;

import java.util.Scanner;

public class ContarVocal {

	public static void main(String[] args) {
		String cadena = "La lluvia en Sevilla es una maravilla";
		String cadenados = "";
		String frase = "";
		String vocal = "aeiou";
		int cont = 0;
		
		//1.
		for(int i=0; i<cadena.length(); i++) {
			for(int j=0; j<vocal.length(); j++) {
				if(cadena.charAt(i) == vocal.charAt(j)) {
					cont++;
					//cadena.replace(cadena.charAt(i), vocal.charAt(1) ); Reemplaza internamente
				}
			}
		}
		
		
		System.out.println("Vocales: " + cont);
		
		//2.
		for(int i=0; i<vocal.length(); i++) {
			cadenados = cadena.replace(vocal.charAt(i), 'e');
			System.out.println("Cadena reemplazada: " + cadenados);
		}
		
		
		//3.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe algo: ");
		frase = sc.nextLine();
		frase = frase.trim();
		System.out.println("Sin espacios en blanco a izda y dcha: " + frase);
		
		sc.close();
	}

}
