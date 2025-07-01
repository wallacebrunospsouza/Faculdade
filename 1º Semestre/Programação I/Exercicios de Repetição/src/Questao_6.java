import java.util.Scanner;

public class Questao_6 {
    public static void main(String[] args) {
        int num, i;
        double med, soma;
        Scanner in = new Scanner(System.in);

        System.out.print("Escreva a sequência: ");
        i = in.nextInt();

        for (num = 1; num < i; num++) {
            soma = num + num;
            med = num / num + num;

            System.out.printf(" a soma é: %.2f \n", soma);
        System.out.printf(" a média é: %.2f \n", med);
        }
    }

}
