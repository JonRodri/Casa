// 6. Realizar un programa que nos permita introducir 10 números por teclado en un array de 10 posiciones.
//Ordenar en orden creciente. 
//Mostrar finalmente el resultado.

package arrays;

import java.util.Scanner;

public class OrdenCreciente {

	public static void main(String[] args) {
		int[] num = new int[10];
		int aux = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 10 numeros:");
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.println("***Ordenando array...***");
		for(int i=0; i<num.length; i++) {	//Método burbuja
			for(int j=0; j<num.length; j++) {
				if(num[i] < num[j]) {	
					aux = num[i];		
					num[i] = num[j];	
					num[j] = aux;		
				}
			}
		}
		
		for(int i=0; i<num.length; i++) {
			System.out.printf("%s \n", num[i]);
		}
		
		sc.close();

	}

}
