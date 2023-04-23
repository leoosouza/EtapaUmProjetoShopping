public class TesteData {
    public static void main (String[] args){
        Data data = new Data(02,12,2023);
        System.out.println(data.getAno()); 
        System.out.println(data.getMes()); 
        System.out.println(data.getDia());
        System.out.println(data);
        System.out.println(data.verificaAnoBissexto());
    }
}