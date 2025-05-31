import java.util.Scanner;

/*
 Entrada: SalMin, quantWat
 Processo:
    Watts = Math.sqrt(quantWat)
    ValorPW = SalMin * Watts
    ValorPC = SalMin * quantWat
    ValorPD = ValorPC - 0.15

 Saída: ValorPW, ValorPC, ValorPD
 Memória: SalMin, quantWat, Watts, ValorPW, ValorPC, ValorPD
 */

public class Questao_18 {
    public static void main(String[] args){
        double SalMin, quantWat, Watts, ValorPW, ValorPC, ValorPD;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva o seu salário minímo:");
        SalMin = in.nextDouble();

        System.out.println("Escreva a quantidade de Watts da sua casa:");
        quantWat = in.nextDouble();

        Watts = Math.sqrt(quantWat);
    ValorPW = SalMin * Watts;
    ValorPC = SalMin * quantWat;
    ValorPD = ValorPC - 0.15;

    System.out.printf("O valor por Watts é %.2f, o valor a ser pago por consumo é %.2f e o valor a ser pago considerando um desconto é %.2f", ValorPW, ValorPC, ValorPD);


    }

}
