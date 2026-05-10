package src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ImovelTest {

    @Test
    void caso1_areaNegativa() {
        Imovel i = new Imovel();
        assertThrows(IllegalArgumentException.class, () -> i.setArea(-5));
    }

    @Test
    void caso2_semArea() {
        Imovel i = new Imovel();
        i.setFinalidade(Finalidade.RESIDENCIAL);
        i.setBairro(new Bairro("Centro", 1.0));
        assertThrows(IllegalArgumentException.class, i::calcularIptu);
    }

    @Test
    void caso3_semFinalidade() {
        Imovel i = new Imovel();
        i.setBairro(new Bairro("Centro", 1.0));
        i.setArea(250);
        assertThrows(IllegalArgumentException.class, i::calcularIptu);
    }

    @Test
    void caso4_semBairro() {
        Imovel i = new Imovel();
        i.setFinalidade(Finalidade.RESIDENCIAL);
        i.setArea(400);
        assertThrows(IllegalArgumentException.class, i::calcularIptu);
    }

    @Test
    void caso5_residencial400m2() {
        Imovel i = new Imovel();
        i.setBairro(new Bairro("Centro", 1.0));
        i.setArea(400);
        i.setFinalidade(Finalidade.RESIDENCIAL);
        assertEquals(400.00, i.calcularIptu());
    }

    @Test
    void caso6_comercialAte100m2() {
        Imovel i = new Imovel();
        i.setBairro(new Bairro("Centro", 1.0));
        i.setArea(80);
        i.setFinalidade(Finalidade.COMERCIAL);
        assertEquals(500.00, i.calcularIptu());
    }

    @Test
    void caso7_comercialEntre100e400m2() {
        Imovel i = new Imovel();
        i.setBairro(new Bairro("Centro", 1.0));
        i.setArea(250);
        i.setFinalidade(Finalidade.COMERCIAL);
        assertEquals(1000.00, i.calcularIptu());
    }

    @Test
    void caso8_comercialAcima400m2() {
        Imovel i = new Imovel();
        i.setBairro(new Bairro("Centro", 1.0));
        i.setArea(500);
        i.setFinalidade(Finalidade.COMERCIAL);
        assertEquals(1275.00, i.calcularIptu());
    }

    @Test
    void caso9_industrialAte2000m2() {
        Imovel i = new Imovel();
        i.setBairro(new Bairro("Centro", 1.0));
        i.setArea(2000);
        i.setFinalidade(Finalidade.INDUSTRIAL);
        assertEquals(1000.00, i.calcularIptu());
    }

    @Test
    void caso10_industrialAcima2000m2() {
        Imovel i = new Imovel();
        i.setBairro(new Bairro("Centro", 1.0));
        i.setArea(3000);
        i.setFinalidade(Finalidade.INDUSTRIAL);
        assertEquals(1650.00, i.calcularIptu());
    }

    @Test
    void caso11_coeficiente2e5() {
        Imovel i = new Imovel();
        i.setBairro(new Bairro("Nobre", 2.5));
        i.setArea(500);
        i.setFinalidade(Finalidade.RESIDENCIAL);
        assertEquals(1250.00, i.calcularIptu());
    }
}