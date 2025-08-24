
import java.util.Scanner;

public class Questao_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        int maior = Integer.MIN_VALUE;

        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                matriz[linha][coluna] = entrada.nextInt();
                if (matriz[linha][coluna] > maior) {
                    maior = matriz[linha][coluna];
                }
            }
        }

        int[][] matrizResultado = new int[2][2];
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                matrizResultado[linha][coluna] = matriz[linha][coluna] * maior;
            }
        }

        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.print(matrizResultado[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}

