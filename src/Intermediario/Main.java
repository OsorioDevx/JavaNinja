package Intermediario;

public class Main {
    public static void main(String[] args) {
        /*No trabalho você não vai ficar criando variáveis na Main, você
        * trabalha com objetos!!*/
        System.out.println("Inicializando Objetos");
        System.out.println("========== Sasuke ==========");
        Ninja sasuke= new Ninja();

        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.aldeia = "Aldeia da Folha";

        System.out.println(sasuke.nome + "\n" + sasuke.idade + "\n" + sasuke.aldeia);

        System.out.println("========== Naruto ==========");

        Ninja naruto = new Ninja();

        naruto.nome= "Naruto Uzumaki";
        naruto.idade = 16;
        naruto.aldeia= "Aldeia da Folha";
        System.out.println(naruto.nome + "\n" + naruto.idade + "\n" + naruto.aldeia);


        System.out.println("========== Sakura ==========");

        /*Ctrl + botão esquerdo leva direto para a classe*/
        Ninja sakura = new Ninja();

        sakura.nome= "Sakura Haruno";
        sakura.idade = 17;
        sakura.aldeia= "Aldeia da Folha";
        System.out.println(sakura.nome + "\n" + sakura.idade + "\n" + sakura.aldeia);




    }

}
