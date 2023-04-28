package baseslenguaje;

import java.util.*;

public class BuclesII {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int aleatorio = (int)(Math.random() * 100);
			
			int numero = 0, intentos = 0;
			
			do{
				intentos++;
				System.out.println("Introduce un número, por favor");
				numero = sc.nextInt();
				if(numero < aleatorio) {
					System.out.println("Más alto");
				} else {
					System.out.println("Más bajo");
				}				
				
			} while (numero != aleatorio); 
			System.out.println("Correcto, lo consegiste en " + intentos + " intentos");
		}
		
	}

}
