package baseslenguaje;

import javax.swing.*;

public class BuclesI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave = "Julio";
		
		String pass = "";
		
		while (clave.equals(pass) == false ) {
			
			pass = JOptionPane.showInputDialog("Ingresa la contraseña, por favor");
			
			if (clave.equals(pass) == false) {
				
				System.out.println("Contraseña incorrecta");
			}
		}
		
		System.out.println("Contraseña correcta. Acceso permitido");
	}

}
