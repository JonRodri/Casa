package aleatorio;

public class NumAleat {

	public static void main(String[] args) {
		System.out.println("Diez numeros aleatorios: ");
		for(int i=1; i<11; i++) {
			System.out.println(Math.random());
		}
		System.out.println();
		//La función Math.random() trabaja con decimales entre 0 y 1.
		
		System.out.println("20 numeros aleatorios entre 0 y 10 (exclusive): ");
		for(int i=1; i<=20; i++) {
			System.out.println(Math.random()*10 + " ");
		}
		System.out.println();
		//Ahora ya solo faltaría eliminar los decimales casteando el código.
		
		//Así se utiliza normalmente Math.random()
		System.out.println("20 numeros aleatorios entre 0 y 10 (exclusive):");
		for(int i=1; i<=20; i++) {
			System.out.println((int)(Math.random()*10) + " ");			
		}
		System.out.println();
		
		System.out.println("20 numeros aleatorios entre 1 y 10 (inclusive):");
		for(int i=1; i<=20; i++) {
			System.out.println((int)(Math.random()*10 + 1) + " ");
		}
		System.out.println();
		
		System.out.println("20 numeros aleatorios entre 50 y 60 (inclusive):");
		for(int i=0; i<=20; i++) {
			System.out.println((int)(Math.random()*11 + 50));
		}
		System.out.println();
	}

}
