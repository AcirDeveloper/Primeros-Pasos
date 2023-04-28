package baseslenguaje;

import javax.swing.JOptionPane;

public class EntradaEjemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre_usuario = JOptionPane.showInputDialog("Ingresa tu nombre: ");
		String edad = JOptionPane.showInputDialog("Ingresa tu edad");
		int edad_usuario = Integer.parseInt(edad);
		edad_usuario++;
		System.out.println("Tu nombre es: " + nombre_usuario + " el siguiente año tendras " 
				+ (edad_usuario) + " años");
	}

}
