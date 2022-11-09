import java.util.Scanner;

class Exer08{
	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("1° preço:");
			double preco1 = scan.nextDouble();
			System.out.println("2º preço:");
			double preco2 = scan.nextDouble();
			System.out.println("3° preço:");
			double preco3 = scan.nextDouble();

			if (preco1 < preco2 && preco1 < preco3) {
				System.out.println("O 1° produto é o mais barato.");
			} else if (preco2 < preco1 && preco2 > preco3) {
				System.out.println("O 2º produto é o mais barato.");
			}else {
				System.out.println("O 3º produto é o mais barato.");
		    }
		}
	}
	
}