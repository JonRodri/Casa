//4. Realizar un programa que pida 10 números por teclado y que luego muestre los números introducidos. 
//Además de mostrar el máximo valor y el mínimo valor al final.

package arrays;

import java.util.Scanner;

public class NMaxMin {
	
	static int min = 999999999;
	static int max = -999999999;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] num = new int [10];
		
		System.out.println("Introduce 10 numeros:");
		cargarArray(num);
		System.out.println("Has rellenado el siguiente array:");
		listarArray(num);
		System.out.println("El mayor valor es el: " + max);
		System.out.println("El menor valor es el: " + min);
	}

	private static void listarArray(int[] num) {
		
		for(int i=0; i<num.length; i++) {
			System.out.printf("Pos[%s] = %s\n", i, num[i]);
		}
		
	}

	private static void cargarArray(int[] num) {
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
			//int num[i] > max ? max = num[i] : int num[i] < min ? min = num[i];
			if(num[i] > max) {
				max = num[i];
			} else {
				min = num[i];
			}
		}
		
	}

}
