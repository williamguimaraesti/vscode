public class Fibonacci {
    public static void main(String[] args) {
        int vetorFibonacci[] = new int[102]; // inicializa o array com 102 posições
        vetorFibonacci[0] = 0; // atribui 0 à primeira posição
        vetorFibonacci[1] = 1; // atribui 1 à segunda posição
        for (int i = 2; i < 102; ++i) { // 2 e não 3 - os arrays em java começam na posição 0
            vetorFibonacci[i] = vetorFibonacci[i - 1] + vetorFibonacci[i - 2];
        }
        for (int x = 0; x < 102; x++) {
            System.out.println(vetorFibonacci[x]);
        }
    }
}