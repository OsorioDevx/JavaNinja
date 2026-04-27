package Polimorfismo;

public abstract class PoliNinja implements EstrategiaDeBatalha{
    String nome;
    String aldeia;
    int idade;

    /*método geral, todo ninja tem!*/
    public void habilidadeEspecial(){
        System.out.println("Meu nome é: "+nome+ " e essa é minha habilidade especial");
    };

    @Override
    /*Sobrescrevendo algo que estou pegando na minha interface, pegar primeiro da interface
    * e depois sobrescrever na classe abstrata*/
    public void estrategiaDeBatalhaNinja(){
        System.out.println("Minha estratégia de batalha");

    }
}
