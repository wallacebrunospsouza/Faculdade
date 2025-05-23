import java.util.Scanner;

/*
 Entrada: N1, N2, N3
 Processamento: med = (N1 + N2 + N3)/3
 sáida: med
 uso de memória: N1, N2, N3, med
 */

public class Questao_1 {
    public static void main(String[] args) throws Exception {
     Scanner entrada = new Scanner(System.in);

     double N1, N2, N3, med;

        System.out.println("Escreva o primeiro número:");
        N1 = entrada.nextDouble();

        System.out.println("Escreva o segundo número:");
        N2 = entrada.nextDouble();

        System.out.println("Escreva o terceiro número:");
        N3 = entrada.nextDouble();

         med = (N1 + N2 + N3) / 3;

        System.out.println("A média é: " + med);



    }
}
