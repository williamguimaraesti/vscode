import java.util.Scanner;

class Exer14{
	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Primeira nota:");
			double nota1 = scan.nextDouble();
			System.out.println("Segunda nota:");
			double nota2 = scan.nextDouble();

			double media = (nota1 + nota2) / 2;

			String aproveitamento = " ";

			if (media >= 9 && media <= 10  ) {
				aproveitamento = "A";
				
			} else if (media >= 7.5 && media < 9  ) {
				aproveitamento = "B";	

			}else if (media >= 6 && media < 7.5  ) {
				aproveitamento = "C";
				
			}else if (media >= 4 && media < 6  ) {
				aproveitamento = "D";
				
			}if (media >= 0 && media < 4  ) {
				aproveitamento = "E";
			}

			System.out.println("Primeira nota:" + nota1);
			System.out.println("Segunda nota:" + nota2);
			System.out.println("Conceito:" + aproveitamento);
			System.out.println("Média: " + media);
			switch (aproveitamento){
				case "A": 
				case "B": 
				case "C": System.out.println("Aprovado"); break;
				case "D":
				case "E": System.out.println("Reprovado"); break;
				default: break;
			}
		}
	}
}
