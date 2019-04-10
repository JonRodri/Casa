//5. Contar el número de elementos positivos, negativos y ceros en un array de 10 enteros.

package arrays;

public class ContadorNPosNegCero {

	public static void main(String[] args) {
		int[] num = new int[10];
		int pos = 0;
		int neg = 0;
		int cero = 0;
		
		System.out.println("Numeros aleatorios entre el -5 y el 5(excluido):");
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*11 - 6);
			System.out.println(num[i]);
			if(num[i] > 0) { pos++; }
			else if(num[i] < 0) { neg++; }
			else { cero++; }
		}
		
		System.out.println(pos + " numeros positivos, " + neg + " numeros negativos y " + cero + " ceros.");
		
	}
	
}
	