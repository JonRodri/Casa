//3. Leer por teclado la nota de los alumnos de una clase y calcular la nota media del grupo. 
//Mostar los alumnos con notas superiores a la media.

package arrays;

import java.util.Scanner;

public class NotasAlum {

	public static void main(String[] args) {
		float[] alumno = new float[10];
		float suma = 0;
		float media = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce las notas de los alumnos:");
		for(int i=0; i<alumno.length; i++) {
			System.out.println("Nota alumno [" + i + "]: ");
			alumno[i] = sc.nextFloat();
			suma += alumno[i];
		}
		
		media = suma / alumno.length;
		
		for(int i=0; i<alumno.length; i++) {
			if(alumno[i] > media) {
				System.out.println("El alumno #" + i + " esta por encima de la media.");
			}
		}
		
		sc.close();
	}

}
