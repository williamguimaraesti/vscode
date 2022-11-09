import java.util.Scanner;

class Exer03{
	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite uma letra (F ou M):");
			String letra = scan.next();
			if (letra.equalsIgnoreCase("F")) {  
				System.out.println("Feminino");
			} else if (letra.equalsIgnoreCase("M")){
				System.out.println("Masculino");
			}else{
				System.out.println("Sexo Inválido.");
			}
		}
	}
}
