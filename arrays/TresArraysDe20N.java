// 3. Define tres arrays de 20 números enteros cada uno, con nombre número, cuadrado y cubo. 
//Cargar el array número con valores aleatorios entre 0 y 100. 
//En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array número. 
//En el Array cubo se deben almacenar los cubos de los valores que hay en número. 
//Mostrar el contenido de los tres arrays.

package arrays;

public class TresArraysDe20N {
	
	static int[] numero = new int[20];
	static int[] cuadrado = new int[20];
	static int[] cubo = new int[20];

	public static void main(String[] args) {

		
		cargarArray(numero);
		elevarCuadrado(numero);
		elevarCubo(numero);

	}

	private static void elevarCubo(int[] numero) {
		
		System.out.println("Elevando al cubo numero[]...........");
		for(int i=0; i<cubo.length; i++) {
			cubo[i] = (numero[i] * numero[i]) * numero[i];
			System.out.println("El cubo de numero[" + i + "] = " + cubo[i]);
		}
		System.out.println("");
	}

	private static void elevarCuadrado(int[] numero) {
		
		System.out.println("Elevando al cuadrado numero[].........");
		for(int i=0; i<cuadrado.length; i++) {
			cuadrado[i] = numero[i] * numero[i];
			System.out.println("El cuadrado de numero[" + i + "] = " + cuadrado[i]);
		}
		System.out.println("");
	}

	private static void cargarArray(int[] numero) {
		
		System.out.println("Generando array.......");
		for(int i=0; i<numero.length; i++) {
			numero[i] = (int)(Math.random()*100);
			System.out.println("N [" + i + "]: " + numero[i]);
		}
		System.out.println("");
	}
	
	

}
