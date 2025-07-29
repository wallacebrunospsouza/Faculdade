import java.util.Scanner;

public class Questao_4 {
    public static void main(String[] args) {
        int vetororiginal[] = new int[10];
        int vetorinvertido[] = new int[10];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < vetororiginal.length; i++) {
            System.out.print("Digite o valor do vetor original na posição " + (i + 1) + ": ");
            vetororiginal[i] = in.nextInt();
        }

        for (int i = 0; i < vetorinvertido.length; i++) {
            vetorinvertido[i] = vetororiginal[vetororiginal.length - 1 - i];
        }

        System.out.println("Vetor original:");
        for (int i = 0; i < vetororiginal.length; i++) {
            System.out.println("Posição " + (i + 1) + ": " + vetororiginal[i]);
        }

        System.out.println("Vetor invertido:");
        for (int i = 0; i < vetorinvertido.length; i++) {
            System.out.println("Posição " + (i + 1) + ": " + vetorinvertido[i]);
        }
    }

}
