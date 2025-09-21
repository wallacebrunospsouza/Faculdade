import java.util.Scanner;

public class Questao_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;

        System.out.println("Escreva um número: ");
        numero = in.nextInt();
        isEven(numero);
    }

   public static void isEven(int num){
    if(num % 2 == 0){
        System.out.println("Seu número é par");
    }else{
        System.out.println("É ímpar");
    }
    }

}
