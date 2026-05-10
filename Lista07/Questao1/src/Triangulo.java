
public class Triangulo extends Figura {
    private int lado1, lado2, lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        double p = (lado1 + lado2 + lado3) / 2.0;
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    }
}