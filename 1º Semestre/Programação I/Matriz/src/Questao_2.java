import java.util.Scanner;

public class Questao_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] matriz = new double[3][5];
        double[] vetorSomas = new double[3];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                matriz[linha][coluna] = entrada.nextDouble();
                vetorSomas[linha] += matriz[linha][coluna];
            }
        }

        double maiorSoma = vetorSomas[0];
        int indiceMaior = 0;

        for (int i = 1; i < vetorSomas.length; i++) {
            if (vetorSomas[i] > maiorSoma) {
                maiorSoma = vetorSomas[i];
                indiceMaior = i;
            }
        }

        System.out.println("Linha com maior soma: " + (indiceMaior + 1));
    }
}
