package baseslenguaje;

public class StringsDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "Hoy es un estupendo día para aprender a programar en Java";
		String fraseResumen = frase.substring(29, frase.length()) + ", no mejor seria irnos a la playa y olvidarnos de todo" ;
		System.out.println(fraseResumen);
		
		// Equals
		String alumno1, alumno2;
		
		alumno1 = "David";
		alumno2 = "david";
		
		System.out.println(alumno1.equals(alumno2));
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
	}

}
