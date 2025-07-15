import java.util.Scanner;

public class Questao_13 {
    public static void main(String[] args){
        double num;
        Scanner in = new Scanner(System.in);

        System.out.print("Escreva um número: ");
        num = in.nextDouble();

        if(num%2 != 0 && num%num == 0){
            System.out.println("é um número primo");
        } else {
            System.out.println("Não é um número primo");
        }

    }
}
