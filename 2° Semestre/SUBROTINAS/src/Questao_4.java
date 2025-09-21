import java.util.Scanner;

public class Questao_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A, B, C;
        System.out.println("Escreva o valor de a: ");
        A = in.nextDouble();

        System.out.println("Escreva o valor de b: ");
        B = in.nextDouble();

        System.out.println("Escreva o valor de c: ");
        C = in.nextDouble();

        System.out.println(delta(A, B, C));

    }

    public static double delta(double a, double b, double c) {
       double delta = (Math.pow(b, 2) - (4 * a * c));
        return delta;

    }

}
