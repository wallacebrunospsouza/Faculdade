import java.util.Scanner;

public class Questao_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        double trip;

        System.out.print("Escreva um número: ");
        trip = in.nextDouble();

        for (num = 0; num < 1000; num++) {
            trip = trip * 3;
            System.out.println(trip + " ");

        }

    }

}
