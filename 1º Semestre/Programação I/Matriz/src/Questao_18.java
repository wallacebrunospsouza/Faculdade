import java.util.Scanner;

public class Questao_18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        int vDario = 0;
        int vXerxes = 0;

        int[][] vence = {
            {0,1,1,0,0},
            {0,0,1,1,0},
            {0,0,0,1,1},
            {1,0,0,0,1},
            {1,1,0,0,0}
        };

        for (int i = 0; i < N; i++) {
            int dario = entrada.nextInt();
            int xerxes = entrada.nextInt();
            if (vence[dario][xerxes] == 1) vDario++;
            else vXerxes++;
        }

        if (vDario > vXerxes) System.out.println("dario");
        else System.out.println("xerxes");
    }
}
