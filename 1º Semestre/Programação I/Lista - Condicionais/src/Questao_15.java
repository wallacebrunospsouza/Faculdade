import java.util.Scanner;

public class Questao_15 {
    public static void main(String[] args) {
        int num, casa_1, casa_2, casa_3, casa_4;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva o seu número com 4 dígitos:");
        num = in.nextInt();

        casa_1 = num % 10;
        num = num / 10;

        casa_2 = num % 10;
        num = num / 10;

        casa_3 = num % 10;
        num = num / 10;

        casa_4 = num % 10;
        num = num / 10;

        if (casa_1 == 1 || casa_1 == 0) {
            if (casa_2 == 1 || casa_2 == 0) {
                if (casa_3 == 1 || casa_3 == 0) {
                    if (casa_4 == 1 || casa_4 == 0) {

                        System.out.println("");

                    } else {
                        System.out.println("Não é binário");
                    }
                } else {
                    System.out.println("Não é binário");
                }
            } else {
                System.out.println("Não é binário");
            }
        } else {
            System.out.println("Não é binário");
        }

    }

}
