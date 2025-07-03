import java.util.Scanner;

public class Questao_10 {
    public static void main(String[] args) {
        double Num, maior = 0, menor = 0;
        int i;
        Scanner in = new Scanner(System.in);

        for (i = 1; i <= 4; i++) {
            System.out.print("Escreva um número:");
            Num = in.nextDouble();

            if (i == 1) {
                maior = Num;
                menor = Num;
            } else if(i > 1) {
                if (menor > maior) {
                    menor = maior;
                    maior = menor;
                }
                if (maior > menor){
                    maior = maior;
                    menor = menor;
                }

            }
        }
        System.out.printf("Seu maior é: %.2f\nSeu menor é: %.2f", maior, menor);

    }

}
