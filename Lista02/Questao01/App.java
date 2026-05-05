

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        System.out.println("Cadastro primeira pessoa");
        System.out.println("_________________________________________________");
        System.out.println("Digite o nome da pessoa: ");
        p1.setNome(sc.nextLine());
        System.out.println("Digite o peso da pessoa: ");
        p1.setPeso(sc.nextDouble());
        sc.nextLine();
        System.out.println("Digite a altura da pessoa: ");
        p1.setAltura(sc.nextDouble());
        sc.nextLine();

        System.out.println("Cadastro segunda pessoa");
        System.out.println("_________________________________________________");
        System.out.println("Digite o nome da pessoa: ");
        p2.setNome(sc.nextLine());
        System.out.println("Digite o peso da pessoa: ");
        p2.setPeso(sc.nextDouble());
        sc.nextLine();
        System.out.println("Digite a altura da pessoa: ");
        p2.setAltura(sc.nextDouble());
        sc.nextLine();

        System.out.println("Cadastro terceira pessoa");
        System.out.println("_________________________________________________");
        System.out.println("Digite o nome da pessoa: ");
        p3.setNome(sc.nextLine());
        System.out.println("Digite o peso da pessoa: ");
        p3.setPeso(sc.nextDouble());
        sc.nextLine();
        System.out.println("Digite a altura da pessoa: ");
        p3.setAltura(sc.nextDouble());
        sc.nextLine();


        System.out.println("Pessoa: " + p3.getNome() + " Peso: " + p3.getPeso() + " Altura: " + p3.getAltura() + " IMC: " + p3.calcImc());
        System.out.println("Pessoa: " + p2.getNome() + " Peso: " + p2.getPeso() + " Altura: " + p2.getAltura() + " IMC: " + p2.calcImc());
        System.out.println("Pessoa: " + p1.getNome() + " Peso: " + p1.getPeso() + " Altura: " + p1.getAltura() + " IMC: " + p1.calcImc());
        sc.close();
    }
}