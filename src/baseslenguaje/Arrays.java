package baseslenguaje;

import javax.swing.JOptionPane;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paises[] = new String[8];
		
		for (int i =0; i < 8; i++ ) {
			
			paises[i] = JOptionPane.showInputDialog("Ingresa los paises ", (i+1));
		}
		
		for (String elemento : paises ) {
			System.out.println("País: " + elemento);
		}
		
		int matriz_aleatorio[] = new int[150];
		
		for (int i = 0; i < matriz_aleatorio.length; i++) {
			matriz_aleatorio[i] = (int)Math.round(Math.random()*100);
		}
		
		for (int numeros : matriz_aleatorio) {
			System.out.print(numeros + " ");
		}
		
	}

}
