package src;

public class Bairro {
    private String nome;
    private double coeficienteIptu;

    public Bairro(String nome, double coeficienteIptu) {
        this.nome = nome;
        this.coeficienteIptu = coeficienteIptu;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getCoeficienteIptu() { return coeficienteIptu; }
    public void setCoeficienteIptu(double coeficienteIptu) { this.coeficienteIptu = coeficienteIptu; }
}