public class Loja {
    
    public String nome;
    public int quantidadeFuncionarios;
    public double salarioBaseFuncionario;
    
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        
        
    }
    
    public Loja (int quantidadeFuncionarios, String nome) {        
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }
    
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }
    
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
}