package Intermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    /*método publico personalizado, como eu não quero que ela me retorne algo
    *    vai ser uma função VOID*/
    public void sharinganAtivado(){
        System.out.println("Sharingan Ativado!");

    }

    /*método String que retorna uma mensagem String de boas vindas*/
    public String BoasVindas(){
        return "Olá, eu sou o ninja "+nome + "!";
    }

    /*método pra retornar tipo INT, aqui eu vou passar um parâmetro para a minha função
    *    que é a idade mínima para ser hokage*/
    public int AnosHogake(int idadeMinima){
        return idadeMinima - idade;

    }
}
