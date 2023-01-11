package superclasse;

public class veiculo {
    protected String nome;
    protected int tipo;
    public veiculo(String nome, int tipo){
        this.nome=nome;
        this.tipo=tipo;
    }
    public void info(){
        System.out.printf("Nome: %s%n", this.nome);
        System.out.printf("Tipo: %d%n", this.tipo);
    }
}
