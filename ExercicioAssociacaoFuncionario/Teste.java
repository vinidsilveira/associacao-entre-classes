public class Teste {
    private static void titulo(String txt) {
        System.out.println("\n==================================================");
        System.out.println(" " + txt);
        System.out.println("==================================================");
    }

    private static void subtitulo(String txt) {
        System.out.println("\n--- " + txt + " ---");
    }

    private static void linhaTabela() {
        System.out.println("+----------------+------------+");
    }

    public static void main(String args[]) {

        // Cadastro do Funcionário 1
        titulo("Cadastro do Funcionário 1");
        String nome = Teclado.leString("Nome......................: ");
        String endereco = Teclado.leString("Endereço..................: ");
        String sexo = Teclado.leString("Sexo......................: ");
        String corCalculadora = Teclado.leString("Cor da calculadora........: ");

        FuncionarioCaixa funcionario =
            new FuncionarioCaixa(nome, endereco, sexo, corCalculadora);

        // Resultados das operações (usando a calculadora do funcionário)
        titulo("Resultados das Operações");
        linhaTabela();
        System.out.printf("| %-14s | %10s |\n", "Expressão", "Resultado");
        linhaTabela();
        System.out.printf("| %-14s | %10.2f |\n", "2 + 2", funcionario.soma(2, 2));
        System.out.printf("| %-14s | %10.2f |\n", "5 - 4", funcionario.subtrai(5, 4));
        System.out.printf("| %-14s | %10.2f |\n", "2 x 3", funcionario.multiplica(2, 3));
        System.out.printf("| %-14s | %10.2f |\n", "6 / 3", funcionario.divide(6, 3));
        System.out.printf("| %-14s | %10d |\n", "7^2",   funcionario.elevaQuadrado(7)); 
        System.out.printf("| %-14s | %10d |\n", "8^3",   funcionario.elevaCubo(8));      
        linhaTabela();

        // Cadastro do Funcionário 2
        titulo("Cadastro do Funcionário 2");
        String nome2 = Teclado.leString("Nome......................: ");
        String endereco2 = Teclado.leString("Endereço..................: ");
        String sexo2 = Teclado.leString("Sexo......................: ");
        String corCalculadora2 = Teclado.leString("Cor da calculadora........: ");

        FuncionarioCaixa funcionario2 =
            new FuncionarioCaixa(nome2, endereco2, sexo2, corCalculadora2);

        // Cadastro da Empresa
        titulo("Cadastro da Empresa");
        String nomeEmpresa = Teclado.leString("Nome da empresa...........: ");

        Empresa empresa1 = new Empresa(nomeEmpresa, funcionario, funcionario2);

        // Exibição final
        titulo("Informações da Empresa");
        empresa1.imprimeInfo();
        System.out.println(); // linha em branco final
    }
}
