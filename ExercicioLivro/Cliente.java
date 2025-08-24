public class Cliente{
    //atributos
    private String nome;
    private int idade;
    private char sexo;
    private String email;
    private String senha;
    private Livro livro; //associação classe livro
    
    //construtor 1 padrão
    public Cliente(){
        this.nome = "";
        this.idade = 0;
        this.sexo = ' ';
        this.email = "";
        this.senha = "";
        this.livro = null;
    }
    
    //construtor 2 - sem o livro
    public Cliente(String nome, int idade, char sexo, String email, String senha){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
        this.livro = null;
    }
    
    //construtor 3 - com todos atributos
    public Cliente(String nome, int idade, char sexo, String email, String senha,Livro livro){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
        this.livro = livro;    
    }
    
    
    //getters e setters nome
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    //getters e setters idade
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int Idade){
        this.idade = idade;
    }
    
    //getters e setters sexo
    public char getSexo(){
        return sexo;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    //getters e setters email
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    //getters e setters senha
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    //get Livro
    public Livro getLivro(){
        return livro;
    }
    
    //método imprimeInformaoes
    public void imprimeInformacoes(){
        System.out.println("=== DADOS DO CLIENTE ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("E-mail: " + email);
        System.out.println("Senha: " + senha);
        if (livro != null){
            System.out.println("--- Livro Associado ---");
            System.out.println(livro); // usa o toString da classe Livro
        }
        else{
            System.out.println("Nenhum livro associado.");
        }
    }
    
    //método toString
    @Override
    public String toString() {
        String infoLivro = (livro != null) ? livro.toString() : "Nenhum livro associado.";
        return "Cliente: " + nome +
               "\nIdade: " + idade +
               "\nSexo: " + sexo +
               "\nEmail: " + email +
               "\nSenha: " + senha +
               "\n" + infoLivro;
    }
}