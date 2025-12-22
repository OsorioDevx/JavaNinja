import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        int maxUsers = 1;

        System.out.println("Sitema de Cadastro de Usuários \n Digite 1 para cadastrar usuário \n Digite 2 para " +
                "listar usuários \n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua opção: ");
        int opcao = sc.nextInt();

        String[] bancoUsers = new String[maxUsers];



        switch (opcao){
            case 1:
                System.out.println("Digite o nome do Usuário: ");
                String username = sc.next();
                System.out.println("Você cadastrou "+ username);
                break;

            case 2:
                System.out.println("alo");
                break;

            default:
                System.out.println("akfleakfoa");
        }








    }
}
