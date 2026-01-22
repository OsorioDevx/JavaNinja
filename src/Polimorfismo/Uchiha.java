package Polimorfismo;

public class Uchiha extends PoliNinja{
    @Override /*Usar toda vez essa anotattion toda vez que for usar polimorfismo
    para sobrescrever algo que já existe -> sorbescrita de método*/
    public void habilidadeEspecial(){

        System.out.println("Meu nome é: "+nome+ " e essa é minha habilidade especial Uchiha, um ataque de FOGO");
    }
}
