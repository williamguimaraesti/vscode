package formageometrica;

public class Cubo extends FormaTridimensional {
	private double aresta;
	public Cubo(String msg) {
		super(msg);
	}
	public double calcularArea() {
		return 6 * aresta * aresta;
	}
	public double calcularVolume() {
		return aresta * aresta * aresta;
	}
	public double getAresta() {
		return this.aresta;
	}
	public void setAresta(double aresta) {
		this.aresta = aresta;
	}
}
