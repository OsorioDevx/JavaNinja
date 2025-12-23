package ProjetoCadastro;
import java.util.Scanner;

public class Cadastro2 {
    public static void main(String[] args) {

        //data input
        Scanner sc= new Scanner(System.in);

        //array
        int maxNames = 5; // max limit input in new variable
        String[] ninjaNames =  new String[maxNames];

        //counters
        int registeredNinjas = 0;
        int options = 0;


        while (options != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int option = sc.nextInt();


        switch (options){
            case 1:
                if (registeredNinjas < maxNames) {
                    System.out.println("Digite o nome do Ninja: ");
                    String usernameNinja = sc.nextLine();
                    ninjaNames[registeredNinjas] = usernameNinja;
                    //somando mais um ninja na lista
                    registeredNinjas++;
                    System.out.println("Ninja ["+registeredNinjas+"] cadastrado com sucesso");
                }else{
                    System.out.println("A lista de ninjas está cheia");
                }
                break;

            case 2:
                if (registeredNinjas == 0){
                    System.out.println("Nenhum ninja cadastrado");
                } else {
                    System.out.println("========== Lista de Ninjas ==========");
                    for (int i = 0; i < ninjaNames.length; i++) {
                        System.out.println(ninjaNames[i]);
                        
                    }
                }
                break;

            case 3:
                System.out.println("Estamos encerrado o sistema, aguarde");
                break;
        }

        }




    }
}
