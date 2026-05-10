import java.util.ArrayList;

public class Vendedor extends Funcionario {
    private double percentualComissao;
    private ArrayList<Venda> vendas = new ArrayList<>();

    public Vendedor(String nome, double salarioBase, double percentualComissao) {
        super(nome, salarioBase);
        this.percentualComissao = percentualComissao;
    }

    public double getPercentualComissao() { return percentualComissao; }
    public void setPercentualComissao(double percentualComissao) { this.percentualComissao = percentualComissao; }

    public ArrayList<Venda> getVendas() { return vendas; }

    public void incluirVenda(Venda v) {
        vendas.add(v);
    }

    @Override
    public double calcularSalario() {
        double totalVendas = 0;
        for (Venda v : vendas) {
            totalVendas += v.getValor();
        }
        return getSalarioBase() + (totalVendas * percentualComissao / 100);
    }
}