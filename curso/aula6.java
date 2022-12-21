import java.util.Scanner;

public class aula6 {
    
    public static void main(String[] args) {
        /* 
        int[] num=new int[5];
        int[] num1 = {1,2,3};

        for(int i=0; i < 5; i++){
            num[i] = i;
            System.out.printf("%d -",num[i]);
        }
        */
        final int tam=5;
        char[] gabarito={'a','a','d','b','c'};
        char[] respostas=new char[tam];
        int nota=0;
        Scanner scan= new Scanner(System.in);

        for(int i=0; i<tam; i++){
            System.out.printf("Informe a nota %d: ", i);
            respostas[i]=scan.nextLine().charAt(0);
        }

        for(int i=0; i<tam; i++){
            if(respostas[i]==gabarito[i]){
                nota++; 
            }
        }
        System.out.printf("A nota do aluno foi de: %d",nota);

    }   

}
