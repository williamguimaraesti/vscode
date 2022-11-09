import java.util.Scanner;

class Exer16{
	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Valor de a:");
			int a = scan.nextInt();

			if (a == 0) {
				System.out.println("Não é uma equação de segundo grau");

			}else {
				System.out.println("Entre com valor de b:");
				int b = scan.nextInt();
				System.out.println("Entre com valor de c:");
				int c = scan.nextInt();

				double delta = (b*b) - (4*a*c);
				if (delta < 0){
					System.out.println("delta negativo");

				}else {

					System.out.println("Delta:" + delta);
					double x1 = (( -b) + Math.sqrt(delta)) / (2*a); // Calculo da raiz quadrada no java
					double x2 =  (( -b) - Math.sqrt(delta)) / (2*a);
					
					System.out.println("x1= " + x1);
					System.out.println("x1= " + x2);
				}
			}
		}
	}
}
