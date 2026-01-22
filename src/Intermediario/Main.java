package Intermediario;

public class Main {
    public static void main(String[] args) {
        /*No trabalho você não vai ficar criando variáveis na Main, você
        * trabalha com objetos!!*/
        System.out.println("Inicializando Objetos");



        System.out.println("===================================");
        Uchiha sasuke = new Uchiha();

        /*Atributos do meu objeto e agora objeto extendido, classe Uchiha é filha e classe Ninja é a classe mãe
        * eu herdei o nome, idade e aldeia da mãe porque todos os ninjas tem essas características e tenho também
        * as características só dos UCHIHAS que no caso é o Sharingan da classe Uchiha*/
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




        System.out.println("===================================");

        Uzumaki naruto = new Uzumaki();

        naruto.nome= "Naruto Uzumaki";
        naruto.idade = 16;
        naruto.aldeia= "Aldeia da Folha";
        System.out.println(naruto.nome + "\n" + naruto.idade + "\n" + naruto.aldeia);

        naruto.chakraInfinito();
        String boasVindasNaruto = naruto.BoasVindas();
        int tempoRestanteHokage = naruto.AnosHogake(50);

        System.out.println(boasVindasNaruto);
        System.out.println("Faltam "+ tempoRestanteHokage + " anos para eu me tornar Hokage");




        System.out.println("===================================");

        /*Ctrl + botão esquerdo leva direto para a classe*/
        Haruno sakura = new Haruno();

        sakura.nome= "Sakura Haruno";
        sakura.idade = 17;
        sakura.aldeia= "Aldeia da Folha";
        System.out.println(sakura.nome + "\n" + sakura.idade + "\n" + sakura.aldeia);
        sakura.curaHaruno();



        Hyuga hinata = new Hyuga();

        System.out.println("===================================");
        hinata.nome = "Hinata Hyuga";
        hinata.idade = 18;
        hinata.aldeia = "Aldeia da Folha";
        System.out.println(hinata.nome + "\n" + hinata.idade + "\n" + hinata.aldeia);

        String boasVindasHinata =  hinata.BoasVindas();
        System.out.println(boasVindasHinata);
        hinata.byakuganAtivado();





    }

}
