package classes;
public class aulaClasses {
    
    public static void main(String[] args) {
        
        int num=0;

        Jogador j1 = new Jogador(++num);
        Jogador j2 = new Jogador(++num);
        
        j1.addVidas();
        


        System.out.printf("A Vida do jogador 1 é :%d",j1.getVidas());
        //System.out.println(j1.num);
    }
}
