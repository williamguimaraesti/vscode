import java.util.Scanner;

class Exer15 {
	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Primeiro lado do triângulo:");
			int lado1 = scan.nextInt();
			System.out.println("Segundo lado do triângulo:");
			int lado2 = scan.nextInt();
			System.out.println("Terceiro lado do triângulo:");
			int lado3 = scan.nextInt();

			if (((lado1 + lado2) > lado3 ) && ((lado1 +lado3) > lado2) && ((lado2 + lado3) > lado1)) {
				if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3);{
					System.out.println("Triangulo Equilátero");

		        	}else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2){
			  			System.out.println("Triangulo Escaleno");

		  				}else if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2){
							System.out.println("Triângulo Isóceles");

		  				}

			}else{
				System.out.println("Não é um triângulo");
			}
	
		}		
	}
}
