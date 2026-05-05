
import java.util.Scanner;

public class Aoo {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();

        System.out.println("Digite o número da primeira conta: ");
        conta1.setNumero(sc.nextLine());

        System.out.println("digite o nome do titular da primeira conta: ");
        conta1.setTitular(sc.nextLine());

        System.out.println("Digite o número da segunda conta: ");
        conta2.setNumero(sc.nextLine());

        System.out.println("digite o nome do titular da segunda conta: ");
        conta2.setTitular(sc.nextLine());

        conta1.depositar(1000);
        conta1.depositar(700);
        conta2.depositar(5000);
        conta2.sacar(3000);
        conta2.transferir(conta1, 1800);

        System.out.println("O titular: " + conta1.getTitular() + " Possui: R$" + conta1.getSaldo());
        System.out.println("O titular: " + conta2.getTitular() + " Possui: R$" + conta2.getSaldo());
    }
}
