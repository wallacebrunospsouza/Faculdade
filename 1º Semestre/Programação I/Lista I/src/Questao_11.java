import java.util.Scanner;

/*
 Entrada: Hn, He, Salmin
 Processamento: 
    ValorHn = 0.125*Salmin
    ValorHe = 0.25*Salmin
    Salbruto = Hn*ValorHn
    adHe = He*ValorHe
    Salf = Salbruto + adHe
Saída: Salf
Unidade de memória: Hn, He, Salmin, ValorHn, ValorHe, Salbruto, adHe, Salf
 */


public class Questao_11 {
    public static void main(String[] args){
        double Hn, He, Salmin, ValorHn, ValorHe, Salbruto, adHe, Salf;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva a quantidade de horas normais:");
        Hn = teclado.nextDouble();

        System.out.println("Escrava a quantida de horas extras:");
        He = teclado.nextDouble();

        System.out.println("Escreva o seu salário minímo:");
        Salmin = teclado.nextDouble();

        ValorHn = 0.125 * Salmin;
        ValorHe = 0.25 * Salmin;
        Salbruto = Hn * ValorHn;
        adHe = He * ValorHe;
        Salf = Salbruto + adHe;

        System.out.printf("Seu salário final é: %.2f", Salf);

    }

}
