package Questao03;

public class Pessoa {

    double peso;
    double altura;

    public Pessoa(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularImc() {
        return peso / (altura * altura);
    }
}