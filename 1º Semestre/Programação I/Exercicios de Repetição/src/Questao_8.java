import java.util.Scanner;

public class Questao_8 {
    public static void main(String[] args) {
        int i, N;
        double H = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Escreva a sequência: ");
        N = in.nextInt();

        for (i = 1; i <= N; i++) {
            H = H + i;
            if(i%2 != 0){
            System.out.printf("1 / %.2f + ", H);
            } else {
                System.out.printf("1 / %.2f - ", H);
            }
        }
    }

}
