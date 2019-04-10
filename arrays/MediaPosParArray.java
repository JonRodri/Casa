//2. Leer 10 números enteros por teclado y guardarlos en un array. 
//Calcula y muestra la media de los números que estén en las posiciones pares del array.

package arrays;

import java.util.Scanner;

public class MediaPosParArray {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		int suma = 0;
		int cont = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 10 numeros: ");
		for(int i=0; i<10; i++) {
			numeros[i] = sc.nextInt();
			if(i%2 == 0) {
				System.out.println("Pos. [" + i + "] = " + numeros[i]);
				suma += numeros[i];
				cont++;
			}
		}

		System.out.println("La media de los numeros es: " + suma / cont);
		
		sc.close();
	}

}
