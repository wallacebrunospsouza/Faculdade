import java.util.Scanner;

public class Questao_28 {
    public static void main(String[] args){
    double N, N2, som, med;
    Scanner in = new Scanner(System.in);

    do{
    System.out.printf("Escreva dois número: ", " ");
    N = in.nextDouble();
    N2 = in.nextDouble();

    som = N + N2;
    med = som/2;

    System.out.printf("Sua soma é: %.2f. \nSua média é: %.2f.\n-----------------------\n" + "", som, med);
    }while(N != 0);

    }
}
