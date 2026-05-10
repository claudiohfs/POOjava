import java.util.ArrayList;

public class Contas {
    private ArrayList<Pagavel> contas = new ArrayList<>();

    public void incluirConta(Pagavel conta) {
        contas.add(conta);
    }

    public ArrayList<Pagavel> getContas() { return contas; }

    public double calcularTotalContas() {
        double total = 0;
        for (Pagavel p : contas) {
            total += p.calcularValorPagar();
        }
        return total;
    }
}