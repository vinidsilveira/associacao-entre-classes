public class Data{
    // Atributos
    private int dia;
    private int mes;
    private int ano;
    
    // Construtor
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    // Getters e Setters 
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setDia(int dia){
        this.dia = dia;        
    }
    
    public void setMes(int mes){
        this.mes = mes;        
    }
    
    public void setAno(int ano){
        this.ano = ano;        
    }
    
    // Método toString (representação textual do objeto)
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
    
}