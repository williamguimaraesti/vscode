package formageometrica;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo c = new Circulo("Oi sou uma forma Bidimensional e um Circulo");
		c.setRaio(5.5);
		double perimetroC = c.calcularPerimetro();
		double areaC = c.calcularArea();
		
		System.out.println(perimetroC + " - " + areaC);
		
		Quadrado q = new Quadrado("Oi Sou uma forma Bidimensional e um Quadrado");
		q.setLado(6.6);
		double perimetroQ = q.calcularPerimetro();
		double areaQ = q.calcularArea();
		
		System.out.println(perimetroQ + " - " + areaQ);
		
		Triangulo t = new Triangulo("Oi Sou uma forma Bidimensional e um Triângulo");
		t.setBase(7);
		t.setLado(7);
		t.setAltura(6);
		double perimetroT = t.calcularPerimetro();
		double areaT = t.calcularArea();
		
		System.out.println(perimetroT + " - " + areaT);
		
		Esfera e = new Esfera("Oi Sou uma forma Tridimensional e uma Esfera");
		e.setRaio(9);
		double areaE = e.calcularArea();
		double volumeE = e.calcularVolume();
		
		System.out.println(areaE + " - " + volumeE);
		
		Cubo cbo = new Cubo("Oi Sou uma forma Tridimensional e um Cubo");
		cbo.setAresta(3);
		double areaCbo = cbo.calcularArea();
		double volumeCbo = cbo.calcularArea();
		
		System.out.println(areaCbo + " - " + volumeCbo);
		
		Tetraedro tdro = new Tetraedro("Oi Sou uma forma Tridimensional e um Tetraedro");
		tdro.setAresta(11);
		double areaTdro = tdro.calcularArea();
		double volumeTdro = tdro.calcularVolume();
		
		System.out.println(areaTdro + " - " + volumeTdro);
	}

}
