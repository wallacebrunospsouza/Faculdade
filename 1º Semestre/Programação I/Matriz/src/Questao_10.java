import java.util.Scanner;

public class Questao_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int[][] ligacoes = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ligacoes[i][j] = entrada.nextInt();
            }
        }

        int cidadeK = entrada.nextInt();
        int estradasSaindo = 0;
        int estradasChegando = 0;

        for (int i = 0; i < n; i++) {
            estradasSaindo += ligacoes[cidadeK][i];
            estradasChegando += ligacoes[i][cidadeK];
        }

        System.out.println("Cidade " + cidadeK + " - Estradas saindo: " + estradasSaindo + ", Estradas chegando: " + estradasChegando);

        int maiorChegada = 0;
        for (int j = 0; j < n; j++) {
            int somaColuna = 0;
            for (int i = 0; i < n; i++) {
                somaColuna += ligacoes[i][j];
            }
            if (somaColuna > maiorChegada) {
                maiorChegada = somaColuna;
            }
        }

        System.out.print("Cidades com maior número de estradas chegando: ");
        for (int j = 0; j < n; j++) {
            int somaColuna = 0;
            for (int i = 0; i < n; i++) {
                somaColuna += ligacoes[i][j];
            }
            if (somaColuna == maiorChegada) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

        System.out.print("Cidades isoladas: ");
        for (int i = 0; i < n; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            for (int j = 0; j < n; j++) {
                somaLinha += ligacoes[i][j];
                somaColuna += ligacoes[j][i];
            }
            if (somaLinha == 1 && somaColuna == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int m = entrada.nextInt();
        int[] rota = new int[m];
        for (int i = 0; i < m; i++) {
            rota[i] = entrada.nextInt();
        }

        boolean rotaPossivel = true;
        for (int i = 0; i < m - 1; i++) {
            if (ligacoes[rota[i]][rota[i + 1]] != 1) {
                rotaPossivel = false;
                break;
            }
        }

        if (rotaPossivel) {
            System.out.println("A rota é possível");
        } else {
            System.out.println("A rota é impossível");
        }
    }
}
