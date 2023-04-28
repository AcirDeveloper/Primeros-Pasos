package baseslenguaje;

import javax.swing.JOptionPane;

public class BuclesIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + ": Julio");
		}*/
		
		int arroba = 0;
		boolean punto = false;
		String mail = JOptionPane.showInputDialog("Ingresa tu mail");
		
		for (int i = 0; i < mail.length(); i++) {
			if (mail.charAt(i) == '@') {
				arroba++;
			}
			
			if(mail.charAt(i) == '.') {
				punto = true;
			}
		}
		
		if (arroba != 1 && punto == true) {
			System.out.println("No es correcto");
		} else {
			System.out.println("Es correcto");
		}
	}

}
