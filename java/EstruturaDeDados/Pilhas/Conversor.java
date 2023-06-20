public class Conversor {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        Pilha p = new Pilha();

        int resto;

        //fase 1 = empilhamento dos restos
        while (numero !=0){
            resto= numero % 2;   //Resto da divisão deste número por 2 (vale 0 ou 1).
            p.push(resto);       //Armazena na pilha.
            numero = numero / 2; //Gera um novo número, resultado da divisão dele por 2.
        }

        //fase 2 = exibição dos restos
        while (!p.isEmpty()) {
            resto = p.pop();     //Remove da pilha(Sempre o elemento do topo).
            System.out.println(resto);
        }
        System.out.println("\nFim do programa.");
    }
}

//Para executar o programa, abra o terminal dentro do diretório onde o arguivo esta salvo e digite - java Conversor <número que deseja converter> de decimal para binário.
//(172)10 = (10101100)/2