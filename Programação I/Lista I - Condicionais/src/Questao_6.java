import java.util.Scanner;

public class Questao_6 {
    public static void main(String[] args) {
        double Sal, Re;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva seu salário");
        Sal = in.nextDouble();

        if (Sal < 700) {
            Re = Sal + (Sal * 0.30);
            System.out.printf("Seu novo salário é: %.2f", Re);
            in.close();
        } else if (Sal > 700) {
            Re = Sal + (Sal * 0.10);
            System.out.printf("Seu novo salário é: %.2f", Re);
            in.close();
        }

    }

}
