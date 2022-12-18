import java.util.Scanner;

public class aula4 {      
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n1=0, n2=0, n3=0, n4=0, soma=0;
        final int MEDIA = 60;
        final int MEDIAR = 40;
        String nome = "", res="";


        System.out.println("Digite O nome do Aluno");
        nome = scan.nextLine();
        System.out.println("Digite a nota 1: ");
        n1 = scan.nextInt();
        System.out.println("Digite a nota 2: ");
        n2 = scan.nextInt();
        System.out.println("Digite a nota 3: ");
        n3 = scan.nextInt();
        System.out.println("Digite a nota 4: ");
        n4 = scan.nextInt();
        
        soma = (n1 + n2 + n3 + n4)/4;

        if(soma >= MEDIA){
            res = "Aprovado";
        }else if(soma > MEDIAR){
            res = "Recuperação";
        }else{
            res = "Reprovado";
        }
        System.out.printf("Aluno: %S\nSituação: %S\nMédia final de: %d pontos.",nome,res,soma);    
    }
    
}