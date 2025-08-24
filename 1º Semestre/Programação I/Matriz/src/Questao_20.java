import java.util.Scanner;

public class Questao_20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        int M = entrada.nextInt();
        int[][] matriz = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        int colMin = 0;
        boolean escada = true;

        for (int i = 0; i < N; i++) {
            int primeiraNaoZero = -1;
            for (int j = 0; j < M; j++) {
                if (matriz[i][j] != 0) {
                    primeiraNaoZero = j;
                    break;
                }
            }

            if (primeiraNaoZero == -1) {
                for (int k = i + 1; k < N; k++) {
                    for (int j = 0; j < M; j++) {
                        if (matriz[k][j] != 0) {
                            escada = false;
                            break;
                        }
                    }
                    if (!escada)
                        break;
                }
                break;
            } else {
                if (primeiraNaoZero < colMin) {
                    escada = false;
                    break;
                }
                colMin = primeiraNaoZero;
                for (int k = i + 1; k < N; k++) {
                    for (int j = 0; j <= colMin; j++) {
                        if (matriz[k][j] != 0) {
                            escada = false;
                            break;
                        }
                    }
                    if (!escada)
                        break;
                }
                if (!escada)
                    break;
            }
        }

        System.out.println(escada ? "S" : "N");
    }
}
