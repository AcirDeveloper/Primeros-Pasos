package baseslenguaje;
import javax.swing.*;
public class BuclesIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String genero = "";
		
		do {
			genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");
		} while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu átura en cm"));
		
		int peso_ideal = 0;
		
		if (genero.equalsIgnoreCase("H")) {
			peso_ideal = altura - 110;
		} else if (genero.equalsIgnoreCase("M")) {
			peso_ideal = altura - 120;
		}
		
		System.out.println("Tu peso ideal es: " + peso_ideal + " kg");
	}

}
