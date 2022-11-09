import java.util.Scanner;

class Exer12{
	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe o valor/hora: ");
			double valorHora = scan.nextDouble();
			System.out.println("Informe a quantidade de horas trabalhadas no mês:");
			double qtdHoras = scan.nextDouble(); 
			
			double salarioBruto = valorHora * qtdHoras;

			int percentualIR = 0;
			int percentualINSS = 10;
			int percentualFGTS = 11;

			if (salarioBruto <= 900) {
				percentualIR = 0;

			} else if (salarioBruto > 900 && salarioBruto <= 1500) {
				percentualIR = 5;

			}else if (salarioBruto > 1500 && salarioBruto <= 2500) {
				percentualIR = 10;

			}else if(salarioBruto >2500){
				percentualIR = 15;
			
			}

			double ir = (salarioBruto / 100) * percentualIR;
			double inss = (salarioBruto / 100) * percentualINSS;
			double fgts = (salarioBruto / 100) * percentualFGTS;
			double totalDecontos = ir + inss;
			double salarioLiquido = salarioBruto - totalDecontos;

			System.out.println("salário Bruto (" + valorHora + " * " + qtdHoras + "):R$" + salarioBruto );
			System.out.println("(-) IR (" + percentualIR + "%):R$" + ir);
			System.out.println("(-) INSS (" + percentualINSS + "%):R$" + inss);
			System.out.println("(-) FGTS (" + percentualFGTS + "%):R$" + fgts);
			System.out.println("Total de Descontos:R$" + totalDecontos);
			System.out.println("salário Liquido:R$" + salarioLiquido);



			
		}
	}
}
