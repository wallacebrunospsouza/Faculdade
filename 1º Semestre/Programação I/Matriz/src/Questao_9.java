import java.util.Scanner;

public class Questao_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int[][] custos = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                custos[i][j] = entrada.nextInt();
            }
        }

        int[] rota = new int[n];
        for (int i = 0; i < n; i++) {
            rota[i] = entrada.nextInt();
        }

        int custoTotal = 0;
        for (int i = 0; i < n - 1; i++) {
            custoTotal += custos[rota[i]][rota[i + 1]];
        }

        System.out.println("Custo da rota: " + custoTotal);
    }
}
