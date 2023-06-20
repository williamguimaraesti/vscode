package formageometrica;

public class Forma {
	private String tipoDaForma;
	public Forma(String tipoDaForma) {
		this.tipoDaForma = tipoDaForma;
		System.out.println(this.tipoDaForma);
	}
	public double calcularArea () {
		return 0.0;
	}
	public String getTipoDaForma() {
		return this.tipoDaForma;
	}
	public void setTipoDaForma(String tipoDaForma) {
		this.tipoDaForma = tipoDaForma;
	}
}
