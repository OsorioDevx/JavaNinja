package Intermediario;

public class Main {
    public static void main(String[] args) {
        /*No trabalho você não vai ficar criando variáveis na Main, você
        * trabalha com objetos!!*/
        System.out.println("Inicializando Objetos");
        System.out.println("========== Sasuke ==========");
        Ninja sasuke= new Ninja();

        //atributos do meu objeto
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.aldeia = "Aldeia da Folha";

       /* método aplicado no meu objeto sasuke, os () indicam pro java que isso é um método*/
        /*sasuke.BoasVindas();  -->  Assim o método não aparece no terminal, porque está retornando
        * somente um valor*/
        String boasVindasSasuke = sasuke.BoasVindas();
        System.out.println(boasVindasSasuke);
        sasuke.sharinganAtivado();



        System.out.println(sasuke.nome + "\n" + sasuke.idade + "\n" + sasuke.aldeia);

        System.out.println("========== Naruto ==========");

        Ninja naruto = new Ninja();

        naruto.nome= "Naruto Uzumaki";
        naruto.idade = 16;
        naruto.aldeia= "Aldeia da Folha";
        System.out.println(naruto.nome + "\n" + naruto.idade + "\n" + naruto.aldeia);

        String boasVindasNaruto = naruto.BoasVindas();
        int tempoRestanteHokage = naruto.AnosHogake(50);

        System.out.println(boasVindasNaruto);
        System.out.println("Faltam "+ tempoRestanteHokage + " anos para eu me tornar Hokage");




        System.out.println("========== Sakura ==========");

        /*Ctrl + botão esquerdo leva direto para a classe*/
        Ninja sakura = new Ninja();

        sakura.nome= "Sakura Haruno";
        sakura.idade = 17;
        sakura.aldeia= "Aldeia da Folha";
        System.out.println(sakura.nome + "\n" + sakura.idade + "\n" + sakura.aldeia);

        String boasVindasSakura = sakura.BoasVindas();
        System.out.println(boasVindasSakura);




    }

}
