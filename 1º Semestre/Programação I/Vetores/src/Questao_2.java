import java.util.Scanner;

public class Questao_2 {
    public static void main(String[] args) {
        int vet1[] = new int[10];
        int vet2[] = new int[10];
        int vet3[] = new int[10];
        Scanner in = new Scanner(System.in);
        
        for (int i = 0; i < vet1.length; i++) {
            System.out.print("Digite o valor do vetor 1 na posição " + (i + 1) + ": ");
            vet1[i] = in.nextInt();
        }

        for (int i = 0; i < vet2.length; i++) {
            System.out.print("Digite o valor do vetor 2 na posição " + (i + 1) + ": ");
            vet2[i] = in.nextInt();
        }

        for (int i = 0; i < vet3.length; i++) {
            vet3[i] = vet1[i] + vet2[i];
        }
        System.out.println("Vetor 3 (soma dos vetores 1 e 2):");
        for (int i = 0; i < vet3.length; i++) {
            System.out.println("Posição " + (i + 1) + ": " + vet3[i]);
        }

    }

}
