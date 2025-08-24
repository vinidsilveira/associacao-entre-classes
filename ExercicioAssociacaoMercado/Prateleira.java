public class Prateleira{
    // Atributos: 3 produtos
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;
    
    // Construtor que recebe parâmetros para inicializar todos os atributos
    public Prateleira(Produto produto1, Produto produto2, Produto produto3){
        this.produto1 = produto1;
        this.produto2 = produto2;
        this.produto3 = produto3;
        
    }
    
    public Prateleira(){
        this.produto1 = null;
        this.produto2 = null;
        this.produto3 = null;
    }
    
    // Getters e Setters
    public Produto getProduto1(){
        return produto1;
    }
    
    public void setProduto1(Produto produto1){
        this.produto1 = produto1;
    }
    
    public Produto getProduto2(){
        return produto2;
    }
    
    public void setProduto2(Produto produto2){
        this.produto2 = produto2;
    }
    
    public Produto getProduto3(){
        return produto3;
    }
    
    public void setProduto3(Produto produto3){
        this.produto3 = produto3;
    }
    
    // Método que retorna o produto mais caro
    public Produto produtoMaisCaro() {
        Produto maisCaro = null;

        if (produto1 != null) {
            maisCaro = produto1;
        }
        
        if (produto2 != null && (maisCaro == null || produto2.getPreco() > maisCaro.getPreco())) {
            maisCaro = produto2;
        }
        
        if (produto3 != null && (maisCaro == null || produto3.getPreco() > maisCaro.getPreco())) {
            maisCaro = produto3;
        }

        return maisCaro; // pode ser null se não houver produtos
    }

    // Método toString
    @Override
    public String toString() {
        return "Prateleira { " +
               "\n Produto 1: " + (produto1 != null ? produto1.toString() : "Nenhum") +
               "\n Produto 2: " + (produto2 != null ? produto2.toString() : "Nenhum") +
               "\n Produto 3: " + (produto3 != null ? produto3.toString() : "Nenhum") +
               "\n}";
    }
}