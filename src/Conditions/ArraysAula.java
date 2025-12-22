package Conditions;

public class ArraysAula {
    public static void main(String[] args) {


        /*boa prática, colchetes depois do tipo e sem espaço entre
        o colchete e o tipo*/
        String[] ninja = new String[5];


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

        /*redeclarando variável*/
        String hokageName = "Naruto";
        hokageName = "Boruto";
        System.out.println(hokageName);

        /*redeclarando array(REATRIBUIÇÃO DE REFERÊNCIA), ele usa outro espaço de memória pra armazenar os novos itens
        * e os itens antigos não existem mais, o resultado esperado é null agora que o array foi redeclarado*/
        int qtdHokages = 7;
        ninja = new String[qtdHokages];
        ninja[0] = "Hashirama";
        ninja[1] = "Tobirama";
        ninja[2] = "Iruzen";
        ninja[3] = "Minato";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi";
        ninja[6] = "Naruto";

        /*O Garbage Collector vai ser o responsável por verificar o que está ocupando espaço na memória
        * e não está mais sendo utilizado, nesse caso o nosso antigo array de ninjas, ele faz uma espécie
        * de varredura*/

        /*for pra passar por todo o meu array*/
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);

        }


    }


}
