package classes;

public class Jogador {
    //Metodo construtor não tem retorno

    private final int maxVidas=3;
    private int num=0;
    private int vidas=0;


    public Jogador(int num){
        this.num=num;
        this.setVidas(3);
        System.out.printf("Jogador numero %d Criado%n", num);
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
}
