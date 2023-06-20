package mmc;

public class Imc {

    private String nome;
    private float peso;
    private float altura;

    // métodos da classe

    public float calcularIMC() {
        // (float) = casting =>atribuir o valor de um tipo de variável a outro tipo de
        // variável.
        return (float) (peso / Math.pow(altura, 2));
    }

    String classificarIMC() {
        float imc;
        String classe;
        imc = calcularIMC();

        if (imc <= 18.5) {
            classe = "Abaixo do Peso";
        } else if (imc <= 25) {
            classe = "Peso ideal";
        } else if (imc > 25) {
            classe = "Acima do Peso";
        } else
            classe = "Obesidade";

        return classe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
