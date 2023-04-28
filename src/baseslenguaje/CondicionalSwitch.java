package baseslenguaje;

import java.awt.HeadlessException;
import java.util.*;
import javax.swing.*;

public class CondicionalSwitch {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Elige un opcion: \n1) Cuadrado \n2) Rectángulo \n3) Triángulo \n4) Círculo");
			
			try {
				int figura = sc.nextInt();
				switch (figura) {
				case 1: {
					int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce un lado"));
					System.out.println("EL área del cuadrado es: " + Math.pow(lado, 2));
					break;
				}
				case 2: {
						int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
						int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
						System.out.println("El área del rectángulo es: " + (base * altura));
						break;
					}
				case 3: {
					int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
					int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
					System.out.println("El área del triángulo es: " + ((base * altura) / 2 ));
					break;
				}
					case 4: {
						int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
						System.out.print("El área del círculo es: ");
						System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
						break;
			}
			default:
				System.out.println("No haz ingresado un elemento válido");
			}
			} catch (InputMismatchException e) {
				System.out.println("Lo siento solo números");
			}
			
			
		} catch (NumberFormatException | HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
