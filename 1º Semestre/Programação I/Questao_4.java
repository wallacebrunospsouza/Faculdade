import java.util.Scanner;

public class Questao_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;

        System.out.println("Escreva um número: ");
        numero = in.nextInt();
        isEven(numero);
    }

   public static float isEven(float num){
    if(num/2 != 0 && num/3 != 0){
        System.out.println("Seu número é par");
    }else{
        System.out.println("é impar");
    }
        return num;
    }

}
