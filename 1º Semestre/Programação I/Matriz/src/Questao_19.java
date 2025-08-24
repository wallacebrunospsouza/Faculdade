import java.util.Scanner;

public class Questao_19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int L = entrada.nextInt();
        int C = entrada.nextInt();
        entrada.nextLine();
        char[][] mapa = new char[L][C];
        int linO = -1, colO = -1;

        for (int i = 0; i < L; i++) {
            String linha = entrada.nextLine();
            for (int j = 0; j < C; j++) {
                mapa[i][j] = linha.charAt(j);
                if (mapa[i][j] == 'o') {
                    linO = i;
                    colO = j;
                }
            }
        }

        boolean[][] visitado = new boolean[L][C];
        int linAtual = linO;
        int colAtual = colO;

        while (true) {
            visitado[linAtual][colAtual] = true;
            boolean encontrou = false;

            int[] dLin = {-1, 1, 0, 0};
            int[] dCol = {0, 0, -1, 1};

            for (int d = 0; d < 4; d++) {
                int nLin = linAtual + dLin[d];
                int nCol = colAtual + dCol[d];
                if (nLin >= 0 && nLin < L && nCol >= 0 && nCol < C && mapa[nLin][nCol] == 'H' && !visitado[nLin][nCol]) {
                    linAtual = nLin;
                    colAtual = nCol;
                    encontrou = true;
                    break;
                }
            }

            if (!encontrou) break;
        }

        System.out.println((linAtual + 1) + " " + (colAtual + 1));
    }
}
