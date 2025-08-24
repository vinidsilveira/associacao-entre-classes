public class FuncionarioCaixa{
    private String nome;
    private String endereco;
    private String sexo;
    private Calculadora calculadora; // associação com a classe Calculadora
    
    // Construtor 1: sem parâmetros
    public FuncionarioCaixa(){
        this.nome = "Nome Padrão";
        this.endereco = "Endereço Padrão";
        this.sexo = "Não informado";
        this.calculadora = new Calculadora("Preta"); // cor padrão       
    }
    
    // Construtor 2: recebe parâmetros para inicializar todos atributos
    public FuncionarioCaixa(String nome, String endereco, String sexo, String corCalculadora){
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.calculadora = new Calculadora(corCalculadora); // aqui instancia
    }
    
    // Getters e Setters
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public Calculadora getCalculadora(){
        return calculadora;
    }
    
    public void setCalculadora(Calculadora calculadora){
        this.calculadora = calculadora;
    }
    
    // Métodos de operações (chamam os métodos da Calculadora)
    public double soma(double a, double b){
        return calculadora.soma(a, b);
    }
    
    public double subtrai(double a, double b){
        return calculadora.subtrai(a, b);
    }
    
    public double multiplica(double a, double b){
        return calculadora.multiplica(a, b);
    }
    
    public double divide(double a, double b){
        return calculadora.divide(a, b);
    }
    
    public int elevaQuadrado(int n){
        return calculadora.elevaQuadrado(n);
    }
    
    public int elevaCubo(int n){
        return calculadora.elevaCubo(n);
    }
    
    // Método imprimeInfo
    public void imprimeInfo(){
        System.out.println("=== Dados do Funcionário de Caixa ===");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Sexo: " + sexo);
        System.out.println("Calculadora:");
        if (calculadora != null) {
        calculadora.imprimeInfo();
        } else {
        System.out.println("Cor: (nenhuma)");
        System.out.println("Memória: (nenhuma)");
        }
        System.out.println("====================================");
    }
}