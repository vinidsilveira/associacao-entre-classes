public class Livro {
    // atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;
    private int quantidadePaginas;

    // construtor padrão
    public Livro() {
        this.titulo = "";
        this.autor = "";
        this.anoPublicacao = 0;
        this.preco = 0.0;
        this.quantidadePaginas = 0;
    }

    // construtor completo
    public Livro(String titulo, String autor, int anoPublicacao, double preco, int quantidadePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
        this.quantidadePaginas = quantidadePaginas;
    }
    
    // método calcular preço por página
    public double calcularPrecoPagina(){
        if (quantidadePaginas > 0){
            return preco / quantidadePaginas;
        }
        else {
            return 0.0; 
        }
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }
    
    // toString
    @Override
    public String toString() {
        return "Livro: " + titulo +
               "\nAutor: " + autor +
               "\nAno: " + anoPublicacao +
               "\nPreço: R$" + preco +
               "\nPáginas: " + quantidadePaginas +
               "\nPreço por página: R$" + String.format("%.2f", calcularPrecoPagina());
    }
}