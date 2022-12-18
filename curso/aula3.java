public class aula3 {
    public static void main(String[] args) {
        int nota= 85;
        int faltas = 10;
        int maxFaltas = 5;
        int media = 60;
        String res;
        int pos = 2;
        
        //res = (nota >= media ? "aprovado" : "Reprovado");
        //System.out.println("Resultado: " + res); 

        /**if(nota >= media && faltas <= maxFaltas){
            System.out.println("Aprovado");
        }else if(nota >= 40){
            System.out.println("Recuperação");
        }        
        else{
            System.out.println("Reprovado");
        }
        System.out.println("Fim de programa"); */

        switch(pos){
            case 1:
            System.out.println("Primeiro Lugar");
            break;
            case 2:
            System.out.println("Segundo Lugar");
            break;
            case 3:
            System.out.println("Terceiro Lugar");
            break;
            default:
            System.out.println("Premio de participação");
            break;
        }
    }
}
