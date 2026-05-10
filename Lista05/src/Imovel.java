package src;

public class Imovel {

    private String endereco;
    private double area;
    private Bairro bairro;
    private Finalidade finalidade;

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public double getArea() { return area; }
    public void setArea(double area) {
        if (area < 0) throw new IllegalArgumentException("Área não pode ser negativa.");
        this.area = area;
    }

    public Bairro getBairro() { return bairro; }
    public void setBairro(Bairro bairro) { this.bairro = bairro; }

    public Finalidade getFinalidade() { return finalidade; }
    public void setFinalidade(Finalidade finalidade) { this.finalidade = finalidade; }

    public double calcularIptu() {
        if (area == 0) throw new IllegalArgumentException("Área não foi definida.");
        if (finalidade == null) throw new IllegalArgumentException("Finalidade não foi definida.");
        if (bairro == null) throw new IllegalArgumentException("Bairro não foi definido.");
        if (bairro.getCoeficienteIptu() < 0) throw new IllegalArgumentException("Coeficiente do bairro não pode ser negativo.");

        double iptuBase;

        switch (finalidade) {
            case RESIDENCIAL:
                iptuBase = area * 1.0;
                break;
            case COMERCIAL:
                if (area <= 100) iptuBase = 500.00;
                else if (area <= 400) iptuBase = 1000.00;
                else iptuBase = area * 2.55;
                break;
            case INDUSTRIAL:
                if (area <= 2000) iptuBase = 1000.00;
                else iptuBase = area * 0.55;
                break;
            default:
                throw new IllegalArgumentException("Finalidade inválida.");
        }

        return iptuBase * bairro.getCoeficienteIptu();
    }
}