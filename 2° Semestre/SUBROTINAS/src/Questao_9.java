import java.util.Scanner;

public class Questao_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, K, escolha;

        System.out.println("Escolha entre 1(Permutação), 2(Arranjos) e 3(Combinação): ");
        escolha = in.nextInt();

        System.out.println("Escolha um número: ");
        N = in.nextInt();

        System.out.println("Escolha um segundo número: ");
        K = in.nextInt();

        System.out.println(calculos(escolha, N, K));
    }

    public static int calculos(int escolha, int n, int k) {
        int resultado = 1;

        if (escolha == 1) {
            for (int i = 1; i <= n; i++) {
                resultado *= i;
            }
        } else if (escolha == 2) {
            for (int i = 1; i <= n; i++) {
                resultado *= i / ((n - k) * i);
            }
        } else if (escolha == 3) {
            for (int i = 1; i <= n; i++) {
                resultado *= i / ((k * i) * ((n - k) * i));
            }

        } else {
            System.out.println("Escolha não computada!!");
            System.exit(0);
        }
        return resultado;
    }
}
