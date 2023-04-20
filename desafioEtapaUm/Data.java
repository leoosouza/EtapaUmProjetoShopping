public class Data {

    public int dia;
    public int mes;
    public int ano;

    public Data(int dia, int mes, int ano) {
        if(!isValido(dia, mes, ano)){
            dia = 1;
            mes = 1;
            ano = 2000;
            System.out.println("Erro: Data Inválida");
            //throw new Exception("Data Inválida");
        }
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }
    public int getAno() {
        return ano;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    private boolean isValido(int dia, int mes, int ano) {
        if (mes > 12)
            return false;
        if (dia > 31)
            return false;
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            if (dia > 30)
                return false;
        if (mes == 2 && dia > 29)
            return false;
        if (mes == 2 && dia > 28 && !isBissexto(ano))
            return false;
        return true;
    }

    public boolean isBissexto(){
        return isBissexto(this.ano);
    }

    private boolean isBissexto(int ano) {
        if (ano % 400 == 0)
            return true;
        if (ano % 100 == 0)
            return false;
        if (ano % 4 == 0)
            return true;
        return false;
    }
}

/*
 * Data: esta classe possui os atributos dia, mes (sem acento) e ano, todos do
 * tipo inteiro. Esta classe possui os seguintes métodos:
 * o Método Construtor: crie 1 construtor que um recebe parâmetros para
 * inicializar todos os atributos. Neste construtor, você deve validar a data
 * informada nos parâmetros. Ou seja, o método construtor deve verificar se o
 * dia é condizente com o mês, levando em conta, também, o fato de o ano
 * poder ser bissexto. Por exemplo, o dia 29 para o mês 2 só pode ser atribuído
 * em anos bissextos. Caso a data seja inválida, o método construtor deve
 * imprimir uma mensagem de erro e alterar a data para a seguinte data
 * padrão: 1/1/2000
 * o Métodos de acesso: crie os métodos de acesso (getters e setters)
 * para todos os atributos da classe
 * o Método toString: se necessário, pesquise sobre o método toString e
 * implemente-o nesta classe, retornando uma String que representa a data
 * no formato dia/mês/ano
 * o Método verificaAnoBissexto: este método não recebe parâmetros
 * e retorna verdadeiro caso o ano seja bissexto e falso caso contrário
 */