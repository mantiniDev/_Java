package superclasse;

public class veiculo {
    private String nome;
    private int tipo;
    public veiculo(String nome, int tipo){
        this.nome=nome;
        this.tipo=tipo;
    }
    public void info(){
        System.out.printf("Nome: %s%n", this.nome);
        System.out.printf("Tipo: %d%n", this.tipo);
    }
}
