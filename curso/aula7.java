//import java.util.Scanner;
import java.util.Arrays;
public class aula7 {
    
    public static void main(String[] args) {
        
        final int tam=10;
        int[] num={9,2,7,1,8,5,3,4,0,6};
        int[] num1=new int[tam];
        int p=3;
        int pos;

        //Arrays.sort(num); ordena
        //Arrays.fill(num1, 10); insere
        //System.arraycopy(num, 0, num1, 0, tam); /*copia de outro array*/
        //System.out.printf("Arrays são iguais: %s", Arrays.equals(num, num1) ? "Sim" : "não"); /*comparação*/

        Arrays.sort(num);
        pos = Arrays.binarySearch(num, p);
        System.out.printf("O Elemento %d esta no array? %s",p,pos > 0 ? "Sim" : "não");

        
       // for(int n:num1){ /*Serve apenas para ler uma array */
       //     System.out.printf("%d - ", n);
       //}


    }   

}
