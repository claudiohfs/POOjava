public class MensalidadeEnsino implements Pagavel {
    private int nrCreditos;
    private double precoCredito;

    public MensalidadeEnsino(int nrCreditos, double precoCredito) {
        this.nrCreditos = nrCreditos;
        this.precoCredito = precoCredito;
    }

    @Override
    public double calcularValorPagar() {
        return nrCreditos * precoCredito;
    }
}