package Conditions;

public class ArraysAula {
    public static void main(String[] args) {


        /*boa prática, colchetes depois do tipo e sem espaço entre
        o colchete e o tipo*/
        String[] ninja = new String[3];


        /*Diferença entre Array e list é que o Array trabalha com essa alocação de memória, eu tenho um tipo
        * definido para o Array e um limite de itens que vai ter no meu array
        *
        * cada array tem a sua REFERENCIA, é o que faz meu item pertencer a um determinado ARRAY
        * Se gasta muito mais memória criando várias variáveis de ninjas do que com um array com 300 ninjas*/
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";

        /*String inicializa com null*/
        System.out.println(ninja[1]);

        /*new = new objeto de memória*/
        /*Boolean incializa false*/
        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]);

        /*double inicializa 0.0*/
        double[] pontoFlutuante = new double[1];
        System.out.println(pontoFlutuante[0]);


    }


}
