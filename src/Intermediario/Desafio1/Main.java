package Intermediario.Desafio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Programa de Gerenciamento de Ninjas da Folha");


        System.out.println("====================");
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.missao = "Derrotar Orochimaru";
        sasuke.nivelDificuldade = "Rank S";
        sasuke.statusMissao = "Em andamento";
        sasuke.habilidadeEspecial = "Sharingan";

        sasuke.mostrarInformacoes();

        System.out.println("====================");
        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata Hyuga";
        hinata.mostrarInformacoes();
        hinata.byakugan();

        System.out.println("====================");





    }
}
