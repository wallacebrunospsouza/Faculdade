import java.util.Scanner;

public class Questao_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] matriz = new double[4][7];
        double menor = Double.MAX_VALUE;
        int linhaMenor = 0;
        int colunaMenor = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = entrada.nextDouble();
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                }
            }
        }

        double minMax = matriz[linhaMenor][0];
        for (int j = 1; j < 7; j++) {
            if (matriz[linhaMenor][j] > minMax) {
                minMax = matriz[linhaMenor][j];
            }
        }

        System.out.println("MINMAX: " + minMax + " - Linha: " + (linhaMenor + 1) + " - Coluna: " + (colunaMenor + 1));
    }
}
