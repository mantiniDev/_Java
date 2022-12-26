//import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Arrays;

public class aula8 {
    
    public static void main(String[] args) {
        final int linhas=3;
        final int colunas = 5;

         
        int[][] numeros = new int[linhas][colunas];
        /*
        for(int l=0; l<linhas;l++){
            for(int c=0;c<colunas;c++){
                numeros[1][c]=new SecureRandom().nextInt(10);
            }
        }
        
        for(int l=0; l<linhas;l++){
            for(int c=0;c<colunas;c++){
                System.out.printf("%d | ",numeros[1][c]);
            }
            System.out.printf("%n");
        }
        */
        for (int [] n:numeros ){
            for(int v:n){
                System.out.printf("%d | ",v);
            }
            System.out.printf("%n");
        }
    }   

}