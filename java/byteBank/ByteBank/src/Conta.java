public class Conta {
    String titular;
    int agencia;
    int numConta;
    float saldo;
    
    public Conta(String titular, int agencia, int numConta, float saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
        
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String Cliente) {
        this.titular = Cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    } 

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}