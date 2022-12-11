package questaoNove;
import java.util.Scanner;

public class CalcSalario {
    
    public static void main(String[] args) {

        BaseCalcSalario pag = new BaseCalcSalario();
        Scanner teclado = new Scanner(System.in);

        int escolhe = 1;
        
        while(escolhe != 2){
            System.out.println("Digite o número de horas trabalhadas por dia: ");
            pag.setNhtd(teclado.nextInt());
            System.out.println("Digite o valor da hora de trabalho: ");
            pag.setVht(teclado.nextFloat());
            System.out.println("Digite o total de dias trabalhados no mês: ");
            pag.setNdm(teclado.nextInt());

            System.out.println("O valor do salário é:R$" + pag.salario());
            
            System.out.println("Deseja realizar outro calculo salarial?\nDigite 1-Sim ou 2-Não");
            escolhe = Integer.parseInt(teclado.nextLine());          
        }   
         
        System.out.println("Obrigado");
        teclado.close();
    }
}
