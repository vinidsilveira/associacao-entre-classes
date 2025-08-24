public class Principal{
    // Lê o preço pelo Teclado garantindo valor > 0
    private static double lerPrecoPositivo(String mensagem){
        double valor;
        do {
            valor = Teclado.leDouble(mensagem);
            if (valor <= 0){
                System.out.println("Preço inválido. Digite um valor MAIOR que zero.");
            }
        } while (valor <= 0);
        return valor;
    }
    
    // Retorna o produto mais caro entre dois (podem ser null)
    private static Produto maisCaro(Produto a, Produto b){
        if (a == null) return b;
        if (b == null) return a;
        return (a.getPreco() >= b.getPreco()) ? a : b;
    }
    
    // Produto mais caro do mercado (olhando as duas prateleiras)
    private static Produto produtoMaisCaroMercado(Mercado mercado){
        Prateleira p1 = mercado.getPrateleira1();
        Prateleira p2 = mercado.getPrateleira2();
        Produto maisCaro = null;
        
        maisCaro = maisCaro(maisCaro, p1.getProduto1());
        maisCaro = maisCaro(maisCaro, p1.getProduto2());
        maisCaro = maisCaro(maisCaro, p1.getProduto3());
        maisCaro = maisCaro(maisCaro, p2.getProduto1());
        maisCaro = maisCaro(maisCaro, p2.getProduto2());
        maisCaro = maisCaro(maisCaro, p2.getProduto3());
        
        return maisCaro;
    }
    
    // Imprime todos os produtos vencidos na data ref
    private static void imprimirProdutosVencidos(Mercado mercado, Data dataRef){
        System.out.println("\n=== Produtos vencidos em " + dataRef + " ===");
        
        Prateleira[] prats = { mercado.getPrateleira1(), mercado.getPrateleira2()};
        boolean achou = false;
        
        for (int i = 0; i < prats.length; i++){
            Produto[] ps = {
                prats[i].getProduto1(),
                prats[i].getProduto2(),
                prats[i].getProduto3()
            };
            for (Produto p : ps){
                if (p != null && p.verificaProdutoVencido(dataRef)){
                    System.out.println(p); // usa toString do Produto
                    achou = true;
                }
            }
        }
        
        if (!achou){
            System.out.println("Nenhum produto vencido nessa data.");
        }
    }
    
    public static void main(String[] args){        
        System.out.println("=== Mercado ===");
        
        // Prateleira A: 3 produtos com preço lido do Teclado
        double precoAmaciante = lerPrecoPositivo("Preço do amaciante: ");
        double precoCremeDental = lerPrecoPositivo("Preco do creme dental: ");
        double precoLeiteCondensado = lerPrecoPositivo("Preço do leite condensado: ");
        
        Produto p1 = new Produto("Amaciante", precoAmaciante, new Data(10, 4, 2014));
        Produto p2 = new Produto("Creme dental", precoCremeDental, new Data(5, 5, 2015));
        Produto p3 = new Produto("Leite Condensado", precoLeiteCondensado, new Data(4, 12, 2012));
        
        Prateleira prateleiraA = new Prateleira(p1, p2, p3);
        
        // Prateleira B: começa vazia; depois insere "cortina"
        Prateleira prateleiraB = new Prateleira(); // sem produtos
        Produto cortina = new Produto("Cortina", 167.98, new Data(13, 10, 2025));
        prateleiraB.setProduto1(cortina); // insere cortina na prateleira vazia
        
        // Mercado com duas prateleiras
        Mercado mercado = new Mercado(prateleiraA, prateleiraB);
        
        // Mostrar produtos vencidos na data 25/04/2023
        Data dataRef = new Data(25, 4, 2023);
        imprimirProdutosVencidos(mercado, dataRef);
        
        // Imprime informações do produto mais caro do mercado
        Produto maisCaro = produtoMaisCaroMercado(mercado);
        System.out.println("\n=== Produto mais caro do mercado ===");
        if (maisCaro != null){
            System.out.println(maisCaro);
        } else{
            System.out.println("Nenhum produto no mercado.");
        }
        
        // Média de preço dos produtos do mercado
        double media = mercado.mediaValorProdutos();
        System.out.printf("\n=== Média de preços dos produtos ===\nR$ %.2f\n", media);
    }
}