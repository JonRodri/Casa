/*
* Escribe una aplicación con un String que contenga una contraseña cualquiera. 
* Después se te pedirá que introduzcas la contraseña, con 3 intentos. 
* Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo “Enhorabuena”.
*/
package cadenas;
import java.util.Scanner;

public class Pass {

	public static void main(String[] args) {
		String contrasenia = "   asdKFG35";
		String contrasenia2 = "";
		boolean igual = false;
		int intentos = 3;
		
		Scanner sc = new Scanner(System.in);
		
		contrasenia = contrasenia.trim();	//RESTA ESPACIOS A IZDA Y DCHA
		do {
			
			System.out.println("Introduce la contrasena (Max 3 intentos): ");
			contrasenia2 = sc.nextLine();
			contrasenia2 = contrasenia2.trim();
			
			if(contrasenia.length() == contrasenia2.length()) {	//SI TIENE LA MISMA LONGITUD
				for(int i=0; i<contrasenia.length(); i++) {		//EXAMINAMOS
					if(contrasenia.charAt(i) == contrasenia2.charAt(i)) {	//CHAR POR CHAR
						igual = true;
					} else {
						igual = false;
					}
				}
				if(igual == true) {
					System.out.println("Las contrasenas son iguales.");
				} else {
					System.out.println("Las contrasenas no son iguales.");
					intentos--;
				}
			}
			
			else {
				System.out.println("No son iguales.");
				intentos--;
			}
			
		}while(intentos > 0 && igual == false);	//REPETIR PROGRAMA MIENTRAS QUEDEN INTENTOS Y LA CONTRASEÑA NO SEA IGUAL
		
		sc.close();
	}

}
