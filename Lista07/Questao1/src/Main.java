
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a figura: 1-Quadrado, 2-Retangulo, 3-Triangulo, 4-Circulo");
        int opcao = sc.nextInt();

        Figura figura;

        switch (opcao) {
            case 1:
                System.out.print("Medida: ");
                figura = new Quadrado(sc.nextInt());
                break;
            case 2:
                System.out.print("Largura: ");
                int l = sc.nextInt();
                System.out.print("Altura: ");
                figura = new Retangulo(l, sc.nextInt());
                break;
            case 3:
                System.out.print("Lado 1: "); int a = sc.nextInt();
                System.out.print("Lado 2: "); int b = sc.nextInt();
                System.out.print("Lado 3: ");
                figura = new Triangulo(a, b, sc.nextInt());
                break;
            case 4:
                System.out.print("Raio: ");
                figura = new Circulo(sc.nextInt());
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.printf("Área: %.2f%n", figura.calcularArea());
        sc.close();
    }
}