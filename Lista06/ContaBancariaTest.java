package src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {

    @Test
    void caso1_verificarMovimentos() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000.00);
        conta.sacar(250.00);

        assertEquals(2, conta.getMovimentos().size());

        Movimento primeiro = conta.getMovimentos().get(0);
        assertEquals(TipoMovimento.CREDITO, primeiro.getTipoMovimento());
        assertEquals(1000.00, primeiro.getValor());

        Movimento segundo = conta.getMovimentos().get(1);
        assertEquals(TipoMovimento.DEBITO, segundo.getTipoMovimento());
        assertEquals(250.00, segundo.getValor());
    }
}