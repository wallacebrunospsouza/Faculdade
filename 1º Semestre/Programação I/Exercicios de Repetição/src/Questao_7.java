import java.util.Scanner;

public class Questao_7 {
    public static void main(String[] args) {
        int i, N;
        double H = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Escreva a sequência: ");
        N = in.nextInt();

        for (i = 0; i <= N; i++) {
            H = H + i;
            System.out.printf("1 / %.2f \n", H);
        }
    }

}
