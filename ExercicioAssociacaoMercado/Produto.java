public class Produto{
    // Atributos
    private String nome;
    private double preco;
    private Data validade;
    
    // Construtor
    public Produto(String nome, double preco, Data validade){
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
    }
    
    //Getters e Setters
    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public Data getValidade(){
        return validade;
    }
    
    public void setNome(){
        this.nome = nome;
    }
    
    public void setPreco(){
        this.preco = preco;
    }
    
    public void setValidade(){
        this.validade = validade;
    }
    
    // Método toString
    @Override
    public String toString(){
        return "Produto { " +
            "Nome: " + nome + 
            ", Preço: R$ " + preco +
            ", Validade: " + validade +
            " }";
    }
    
    
    public boolean verificaProdutoVencido(Data dataRef) {
        // Comparação por ano
        if (dataRef.getAno() > validade.getAno()) {
        return true;
        }
        // Mesmo ano, compara mês
        else if (dataRef.getAno() == validade.getAno() && dataRef.getMes() > validade.getMes()) {
        return true;
        }
        // Mesmo ano e mês, compara dia
        else if (dataRef.getAno() == validade.getAno() && dataRef.getMes() == validade.getMes()
             && dataRef.getDia() > validade.getDia()) {
        return true;
        }
        // Caso contrário, produto ainda está válido
        else {
        return false;
        }
    }
    
}