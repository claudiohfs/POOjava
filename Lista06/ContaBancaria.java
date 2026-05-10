package src;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private String numero;
    private double saldo;
    private Cliente titular;
    private List<Movimento> movimentos = new ArrayList<>();

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public double getSaldo() { return saldo; }

    protected void setSaldo(double saldo) { this.saldo = saldo; }

    public Cliente getTitular() { return titular; }
    public void setTitular(Cliente titular) { this.titular = titular; }

    public ArrayList<Movimento> getMovimentos() { return (ArrayList<Movimento>) movimentos; }

    protected void incluirMovimento(Movimento m) {
        movimentos.add(m);
    }

    public void depositar(double valor) {
        if (valor <= 0) throw