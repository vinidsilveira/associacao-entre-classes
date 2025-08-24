public class Mercado{
    // Atributos recebe 2 prateleiras
    private Prateleira prateleira1;
    private Prateleira prateleira2;
    
    // Construtor que recebe parâmetros par ainicialiazar todos os atributos
    public Mercado(Prateleira prateleira1, Prateleira prateleira2){
        this.prateleira1 = prateleira1;
        this.prateleira2 = prateleira2;
    }
    
    // Getters
    public Prateleira getPrateleira1(){
        return prateleira1;
    }
    
    public Prateleira getPrateleira2(){
        return prateleira2;
    }
    
    // Método mediaValorProdutos
    public double mediaValorProdutos(){
        double soma = 0;
        int qtd = 0;
        
        // Prateleira 1
        if (prateleira1.getProduto1() != null){
            soma = soma + prateleira1.getProduto1().getPreco();
            qtd = qtd + 1;
        }
        
        if (prateleira1.getProduto2() != null){
            soma = soma + prateleira1.getProduto2().getPreco();
            qtd = qtd + 1;
        }
        
        if (prateleira1.getProduto3() != null){
            soma = soma + prateleira1.getProduto3().getPreco();
            qtd = qtd + 1;
        }
        
        // Prateleira 2
        if (prateleira2.getProduto1() != null) {
        soma = soma + prateleira2.getProduto1().getPreco();
        qtd = qtd + 1;
        }
        
        if (prateleira2.getProduto2() != null) {
        soma = soma + prateleira2.getProduto2().getPreco();
        qtd = qtd + 1;
        }
        
        if (prateleira2.getProduto3() != null) {
        soma = soma + prateleira2.getProduto3().getPreco();
        qtd = qtd + 1;
        }

        // Se não houver nenhum produto, retorna 0 para evitar erro
        if (qtd == 0) {
        return 0;
        }

        return soma / qtd;
    }
}