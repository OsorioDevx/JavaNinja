package TiposDedados;

public class DadosPrimitivos {
    public static void main(String[] args) {

        int ageNinja = 16; //int = integer
        double heightNinja = 1.75;
        char initialNinja = 'N'; //pra definir o valor de um CHAR tem que ser entre aspas simples
        boolean deadOrAlive = true;

        /*o Int tem um limite de quantos números ele pode alocar, na dúvida
         * se passar de 2 bilhões é melhor mudar para long
         *
         * Long começa com letra maiúscula e termina com uma letra maiúscula também*/
        Long saldoBancario = 999999999999999999L; //o hokage é muito rico


        System.out.println(ageNinja); //comando para mostrar pro usuário
        System.out.println("Saldo bancário do Naruto é: " + saldoBancario);
    }
}
