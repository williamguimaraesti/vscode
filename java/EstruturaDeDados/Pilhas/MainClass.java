public class MainClass{
  public static void main(String args[]){
    Pilha p = new Pilha();
    
    p.push(5);
    p.push(4);
    p.push(3);
    p.push(2);
    p.push(1);
    
    while (!p.isEmpty()){
      int elemento = p.pop();
      System.out.println("Desempilhei " + elemento);
    }

    int e = p.pop();
  }
}