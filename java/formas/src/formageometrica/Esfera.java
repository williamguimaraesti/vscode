package formageometrica;

import util.Util;

public class Esfera extends FormaTridimensional {
	private double raio;
	public Esfera(String msg) {
		super(msg);
	}
	public double calcularArea() {
		return 4 * 3.14 * Util.calculaPotencia(raio, 2);
	}
	public double calcularVolume() {
		return (4 * 3.14 * Util.calculaPotencia(raio, 3))/3;
	}
	public double getRaio() {
		return this.raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
}
