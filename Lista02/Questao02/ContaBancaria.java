package Questao02;

public class ContaBancaria {
    String numero;
    String titular;
    double saldo;

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) throws IllegalAccessException {
        if(valor<0){
            throw new IllegalAccessException("Valor Incorreto");
        }
        this.saldo += valor;
    }
    public void sacar(double valor) throws IllegalAccessException {
        if(valor < 0){
            throw new IllegalAccessException("Valor Incorreto");
        }
        if(valor > saldo){
            throw new IllegalAccessException("Saldo insuficiente");
        }
        saldo -= valor;
    }
    public void transferir(ContaBancaria contaDestino, double valor) throws IllegalAccessException {

        this.sacar(valor);
        contaDestino.depositar(valor);

    }

}
