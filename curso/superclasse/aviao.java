package superclasse;

public class aviao extends veiculo{
    private int categoria;
    
    public aviao(String nome, int categoria){
        super(nome, 10);
        this.categoria=categoria;
    }

    public void info(){
        super.info();
        System.out.printf("Categoria: %s%n", this.categoria);
        
    }
}
