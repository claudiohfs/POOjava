

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o peso:");
        double peso = teclado.nextDouble();

        System.out.println("Digite a altura:");
        double altura = teclado.nextDouble();

        Pessoa pessoa = new Pessoa(peso, altura);

        double imc = pessoa.calcularImc();

        System.out.println("IMC: " + imc);
    }
}