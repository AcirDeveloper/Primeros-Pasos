package baseslenguaje;

import java.util.*;

public class EntradaEjemplo1 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in)) {
			System.out.println("Introduce tu nombre: ");
			String nombre = entrada.nextLine();		
			System.out.println("Introduce tu edad: ");
			int edad = entrada.nextInt();
			System.out.println("Bienvenido " + nombre + " tienes " + edad + " años.");
		}
		
	}

}
