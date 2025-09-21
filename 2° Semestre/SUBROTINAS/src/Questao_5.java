import java.util.Scanner;

public class Questao_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A, B, C;
        System.out.println("Escreva o valor de a: ");
        A = in.nextDouble();

        System.out.println("Escreva o valor de b: ");
        B = in.nextDouble();

        System.out.println("Escreva o valor de c: ");
        C = in.nextDouble();

        System.out.println("X1:" + equacaoPositiva(A, B, C));
        System.out.println("X2:" + equacaoNegativa(A, B, C));
    }

    public static double equacaoPositiva(double a, double b, double c) {

        double equacao1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2;

        if (Math.pow(b, 2) - 4 * a * c < 0) {
            System.out.println("Delta deu negativo, equação impossível!!");
            System.exit(0);
        } 
        return equacao1;
    }

    public static double equacaoNegativa(double a, double b, double c) {
        double equacao2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2;

        if (Math.pow(b, 2) - 4 * a * c < 0) {
            System.out.println("Delta deu negativo, equação impossível!!");
            System.exit(0);
        } 
            return equacao2;
       

    }

}
