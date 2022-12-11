package questaoSete;
import java.util.Scanner;

public class Calcula {
   public static void main(String[] args, float result) {
    float n1, n2;
    int aperacao, escolha = 1;

    Scanner teclado = new Scanner(System.in);

    OperacaoMat valor = new OperacaoMat();
    valor.setSoma (n1 + n2);
    valor.setSub  (n1 - n2);
    valor.setMult (n1 * n2);
    valor.setDiv  (n1 / n2);

    while(escolha != 2){
        System.out.println("Qual operação deseja realizar\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão");
        int operacao = teclado.nextInt();

        if (operacao  == 1) {
            System.out.println("Digite o primeiro valor:");
            n1 = Float.parseFloat(teclado.nextLine());
            System.out.println("Digite o segundo valor:");
            n2 = Float.parseFloat(teclado.nextLine());
            System.out.println("O resultado da soma:" + valor.contSoma(n1, n2));
        } else if (operacao  == 2) {
            System.out.println("Digite o primeiro valor:");
            n1 = Float.parseFloat(teclado.nextLine());
            System.out.println("Digite o segundo valor:");
            n2 = Float.parseFloat(teclado.nextLine());
            System.out.println("O resultado da subtração:" + valor.contSub(n1, n2));
        } else if (operacao  == 3) {
            System.out.println("Digite o primeiro valor:");
            n1 = Float.parseFloat(teclado.nextLine());
            System.out.println("Digite o segundo valor:");
            n2 = Float.parseFloat(teclado.nextLine());
            System.out.println("O resultado da Multiplicação:" + valor.contMult(n1, n2));
        } else if (operacao == 4) {
            System.out.println("Digite o primeiro valor:");
            n1 = Float.parseFloat(teclado.nextLine());
            System.out.println("Digite o segundo valor:");
            n2 = Float.parseFloat(teclado.nextLine());
            System.out.println("O resultado da Divisão:" + valor.contDiv(n1, n2));
        } else {
            System.out.println("Por favor escolha uma opção valida.");
        } 
        System.out.println("Deseja realizar mais uma conversão de moeda?\n1-Sim ou 2-Não"); 
        escolha = teclado.nextInt();                  
    }
    System.out.println("Obrigado.");
    teclado.close();
   } 
}
