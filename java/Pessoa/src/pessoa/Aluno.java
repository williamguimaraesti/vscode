package pessoa;

public class Aluno extends Pessoa {
    // atributos
    public Aluno(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
    }

    private int matricula;
    public double tirarCopia;
    int copia;

    public double matricula() {
        return matricula;
    }

    public void tirarCopia() {
        if (this.copia() > 0) {
            System.out.println("Tirando copia.");
        } else {
            System.out.println("Não está copiando");
        }
    }

    private int copia() {
        return 0;
    }

}
