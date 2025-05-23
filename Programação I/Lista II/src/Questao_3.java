import java.util.Scanner;

/*
 Entrada: N1, N2, N3
 Processamento: Re = N1 * N2 / N3
 Saída: Re
 Uso de memória: Re, N1, N2, N3
 */

public class Questao_3 {
    public static void main(String[] args){

        double N1, N2, N3, Re;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva seu primeiro número:");
        N1 = teclado.nextDouble();

        System.out.println("Escreva seu segundo número:");
        N2 = teclado.nextDouble();

        System.out.println("Escreva seu terceiro número:");
        N3 = teclado.nextDouble();

        Re = N1 * N2 / N3;

        System.out.printf("O seu resultado é: %.2f", Re);

        


    }

}
