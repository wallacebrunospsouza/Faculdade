import java.util.Random;

public class Questao_10 {
    public static void main(String[] args) {
        int vet1[] = new int[10];
        int vet2[] = new int[10];
        int vet3[] = new int[10];
        Random ale = new Random();

        for(int i = 0; i < 10; i++){
            vet1[i] = ale.nextInt(21);
            vet2[i] = ale.nextInt(21);
            vet3[i] = vet1[i] + vet2[i];
        }
        System.out.println("Vetor 1:");
        for(int i = 0; i < 10; i++){
            System.out.print("["+vet1[i]+"]");
        }
        System.out.println("\nVetor 2:");
        for(int i = 0; i < 10; i++){
            System.out.print("["+vet2[i]+"]");
        }
        System.out.println("\nVetor 3:");
        for(int i = 0; i < 10; i++){
            System.out.print("["+vet3[i]+"]");
        }
    }

}
