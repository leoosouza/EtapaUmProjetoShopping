public class Data {
    
    public int dia;
    public int mes;
    public int ano;
    
    public Data (int dia, int mes, int ano) {
        
    }
}

//Data: esta classe possui os atributos dia, mes (sem acento) e ano, todos do
//tipo inteiro. Esta classe possui os seguintes métodos:
//o Método Construtor: crie 1 construtor que um recebe parâmetros para
//inicializar todos os atributos. Neste construtor, você deve validar a data
//informada nos parâmetros. Ou seja, o método construtor deve verificar se o
//dia é condizente com o mês, levando em conta, também, o fato de o ano
//poder ser bissexto. Por exemplo, o dia 29 para o mês 2 só pode ser atribuído
//em anos bissextos. Caso a data seja inválida, o método construtor deve
//imprimir uma mensagem de erro e alterar a data para a seguinte data
//padrão: 1/1/2000
//o Métodos de acesso: crie os métodos de acesso (getters e setters)
//para todos os atributos da classe
//o Método toString: se necessário, pesquise sobre o método toString e
//implemente-o nesta classe, retornando uma String que representa a data
//no formato dia/mês/ano
//o Método verificaAnoBissexto: este método não recebe parâmetros
//e retorna verdadeiro caso o ano seja bissexto e falso caso contrário