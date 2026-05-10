package src;

public class ContaEspecial extends ContaBancaria {
    private double limiteCredito;

    public double getLimiteCredito() { return limiteCredito; }
    public void setLimiteCredito(double limiteCredito) { this.limiteCredito = limiteCredito; }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor inválido.");
        if (valor > getSaldo() + limiteCredito) throw new IllegalArgumentException("Valor superior ao saldo e limite.");
        setSaldo(getSaldo() - valor);
        incluirMovimento(new Movimento(valor, TipoMovimento.DEBITO));
    }
}