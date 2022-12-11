package questaoSete;

public class OperacaoMat {
    private float soma;
    private float sub;
    private float mult;
    private float div;

    // método somar
    public float contSoma( float n1, float n2 ){
        float resultado = n1 + n2;
        return resultado;
    }
    // método subtrair
    public float contSub( float n1, float n2 ){
        float resultado = n1 - n2;
        return resultado;
    }
    // método multiplicar
    public float contMult( float n1, float n2 ){
        float resultado = n1 * n2;
        return resultado;
    }
    // método dividir
    public float contDiv( float n1, float n2 ){
        float resultado = n1 / n2;
        return resultado;
    }

    public float getSoma(){
        return soma;
    }

    public void setSoma (float soma){
        this.soma = soma;
    }

    public float getSub(){
        return sub;
    }

    public void setSub (float sub){
        this.sub = sub;
    }

    public float getMult(){
        return mult;
    }

    public void setMult (float mult){
        this.mult = mult;
    }

    public float getDiv(){
        return div;
    }

    public void setDiv (float div){
        this.div = div / 1;
    }
}