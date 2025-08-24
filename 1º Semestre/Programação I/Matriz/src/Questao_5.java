import java.util.Scanner;

public class Questao_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] linhas = new double[6][20];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 20; j++) {
                linhas[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < 6; i++) {
            double soma = 0;
            for (int j = 0; j < 20; j++) {
                soma += linhas[i][j];
            }
            double media = soma / 20;
            double somaQuadrados = 0;
            for (int j = 0; j < 20; j++) {
                somaQuadrados += Math.pow(linhas[i][j] - media, 2);
            }
            double desvioPadrao = Math.sqrt(somaQuadrados / 20);
            System.out.println("Linha " + (i + 1) + " - Média: " + media + " ml - Desvio padrão: " + desvioPadrao);
            if (desvioPadrao > 5 || media < 385 || media > 395) {
                System.out.println("Linha " + (i + 1) + " precisa ser revisada.");
            }
        }
    }
}
