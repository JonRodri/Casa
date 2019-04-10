//1. Mostrar los números perfectos entre 1 y 1000.
//6 -> 6%5, 6%4, 6%3==0 6%2==0 6%1==0 suma=3+2+1

package bucles_anidados;

public class NumPerfect {

	public static void main(String[] args) {
		int suma = 0;
		
		for(int i=1; i<1001; i++) {
			System.out.println("n. " + i);
			suma = 0;
			for(int j=i-1; j>0; j--) {
				if(i%j == 0) {	//Si el resto es 0
					suma += j;
					if(suma == i && j == 1) {	//Importante comprobar que ha recorrido todo J!!
						System.out.println(" -> Perfecto");
					}
				}
			}
		}

	}

}
