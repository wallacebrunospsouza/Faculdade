import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n;
        int qtd = 1;

        System.out.print("Escreva quantas vezes você quer escrever: ");
        n = in.nextDouble();

        while (qtd <= n) {
            if (qtd == 2 * n) {
                System.out.print(qtd + "; ");
            }
            qtd++;
        }
    }

}
