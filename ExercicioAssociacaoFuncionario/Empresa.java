public class Empresa{
    private String nome;
    private FuncionarioCaixa funcionario1;
    private FuncionarioCaixa funcionario2;
    
    // Construtor 1: recebe todos os parâmetros
    public Empresa(String nome, FuncionarioCaixa funcionario1, FuncionarioCaixa funcionario2){
        this.nome = nome;
        this.funcionario1 = funcionario1;
        this.funcionario2 = funcionario2;
    }
    
    // Construtor 2: recebe apenas nome da empresa (funcionários null)
    public Empresa(String nome){
        this.nome = nome;
        this.funcionario1 = null;
        this.funcionario2 = null;
    }
    
    // Construtor 3: não recebe parâmetros
    public Empresa(){
        this.nome = "Empresa Padrão";
        this.funcionario1 = null;
        this.funcionario2 = null;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public FuncionarioCaixa getFuncionario1() {
        return funcionario1;
    }
    
    public void setFuncionario1(FuncionarioCaixa funcionario1) {
        this.funcionario1 = funcionario1;
    }

    public FuncionarioCaixa getFuncionario2() {
        return funcionario2;
    }
    
    public void setFuncionario2(FuncionarioCaixa funcionario2) {
        this.funcionario2 = funcionario2;
    }
    
    // Método imprimeInfo
    public void imprimeInfo(){
        System.out.println("=== Dados da Empresa ===");
        System.out.println("Nome: " + nome);
        System.out.println(" ");
        
        System.out.println("--- Funcionário 1 ---");
        if (funcionario1 != null){
            funcionario1.imprimeInfo();
        } else{
            System.out.println("Nenhum funcionário cadastrado.");
        }
        
        System.out.println("--- Funcionário 2 ---");
        if (funcionario2 != null) {
            funcionario2.imprimeInfo();
        } else {
            System.out.println("Nenhum funcionário cadastrado.");
        }
    }
}