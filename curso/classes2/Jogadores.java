package classes2;

public class Jogadores {
    //Metodo construtor não tem retorno

    private final int maxVidas=3;
    private int num=0;
    private int vidas=0;
    static boolean alerta = false;
    static int qtdJogadores=0;
    static int pontosJogadores=0;

    public Jogadores(int num){
        this.num=num;
        this.setVidas(1);
        System.out.printf("Jogador numero %d Criado%n", num);
        qtdJogadores++;
    }

    public int getVidas(){
        return this.vidas;
    }

    private void setVidas(int vidas){
        if(vidas>maxVidas){
            this.vidas=maxVidas;
        }else if(vidas <0){
            this.vidas=0;
        }else{
            this.vidas=vidas;
        }    
        
    }

    public void addVidas(){
        if(this.vidas < maxVidas){
            this.vidas++;
        }      
        
    }

    static void pontos(){
        pontosJogadores+=10;
    }

    public void info(){
        System.out.printf("%nJogador:%d ",this.num);
        System.out.printf("%nVidas:%d ",this.vidas);
        System.out.printf("%nAlerta:%s ",alerta ? "Sim" : "Não");
        System.out.printf("%nJogadores:%d ",qtdJogadores);
        System.out.printf("%nPontos Jogadores:%d ",pontosJogadores);
        System.out.printf("%n__________________________%n");
    }

    

}
