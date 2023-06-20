package formageometrica;

public class Quadrado extends FormaBidimensional {
	private double lado;
	public Quadrado(String msg) {
		super(msg);
	}
	public double calcularArea() {
		return lado * lado;
	}
	public double calcularPerimetro() {
		return 4 * lado;
	}
	public double getLado() {
		return this.lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
}
