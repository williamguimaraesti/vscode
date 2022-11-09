import java.util.Scanner;

class Exer05{
	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite a 1º nota:");
			double nota1 = scan.nextDouble();
			System.out.println("Digite a 2º nota");	
			double nota2 = scan.nextDouble();

			double media = (nota1 + nota2)/2;

			if  (media ==10){
				System.out.println("Aprovado com Louvor✨");
			} else if (media >=7) {
				System.out.println("Aprovado");
			}else{
				System.out.println("Reprovado");
			}
		}
	}
}
