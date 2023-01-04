package classes3;

public class cursoJava {
    public static void main(String[] args){
        Carro c1 = new Carro("Golf");
        Carro c2 = new Carro("HRV");
        CarroCombate c3 = new CarroCombate("Leopardo", 100);
        CarroCombate c4 = new CarroCombate("Pantera", 50);

        c3.atirar();
        c4.sofrerDano(150);
        c1.sofrerDano(5);
        
        
        c1.info();
        c2.info();
        c3.info();
        c4.info();

    }
}
