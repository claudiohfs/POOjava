package Funcionario;

public class Funcionario {

    private String nome;
    private double salario;

    // Constantes
    private static final double FAIXA_1_LIMITE_SUP = 1903.98;
    private static final double FAIXA_2_LIMITE_SUP = 2826.65;
    private static final double FAIXA_3_LIMITE_SUP = 3751.05;
    private static final double FAIXA_4_LIMITE_SUP = 4664.68;

    private static final double ALIQUOTA_FAIXA_2 = 0.075;
    private static final double ALIQUOTA_FAIXA_3 = 0.15;
    private static final double ALIQUOTA_FAIXA_4 = 0.225;
    private static final double ALIQUOTA_FAIXA_5 = 0.275;

    public Funcionario() {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularIrpf() {
        double imposto = 0;
        // Faixa 2
        if (salario > 1903.98) {
            if (salario <= 2826.65) {
                imposto += (salario - 1903.98) * 0.075;
            } else {
                imposto += (2826.65 - 1903.98) * 0.075;
            }
        }
        // Faixa 3
        if (salario > 2826.65) {
            if (salario <= 3751.05) {
                imposto += (salario - 2826.65) * 0.15;
            } else {
                imposto += (3751.05 - 2826.65) * 0.15;
            }
        }
        // Faixa 4
        if (salario > 3751.05) {
            if (salario <= 4664.68) {
                imposto += (salario - 3751.05) * 0.225;
            } else {
                imposto += (4664.68 - 3751.05) * 0.225;
            }
        }
        // Faixa 5
        if (salario > 4664.68) {
            imposto += (salario - 4664.68) * 0.275;
        }

        return imposto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
}