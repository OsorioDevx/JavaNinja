package Conditions;

public class IfEElse {
    public static void main(String[] args){

        String name = "Naruto";
        String rank;
        int age = 17;
        boolean hokage = false;
        short numberMissions = 14; //tipo short para trabalhar com números pequenos

        if(numberMissions > 15 && age >= 18){
            System.out.println("Naruto está pronto para avançar de nível");

        } else if (numberMissions < 15) {
            System.out.println("Naruto não concluiu missões suficientes");

        } else if (age < 18) {
            System.out.println("Naruto não possui idade suficiente");
        }
    }


}
