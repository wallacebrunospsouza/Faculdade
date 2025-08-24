import java.util.Scanner;

public class Questao_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] notas = new double[10][5];
        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            nomes[i] = entrada.nextLine();
            for (int j = 0; j < 5; j++) {
                notas[i][j] = entrada.nextDouble();
            }
            entrada.nextLine();
        }

        for (int i = 0; i < 10; i++) {
            double soma = 0;
            for (int j = 0; j < 5; j++) {
                soma += notas[i][j];
            }
            double media = soma / 5;
            String situacao;
            if (media >= 7) {
                situacao = "Aprovado";
            } else if (media < 4) {
                situacao = "Reprovado";
            } else {
                situacao = "Exame Especial";
            }
            System.out.println(nomes[i] + " - Média: " + media + " - " + situacao);
        }
    }
}
