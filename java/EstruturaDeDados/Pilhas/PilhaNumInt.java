public class PilhaNumInt {
    
    private int valores[];
    private int topo;

    public PilhaNumInt(){
        valores = new int[10];
        topo = -1; // Apontar para uma posição anterior ao inicio do vetor, mostra que a pilha esta vazia. Como no java todo vetor começa com zero a posição anterior é -1.
    }

    public void push(int elemento){
        topo = topo ++;
        valores [topo] = elemento;
    }

    public boolean isEmpty(){
        return (topo == -1);
    }

    public boolean isFull(){
        return (topo == 9);
    }  

    public int pop(){
        int e = valores [topo];
        topo--;
        return e;
    }
}