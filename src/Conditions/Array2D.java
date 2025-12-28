package Conditions;

public class Array2D {
    public static void main(String[] args) {
        /*No Array 2D o primeiro Array se torna um arrau de referência, deve se visualizar
        * os arrays como uma matriz*/
        String[][] ninjasEAldeias = new String[3][3];
        System.out.println(ninjasEAldeias); // referencia da minha memória: @6acbcfc0

        /*O primeiro slot [] se refere a primeira linha, linha 0 e o segundo slot []
        * é a primeira coluna, coluna 0*/

        ninjasEAldeias [0] [0] = "Konoha";
        ninjasEAldeias [0] [1] = "Naruto";
        ninjasEAldeias [0] [2] = "Sasuke";

        ninjasEAldeias [1] [0] = "Névoa";
        ninjasEAldeias [1] [1] = "Zabuza";
        ninjasEAldeias [1] [2] = "Haku";

        ninjasEAldeias [2] [0] = "Deserto";
        ninjasEAldeias [2] [1] = "Gaara";
        ninjasEAldeias [2] [2] = "Temari";

     }
}
