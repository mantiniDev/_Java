package classes2;
public class CursoJava {
    
    public static void main(String[] args) {
        
        int num=0;

        Jogadores.pontos();
        Jogadores.pontos();
        Jogadores.pontos();

        Jogadores j1 = new Jogadores(++num);
        Jogadores j2 = new Jogadores(++num);
        Jogadores j3 = new Jogadores(++num);

        j1.info();
        j2.info();
        j3.info();

        //System.out.printf("A Vida do jogador 1 é :%d",j1.getVidas());
        

        
    }
}
