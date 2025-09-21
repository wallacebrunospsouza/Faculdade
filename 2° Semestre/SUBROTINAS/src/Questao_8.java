import java.util.Scanner;

public class Questao_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;

        System.out.println("Escreva um número: ");
        numero = in.nextInt();

        System.out.println("o fatorial de " + numero + " é " + fatorial(numero));
    }

    public static double fatorial(double numero) {
        double resultado = 1;
        if (numero < 0) {
            System.out.println("Não existe fatorial negativo!!");
            System.exit(0);
        } else {
            for (int i = 1; i <= numero; i++) {
                resultado *= i;
            }
        }
        return resultado;
    }
}
