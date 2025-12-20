package Conditions;

public class ArraysAula {
    public static void main(String[] args) {

        String[] ninja = new String[3];/*boa prática, colchetes depois do tipo e sem espaço entre
        o colchete e o tipo*/
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";

        int[] numero = new int[3];
        numero[0] = 12;
        numero[1] = 22;
        numero[2] = 17;

        System.out.println(numero[0] + numero[2]);

        System.out.println(ninja[0]);
    }


}
