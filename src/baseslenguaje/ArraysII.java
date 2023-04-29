package baseslenguaje;

public class ArraysII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = {
				{10,4,5,6,7},
				{10,9,3,7,1},
				{1,2,3,4,5},
				{6,7,8,9,0},				
		};
		
		for ( int fila[] : matrix) {
			System.out.println();
			
			for (int z : fila) {
				System.out.print(z + " ");
			}
		}
		
		System.out.println(" ");
		
		/* Examplo array 2D*/
		
		double acumulado;
		double interes = 0.10;
		double saldo[][] = new double[6][5];
		
		for (int i = 0; i < 6; i++) {
			saldo[i][0] = 10000;
			acumulado = 10000;
			
			for (int j = 1; j < 5; j++) {
				acumulado = acumulado + (acumulado * interes);
				
				saldo[i][j] = acumulado;
			}
			
			interes = interes + 0.01;
		}
		
		for (int z = 0; z < 6; z++) {
			System.out.println();
			for (int h = 0; h < 5; h++) {
				System.out.printf("%1.2f", saldo[z][h]);
				System.out.print(" ");
			}
		}
	}

}
