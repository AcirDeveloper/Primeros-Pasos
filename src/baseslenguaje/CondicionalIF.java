package baseslenguaje;

import java.util.Scanner;

public class CondicionalIF {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Ingresa tu edad: ");
			int edad = sc.nextInt();
			// Mayor o Menor de edad;
			if(edad < 18) {
				System.out.println("Eres Menor de edad");
			} else {
				System.out.println("Eres Mayor de edad");
			}
			// Adolecente Joven, Adulto, Viejo.
			System.out.println("Ingresa un número: ");
			int edad2 = sc.nextInt();
			
			if (edad2 < 18) {
				System.out.println("Eres un adolescente");
			} else if (edad2 < 40) {
				System.out.println("Eres un joven");
			} else if (edad2 < 65) {
				System.out.println("Eres un adulto");
			} else {
				System.out.println("Cuidate");
			}
		}
		
	}

}
