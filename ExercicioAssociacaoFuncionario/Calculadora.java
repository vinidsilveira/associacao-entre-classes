public class Calculadora{
    // atributos
    private double memoria;
    private String cor;
    
    // construtor: memória inicia em 0 e cor vem por parâmetro
    public Calculadora(String cor){
        this.memoria = 0.0;
        this.cor = cor;
    }
    
    // getters e setters
    public double getMemoria(){
        return memoria;
    }
    
    public void setMemoria(double memoria){
        this.memoria = memoria;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    // operações
    public double soma(double a, double b){
        return a + b;
    }
    
    public double subtrai(double a, double b){
        return a - b;
    }
    
    public double multiplica(double a, double b){
        return a * b;
    }
    
    public double divide(double a, double b){
        if (b == 0.0){
            System.out.println("Aviso: divisão por zero. Rerornando NaN.");
            return Double.NaN; // not a number
        }
        return a / b;
    }
    
    // potências (int)
    public int elevaQuadrado(int n){
        return n * n;
    }
    
    public int elevaCubo(int n){
        return n * n * n;
    }
    
    // Método imprimeInfo
    public void imprimeInfo(){
        System.out.println("Cor: " + cor);
        System.out.println("Memória: " + memoria);
    }
}