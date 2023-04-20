package baseslenguaje;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Maricel Lopez";
		System.out.println("Mi nombre es: " + nombre);
		System.out.println("Mi nombre tiene: " + nombre.length() + " letras");
		System.out.println("La primera letra de mi nombre es: " + nombre.charAt(0));
		
		int ultimaLetra = nombre.length();
		System.out.println("Y la ultima letra es la: " + nombre.charAt(ultimaLetra-1));
	}

}
