import java.util.Scanner;

/*
 Entrada: A, B
 Processo:
    B += A
    A += B
 Saída: A e B
 Memória: A e B
 */

public class Questao_22 {
    public static void main(String[] args){
        double A, B, A1, B1;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva um número:");
        A = in.nextDouble();

        System.out.println("Escreva um segundo número:");
        B = in.nextDouble();

        B1 = A;
        A1 = B;

        System.out.printf("Seu A é %.2f e seu B é %.2f", A, B);




    }

}
