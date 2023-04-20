public class TesteLoja {
    public static void main (String[] args){
        Loja a;
        a = new Loja("Leo", 5, 2000.65);
        String nome = a.getNome();
        System.out.println(nome);
        a.setNome("Amanda");
        nome = a.getNome();
        System.out.println(nome);
    }
}