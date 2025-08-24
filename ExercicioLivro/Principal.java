public class Principal{
    public static void main(String[] args){
        //array para armazenar os 3 clientes
        Cliente[] clientes = new Cliente[3];
        
        //loop para criar os 3 clientes
        for (int i = 0; i < 3; i++){
            System.out.println("=== Cadastro do Cliente " + (i + 1) + "===");
            
            //entrada de dados do cliente
            String nome = Teclado.leString("Digite o nome:");
            int idade = Teclado.leInt("Digite a idade:");
            char sexo = Teclado.leChar("Digite o sexo (M/F):");
            String email = Teclado.leString("Digite o email:");
            String senha = Teclado.leString("Digite a senha:");

            //entrada de dados do livro
            System.out.println("-- Dados do livro do cliente --");
            String titulo = Teclado.leString("Título do livro:");
            String autor = Teclado.leString("Autor do livro:");
            int anoPublicacao = Teclado.leInt("Ano de publicação:");
            double preco = Teclado.leDouble("Preço do livro:");
            int quantidadePaginas = Teclado.leInt("Quantidade de páginas:");
            
            //criação objeto Livro
            Livro livro = new Livro(titulo, autor, anoPublicacao, preco, quantidadePaginas);
            
            //criação objeto Cliente com livro
            Cliente cliente = new Cliente(nome, idade, sexo, email, senha, livro);
            
            //armazenar no array
            clientes[i] = cliente;
        }
        
        //imprimir preço por página de cada livro
        System.out.println("=== Preço por Página dos Livros ===");
        for (int i = 0; i < 3; i++) {
            Cliente c = clientes[i];
            Livro l = c.getLivro();

            double precoPorPagina = l.calcularPrecoPagina();

            System.out.printf("Cliente %s está com o livro \"%s\", e o preço por página deste livro é R$ %.2f%n",
                              c.getNome(), l.getTitulo(), precoPorPagina);
        }

        //imprimir as informações completas dos clientes
        System.out.println("\n=== Informações dos Clientes ===");
        for (int i = 0; i < 3; i++) {
            clientes[i].imprimeInformacoes();
            System.out.println("---------------------------");
        }
    }
}