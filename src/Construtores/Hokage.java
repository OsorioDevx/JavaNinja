package Construtores;

public abstract class Hokage {
    String nome;
    int ordem;
    boolean vivoOuNao;
    String clan;
    int missoes;
    double saldoBancario;
    double altura;


    /*construtor com argumento (nome)*/
    public Hokage(String nome) {
        this.nome = nome;
    }

    public Hokage(int ordem) {
        this.ordem = ordem;

    }

    /*All args constructor = construtor com todos os argumentos*/
    public Hokage(String nome, int ordem, boolean vivoOuNao){
        this.nome = nome;
        this.ordem = ordem;
        this.vivoOuNao = vivoOuNao;
    }

    /*usando alt + insert para criar todos os construtores automaticamente*/

    public Hokage(String nome, int ordem, boolean vivoOuNao, String clan, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.ordem = ordem;
        this.vivoOuNao = vivoOuNao;
        this.clan = clan;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }

    /*O padrão que se utiliza é somente 1 construtor com todos os argumentos e 1 construtor vazio */
}



