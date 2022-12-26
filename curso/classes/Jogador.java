package classes;

public class Jogador {
    //Metodo construtor não tem retorno

    private int num=0;
    private int vidas=0;


    public Jogador(int num){
        this.num=num;
        this.vidas=3;
        System.out.printf("Jogador numero %d Criado%n", num);
    }
}
