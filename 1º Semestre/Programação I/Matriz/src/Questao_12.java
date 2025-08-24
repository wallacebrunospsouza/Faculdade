import java.util.Scanner;

public class Questao_12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matrizA = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = entrada.nextInt();
            }
        }

        int linhasB = entrada.nextInt();
        int colunasB = entrada.nextInt();
        int[][] matrizB = new int[linhasB][colunasB];
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                matrizB[i][j] = entrada.nextInt();
            }
        }

        if (matrizA[0].length != linhasB) {
            System.out.println("Multiplicação impossível");
            return;
        }

        int[][] resultado = new int[3][colunasB];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < 4; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
