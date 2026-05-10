public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("FURB");

        // Vendedores
        Vendedor luiz = new Vendedor("Luiz", 1000, 10);
        luiz.incluirVenda(new Venda(200));
        luiz.incluirVenda(new Venda(100));

        Vendedor paula = new Vendedor("Paula", 1200, 7);
        paula.incluirVenda(new Venda(500));
        paula.incluirVenda(new Venda(350));
        paula.incluirVenda(new Venda(280));

        // Programadores
        Programador julio = new Programador("Julio", 1000);
        julio.incluirLinguagem("C");
        julio.incluirLinguagem("Java");

        Programador ana = new Programador("Ana", 1000);
        ana.incluirLinguagem("Java");
        ana.incluirLinguagem("C#");

        Programador anderson = new Programador("Anderson", 1200);
        anderson.incluirLinguagem("Python");

        // Demais funcionários
        Funcionario jose = new Funcionario("José", 1000);
        Funcionario maria = new Funcionario("Maria", 1400);

        // Incluir na empresa
        empresa.incluirFuncionario(luiz);
        empresa.incluirFuncionario(paula);
        empresa.incluirFuncionario(julio);
        empresa.incluirFuncionario(ana);
        empresa.incluirFuncionario(anderson);
        empresa.incluirFuncionario(jose);
        empresa.incluirFuncionario(maria);

        // Custo total
        System.out.printf("Custo total: R$ %.2f%n%n", empresa.calcularCustosSalarios());

        // Nome e salário de todos
        System.out.println("=== Funcionários ===");
        for (Funcionario f : empresa.getFuncionarios()) {
            System.out.printf("%s - R$ %.2f%n", f.getNome(), f.calcularSalario());
        }

        // Vendedores e comissão
        System.out.println("\n=== Vendedores ===");
        for (Funcionario f : empresa.getFuncionarios()) {
            if (f instanceof Vendedor) {
                Vendedor v = (Vendedor) f;
                System.out.printf("%s - Comissão: %.0f%%%n", v.getNome(), v.getPercentualComissao());
            }
        }

        // Programadores e linguagens
        System.out.println("\n=== Programadores ===");
        for (Funcionario f : empresa.getFuncionarios()) {
            if (f instanceof Programador) {
                Programador p = (Programador) f;
                System.out.printf("%s - Linguagens: %s%n", p.getNome(), p.getLinguagens());
            }
        }
    }
}