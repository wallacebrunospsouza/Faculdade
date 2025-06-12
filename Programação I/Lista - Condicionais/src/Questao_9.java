import java.util.Scanner;

public class Questao_9 {
    public static void main(String[] args) throws Exception {
        double a, b, c, d, XI, XII;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva três respectivos números");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (a == 0) {
            System.out.println("Não é equação de 2° grau:");
            if (b == 0) {
                System.out.println("Não é equação");
                in.close();
            } else {
                XI = -c / b;
                System.out.printf("Seu resultado é %.2f", XI);
                in.close();

            }
        } else {

            d = Math.pow(b, 2) - 4 * a * c;

            if (d < 0) {
                System.out.println("Sem raiz real");
                in.close();
            } else {
                XI = (-b + Math.sqrt(d)) / (2 * a);
                XII = (-b - Math.sqrt(d)) / (2 * a);
                System.out.printf("O resultado de XI: %.2f e de XII: %.2f", XI, XII);
                in.close();
            }
        }
    }
}
