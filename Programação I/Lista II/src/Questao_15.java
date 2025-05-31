import java.util.Scanner;

/*
 Entrada: r
 Processamento:
    C = 2 * r * pi
Saída: C
Memória: r, C, pi
 */

public class Questao_15 {
    public static void main(String[] args){
        double r, C, pi;
        pi = 3.1416;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva o raio da sua circuferencia:");
        r = in.nextDouble();

        C = 2* r *pi;

        System.out.printf("Sua circuferencia será %.2f", C);
    }

}
