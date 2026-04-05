package Questao01;

public class App {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa(78, 1.75);

        double imc = pessoa.calcularImc();

        System.out.println("IMC: " + imc);
    }
}