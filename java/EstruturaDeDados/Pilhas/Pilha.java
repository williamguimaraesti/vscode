public class Pilha{

    int[] elementos; // Vetor para armazenar os elementos
    int topo; // Indice que indica qual em que posição esta o último elemento armazenado.

    public Pilha(){ // Construtor para gerar a inicialização. 
        elementos = new int[10];
        topo      = -1; // Apontar para uma posição anterior ao inicio do vetor, mostra que a pilha esta vazia. Como no java todo vetor começa com zero a posição anterior é -1.
    }
    public void push(int e){ //Empilhar
        if(isFull()){
            throw new RuntimeException("Stack Overflow"); // Lança uma exceção caso a pilha esteja cheia.
        }
        topo++;
        elementos[topo] = e;
    }

    public int pop(){ //Desempilhar
        if(isEmpty()){
            throw new RuntimeException("Empty Stack"); // Lança uma exceção caso a pilha esteja vazia.
        }
        int e;
        e = elementos[topo];
        topo--;
        return e;
    }

    public boolean isEmpty(){ // Mostra se a pilha está vazia 
        return (topo == -1);
    }

    public boolean isFull(){ // Mostra se é possível empilhar mais elementos ou se a pilha esta cheia.
        return (topo == -9);
    }

    public int top(){ // Retorna quem está no topo sem desempilhar
        if(isEmpty()){
            throw new RuntimeException("Empty Stack"); // lança uma exceção caso queira tirar um elemento do topo sendo que a pilha esta vazia.
        }
        return elementos[topo];
    }

}
