package formageometrica;

public class Triangulo extends FormaBidimensional {
	private double base;
	private double altura;
	private double lado;  
	public Triangulo(String msg) {
		super(msg);
	}
	public double calcularArea() {
		return base * altura;
	}
	public double calcularPerimetro() {
		return 3 * lado;
	}
	public double getBase() {
		return this.base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public void setAltura(double altura) {
		this.altura = altura;	  
	}
	public double getAltura() {
		return this.altura;
	}
	public double getLado() {
		return this.lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
}
