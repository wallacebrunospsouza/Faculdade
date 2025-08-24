import java.util.Scanner;

public class Questao_15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = 5;
        int[][] amizades = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                amizades[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int totalAmigos = 0;
            for (int j = 0; j < n; j++) {
                totalAmigos += amizades[i][j];
            }
            System.out.println("Pessoa n" + i + " possui " + totalAmigos + " amigos");
        }
    }
}
