package arrays;

import java.util.Scanner;

public class SubirNUnaPos {
	
	static int min = 999999999;
	static int max = -999999999;
	static int[] num = new int[15];
	
	static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		System.out.println("Introduce 15 numeros:");
		cargarArray(num);
		listarArray(num);
		rotarArray(num);
		

		sc.close();
	}
	
	private static void rotarArray(int[] num) {
		int aux = 0;
		
		System.out.println("Cadena rotada en una posicion:");
		for(int i=0; i<num.length; i++) {
			if(i == 13) {
				num[0] = aux;
			}
			aux = num[i];
			if(i == (num.length -1)) {
				num[i] = num[0];
			} else {
				num[i] = num[i+1];
				num[i+1] = aux;
			}


			System.out.printf("Ahora Pos[%s] = %s\n", i, num[i]);

		}
		
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


