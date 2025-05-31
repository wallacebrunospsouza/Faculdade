import java.util.Scanner;

/*
 Entrada: ND, N
 Processo: ND = N * (N - 3)/2
 Saída: ND
 Memória: ND, N
 */


public class Questao_9 {
    public static void main(String[] args){
        double N, ND;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva o número de lados do seu poligono:");
        N = teclado.nextDouble();

        ND = N*(N - 3)/2;

        System.out.printf("A quantidade de diagonais que seu poligono tem é: %.2f", ND);

    }

}
