package formageometrica;

public class Tetraedro extends FormaTridimensional {
	private double aresta;
	public Tetraedro(String msg) {
		super(msg);
	}
	public double calcularArea() {
		return Math.pow(aresta, 2) * Math.sqrt(3);
	}
	public double calcularVolume() {
		return (Math.pow(aresta, 3) * Math.sqrt(2))/12;	
	}
	public double getAresta() {
		return this.aresta;
	}
	public void setAresta(double aresta) {
		this.aresta = aresta;
	}
}
