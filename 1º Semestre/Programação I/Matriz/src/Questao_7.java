import java.util.Scanner;

public class Questao_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        boolean ehPermutacao = true;

        for (int i = 0; i < n; i++) {
            int somaLinha = 0;
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != 0 && matriz[i][j] != 1) {
                    ehPermutacao = false;
                    break;
                }
                somaLinha += matriz[i][j];
            }
            if (somaLinha != 1) {
                ehPermutacao = false;
                break;
            }
        }

        if (ehPermutacao) {
            for (int j = 0; j < n; j++) {
                int somaColuna = 0;
                for (int i = 0; i < n; i++) {
                    somaColuna += matriz[i][j];
                }
                if (somaColuna != 1) {
                    ehPermutacao = false;
                    break;
                }
            }
        }

        if (ehPermutacao) {
            System.out.println("É uma matriz permutação");
        } else {
            System.out.println("Não é uma matriz permutação");
        }
    }
}
