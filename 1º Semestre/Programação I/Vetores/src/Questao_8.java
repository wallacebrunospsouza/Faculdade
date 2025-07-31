
import java.util.Random;

public class Questao_8 {
    public static void main(String[] args) {
        Random ale = new Random();
        int vet[] = new int[20];
        int zero=0, um=0, dois=0, tres=0, quat=0, cinc=0;
        
        System.out.print(" ");

        for (int i = 0; i < vet.length; i++) {
            vet[i] = ale.nextInt(6);
      
        }
        for (int i = 0; i < vet.length; i ++){
           if(vet[i] == 0){
            zero = zero +1;
           } else if (vet[i] == 1){
            um = um +1;
           } else if(vet[i] == 2){
            dois = dois + 1;
           } else if(vet[i] == 3){
            tres = tres + 1;
           } else if(vet[i] == 4){
            quat = quat + 1;
           } else if(vet[i] == 5){
            cinc = cinc + 1;
           }
    }
    for (int i = 1; i <= 1; i++) {
        System.out.print("0 |");
        System.out.print("1 |");
        System.out.print("2 |");
        System.out.print("3 |");
        System.out.print("4 |");
        System.out.print("5 |");
        for (int j = 1; j <= i; j++) {
            System.out.println("|"+ zero);
            System.out.print("|"+ um);
            System.out.print("|"+ dois);
            System.out.print("|"+ tres);
            System.out.print("|"+ quat);
            System.out.print("|"+ cinc);
        }
        System.out.println();

}
}
}

