import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {
        int soma = 0, num, qtd;
        double media;
        Scanner in = new Scanner(System.in);

        System.out.print("Escreva a quantidade de números que ele somara: ");
        qtd = in.nextInt();

        for (num = 1; num <= qtd; num++) {
            soma += num; // soma acumulativa
        }
        media = (double) (soma) / num;
        System.out.printf("\nA soma dos %d primeiros números é: %d\n", qtd, soma);
        System.out.printf("E a média é: %.2f", media);
    }

}
