package baseslenguaje;

import javax.swing.JOptionPane;

/*import java.util.Locale;
import java.util.Scanner;*/

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String nombre;
		Scanner miObjeto;
		Locale miObjeto2;*/
		
		// redondeamos a dos decimales
		double x = 10000.0;
		System.out.println(x/3);
		System.out.printf("%1.2f", x/3);
		System.out.println("");
		String num1 = JOptionPane.showInputDialog("Ingresa un numero: ");
		Double num2 = Double.parseDouble(num1);
		System.out.print("La raíz de " + num2 + " es " );
		System.out.printf("%1.2f", + Math.sqrt(num2));
		
	}

}
