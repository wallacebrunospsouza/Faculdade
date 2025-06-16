import java.util.Scanner;

/*
 Entrada: A, B, C
 Processo:
    delta = Math.pow(B,2) - 4*A*C;
        X1 = (- B + Math.sqrt(delta)/(2*A));
        X2 = (- B - Math.sqrt(delta)/(2*A));
    
 Saída: X1, X2
 Memória: A, B, C, delta, x1, x2
 */

public class Questao_24 {
    public static void main(String[] args){
        double A, B, C, delta, X1, X2;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva um número para A:");
        A = in.nextDouble();

        System.out.println("Escreva um número para B:");
        B = in.nextDouble();

        System.out.println("Escreva um número para C:");
        C = in.nextDouble();

        delta = Math.pow(B,2) - 4 * A * C;
        X1 = (- B + Math.sqrt(delta)/(2*A));
        X2 = (- B - Math.sqrt(delta)/(2*A));



        System.out.printf("X1: %.2f \n X2: %.2f", X1, X2);


    }

}
