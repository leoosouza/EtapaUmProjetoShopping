public class TesteEndereco {
    
    public static void main (String [] args) {
        Endereco entrega01;
        entrega01 = new Endereco ("Hortências", "Futururama", "Guatemala", "88-251.000", "88", "Perto do bar");
        String endereco = entrega01.getNomeDaRua();
        System.out.println (endereco);
    }
}

    //public String nomeDaRua;
    //public String cidade;
    //public String pais;
    //public String cep;
    //public String numero;
    //public String complemento;