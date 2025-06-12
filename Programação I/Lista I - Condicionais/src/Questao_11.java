import java.util.Scanner;

public class Questao_11 {
    public static void main(String[] args) {
        double s, d, q, n;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva o diâmetro da barra cilíndrica:");
        d = in.nextDouble();
        System.out.println("Escreva a carga da barra cilíndrica:");
        q = in.nextDouble();

        if (d > 100) {
            n = 2;
            s = ((4 * q) / (Math.PI * Math.pow(d, 2))) * n;
            System.out.printf("O seu resultado é %.2f", s);
        } else if (d < 50) {
            n = 6;
            s = ((4 * q) / (Math.PI * Math.pow(d, 2))) * n;
            System.out.printf("O seu resultado é %.2f", s);
        } else {
            n = 4;
            s = ((4 * q) / (Math.PI * Math.pow(d, 2))) * n;
            System.out.printf("O seu resultado é %.2f", s);
        }
        in.close();

    }
}
