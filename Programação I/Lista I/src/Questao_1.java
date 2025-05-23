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

        System.out.println("Escreva o primeiro número:");
        Float N1 = entrada.nextFloat();

        System.out.println("Escreva o segundo número:");
        Float N2 = entrada.nextFloat();

        System.out.println("Escreva o terceiro número:");
        Float N3 = entrada.nextFloat();

        Float med = N1 + N2 + N3 / 3;

        System.out.println("A média é: " + med);



    }
}
