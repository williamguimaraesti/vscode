package formageometrica;

public class Circulo extends FormaBidimensional {
	private double raio;
	public Circulo(String msg) {
		super(msg);
	}
	public double calcularArea() {
		return  3.14 * raio * raio;
	}
	public double calcularPerimetro() {
		return 2 * 3.14 * raio;
	}
	public double getRaio() {
		return this.raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
}
