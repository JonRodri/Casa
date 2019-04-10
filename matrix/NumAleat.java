package matrix;

public class NumAleat {

	public static void main(String[] args) {
		int[][] num = new int[3][6];
		
		System.out.println("***Introduciendo valores aleatorios...***");
		for(int i=0; i<num[0].length; i++) {	//fila
			for(int j=0; j<num.length; j++) {	//colum
				num[0][j] = (int) (Math.random()*10 + 90);
			}
		}
		
		System.out.println("***Matriz cargada***");
		System.out.println("***Mostrando matriz...***");
		for(int i=0; i<num[0].length; i++) {	//fila
			for(int j=0; j<num[0].length; j++) {	//colum
				System.out.println("Pos [" + i + "][" + j + "] = " + num[i][j]);
			}
		}
	}
}
