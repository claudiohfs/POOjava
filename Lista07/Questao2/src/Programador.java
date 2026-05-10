import java.util.ArrayList;

public class Programador extends Funcionario {
    private ArrayList<String> linguagens = new ArrayList<>();

    public Programador(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public void incluirLinguagem(String linguagem) { linguagens.add(linguagem); }
    public void removerLinguagem(String linguagem) { linguagens.remove(linguagem); }
    public ArrayList<String> getLinguagens() { return linguagens; }

    @Override
    public double calcularSalario() {
        boolean conheceJava = linguagens.stream()
                .anyMatch(l -> l.equalsIgnoreCase("Java"));
        return conheceJava ? getSalarioBase() * 1.20 : getSalarioBase();
    }
}