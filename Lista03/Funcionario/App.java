package Funcionario;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Funcionario f = new Funcionario();

        System.out.print("Nome: ");
        f.setNome(sc.nextLine());

        System.out.print("Salário: ");
        f.setSalario(sc.nextDouble());

        System.out.println("Nome: " + f.getNome());
        System.out.println("Salário: " + f.getSalario());
        System.out.println("IRPF: " + f.calcularIrpf());

        sc.close();
    }
}