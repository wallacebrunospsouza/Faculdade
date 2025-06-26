import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {
        double soma = 0, num, qtd;
        double media;
        Scanner in = new Scanner(System.in);

        System.out.print("Escreva a quantidade de números que ele somara: ");
        qtd = in.nextDouble();

        for (num = 1; num <= qtd; num++) {
            soma += num; // soma acumulativa
        }
        media = soma / num;
        System.out.printf("\nA soma dos %.2f primeiros números é: %.2f\n", qtd, soma);
        System.out.printf("E a média é: %.2f", media);
    }

}
