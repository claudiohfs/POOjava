public class Main {
    public static void main(String[] args) {

        Contas contas = new Contas();

        ContaAgua agua;
        agua = new ContaAgua(15, 4.50);
        contas.incluirConta(agua);

        MensalidadeEnsino mensalidade = new MensalidadeEnsino(20, 85.00);
        contas.incluirConta(mensalidade);

        PrevidenciaPrivada prev1 = new PrevidenciaPrivada();
        prev1.setValor(300.00);
        prev1.investir();
        contas.incluirConta(prev1);

        PrevidenciaPrivada prev2 = new PrevidenciaPrivada();
        prev2.setValor(500.00);
        prev2.investir();
        contas.incluirConta(prev2);

        System.out.printf("Total das contas: R$ %.2f%n%n", contas.calcularTotalContas());

        System.out.println("=== Todas as contas ===");
        for (Pagavel p : contas.getContas()) {
            System.out.printf("Valor a pagar: R$ %.2f", p.calcularValorPagar());

            if (p instanceof PrevidenciaPrivada) {
                PrevidenciaPrivada pp = (PrevidenciaPrivada) p;
                System.out.printf(" | Saldo acumulado: R$ %.2f", pp.getSaldo());
            }

            System.out.println();
        }
    }
}