import java.util.Scanner;

public class Questao_2 {
    public static void main(String[] args){
        double N, Re;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva um número");
        N = in.nextDouble();

        Re = N%2;

        if ( Re == 0 ){

            System.out.println("Seu número é par");
            in.close();

        } else {

            System.out.println("Seu número é ímpar");
            in.close();

        }
    }

}
