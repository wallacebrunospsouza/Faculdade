import java.util.Random;
import java.util.Scanner;

public class Questao_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ale = new Random();
        int atirar;
        int pont=0, penal=0 ;
        int coord[] = new int[5];

        System.out.println("Aperte 1 para atirar uma felcha");
        atirar = in.nextInt();
        
        if(atirar ==1){
        for(int i = 0; i < coord.length; i++){
            coord[i] = ale.nextInt();
            if(coord[i] == 0){
                pont = pont+10;
            } else if (coord[i]> 0 && coord[i] <=5){
                penal= penal+5;
            }
        }
    }
        System.out.println("Seus pontos:"+pont);
        System.out.println("Suas penalidades: "+penal);

    }

}
