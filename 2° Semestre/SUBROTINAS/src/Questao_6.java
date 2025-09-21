import java.util.Scanner;

public class Questao_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A, B;
        System.out.println("Escreva primeiro número: ");
        A = in.nextDouble();
        
        System.out.println("Escreva segundo número: ");
        B = in.nextDouble();

        System.out.println("O maior número é: " + maior(A, B));
    }

    public static double maior(double a, double b){
        double maior = 0;
        
        if( a > b){
            maior = a;
        } else {
            maior = b;
        }
        return maior;
        
    }
}
