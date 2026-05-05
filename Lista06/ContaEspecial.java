package Lista06ista06;
import Lista02.Questao02.ContaBancaria;
import java.lang.reflect.Executable;

public class ContaEspecial extends ContaBancaria {
    private double limiteCredito;

    public ContaEspecial(String titular, String numero){
        super(titular, numero);
        limiteCredito = 300;

    }

    @Override
    public void sacar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("valor invalido");
        }

        if(valor > (getSaldo() + limiteCredito)){
            throw new IllegalArgumentException("limite insuficiente");
        }

        double saldo = getSaldo();
        saldo -= valor;
        if (saldo < valor){
            double excedente = (valor - getSaldo());
            limiteCredito -= excedente;
        } else {
            saldo -= valor;
        }

        setSaldo(saldo);
    }

    


}
