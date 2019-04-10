//1. Calcular la media de una serie de números que se leen por teclado.

package arrays;

import java.util.Scanner;

public class MediaDeN {

	public static void main(String[] args) {
		float[] numeros = new float[5];
		float suma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce los numeros: ");
		for(int i=0; i<numeros.length; i++) {
			System.out.println("N." + i + ": ");
			numeros[i] = sc.nextFloat();
			suma += numeros[i];
		}
		
		System.out.println("La media es: " + suma / numeros.length);
		
		sc.close();
	}

}
