public class Endereco {
    
    public String nomeDaRua;
    public String cidade;
    public String pais;
    public String cep;
    public String numero;
    public String complemento;
    
    public Endereco (String nomeDaRua, String cidade, String pais, String cep, String numero, String complemento){
        
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        
    }
    
    public String getNomeDaRua () {
        return nomeDaRua;
    }
    
    public void setNomeDaRua () {
        this.nomeDaRua = nomeDaRua;
    }
    
    public String getCidade () {
        return cidade;
    }
    
    public void setCidade () {
        this.cidade = cidade;
    }
    
    public String getPais () {
        return pais;
    }
    
    public void setPais () {
        this.pais = pais;
    }
    
    public String getCep () {
        return cep;
    }
    
    public void setCep () {
        this.cep = cep;
    }
    
    public String getNumero () {
        return numero;
    }
    
    public void setNumero () {
        this.numero = numero;
    }
    
    public String getComplemento () {
        return complemento;
    }
    
    public void setComplemento () {
        this.complemento = complemento;
    }
    
   // public String toString () {
        //return "Nome da rua: " + nomeDaRua; "Cidade: " + cidade + "Estado: " + estado + "Numero " + numero + "Cep: " ;
    //}
    
    
}



//esta classe possui os atributos nomeDaRua, cidade, estado,
//pais (sem acento), cep (do tipo String), numero (sem acento e também do
//tipo String) e complemento (String). 


//Esta classe possui os seguintes
//métodos:
//o Método Construtor: crie 1 construtor que um recebe parâmetros para
//inicializar todos os atributos
//o Métodos de acesso: crie os métodos de acesso (getters e setters)
//para todos os atributos da classe
//o Método toString: se necessário, pesquise sobre o método toString e
//implemente-o nesta classe, retornando uma String formatada da forma
//que você desejar, desde que contenha as informações de todos os atributos
//da classe