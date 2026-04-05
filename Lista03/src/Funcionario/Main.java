package Funcionario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[5];

        for (int i = 0; i < 5; i++) {

            funcionarios[i] = new Funcionario();

            System.out.println("Funcionário " + (i + 1));

            System.out.print("Nome: ");
            funcionarios[i].setNome(sc.nextLine());

            System.out.print("Salário: ");
            funcionarios[i].setSalario(sc.nextDouble());
            sc.nextLine();
        }

        System.out.println("Lista:");

        for (int i = 0; i < 5; i++) {

            System.out.println("Nome: " + funcionarios[i].getNome());
            System.out.println("Salário: " + funcionarios[i].getSalario());
            System.out.println("IRPF: " + funcionarios[i].calcularIrpf());
            System.out.println("-------------------");
        }

        sc.close();
    }
}