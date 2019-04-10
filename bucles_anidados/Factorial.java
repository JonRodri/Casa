//2. Leer un número N y calcular el factorial de los números desde 0 hasta N.

package bucles_anidados;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num = 0;
		int suma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*FACTORIAL*");
		System.out.println("***********");
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		System.out.print(num + "! = ");
		for(int i=num; i>=1; i--) {		// 6! = 5! * 4! * 3! * 2! * 1!
			if(i != 1) {
				System.out.print(i + "! * ");
	
			} else {
				System.out.println(i + "!");
			}
		}
		
		for(int j=num; j>=1; j--) {
			System.out.println(j + "! = " + j * j);
			suma += (j*j);
		}
		
		System.out.println("******************");
		System.out.println(num + "! = " + suma);
		
		sc.close();
	}

}
