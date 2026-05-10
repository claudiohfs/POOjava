public class ContaAgua implements Pagavel {
    private int metrosCubicos;
    private double precoMetroCubico;

    public ContaAgua(int metrosCubicos, double precoMetroCubico) {
        this.metrosCubicos = metrosCubicos;
        this.precoMetroCubico = precoMetroCubico;
    }

    @Override
    public double calcularValorPagar() {
        return metrosCubicos * precoMetroCubico;
    }
}