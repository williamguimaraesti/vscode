import java.util.Scanner;

class Exer21{
	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Litros vendidos:");
			double litros = scan.nextDouble();
			 System.out.println("Tipo de combustível:");
			 String tipo=scan.next();

			 double precoGas = 2.5;
			 double precoAlc = 1.90;	
			 double percDesconto = 0;
			double total = 0;
			double totalDesc = 0;

			if(tipo.equalsIgnoreCase("a")){
					if(litros <=20){
						percDesconto = 3;
					}else{
						percDesconto = 5;
					}
				total = litros * precoAlc;	

			}else if (tipo.equalsIgnoreCase("g")){
				if (litros <=20){
					percDesconto = 4;
				}else {
					percDesconto = 6;
				}
				total = litros * precoGas;
			}

			totalDesc = (total / 100) * percDesconto;
			double precoAPagar = total + totalDesc;

			System.out.println("O valor a ser pago é:" + precoAPagar);
		}
	}
}
