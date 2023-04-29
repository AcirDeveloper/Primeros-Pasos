package poo;

public class Coche {
	
	private int ruedas, largo, ancho, motor, peso;
	
	String color;
	int peso_total;
	boolean asientos_cuero, climatizador;
	
	// MÉTODO CONSTRUCTOR
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso = 500;
	}

	// GETTERS
	public int getRuedas() {
		return ruedas;
	}

	public int getLargo() {
		return largo;
	}

	public int getAncho() {
		return ancho;
	}

	public int getMotor() {
		return motor;
	}

	public int getPeso() {
		return peso;
	}

	public String getColor() {
		return color;
	}

	public int getPeso_total() {
		return peso_total;
	}

	public boolean isAsientos_cuero() {
		return asientos_cuero;
	}

	public boolean isClimatizador() {
		return climatizador;
	}

	// SETTERS
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPeso_total(int peso_total) {
		this.peso_total = peso_total;
	}

	public void setAsientos_cuero(boolean asientos_cuero) {
		this.asientos_cuero = asientos_cuero;
	}

	public void setClimatizador(boolean climatizador) {
		this.climatizador = climatizador;
	}	

}
