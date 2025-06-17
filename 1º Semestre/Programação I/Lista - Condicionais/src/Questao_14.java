import java.util.Scanner;

public class Questao_14 {
    public static void main(String[] args){
        int num, casa_1, casa_2, casa_3;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva seu número:");
        num = in.nextInt();

        casa_1 = num % 10;
        num = num/10;
        
        casa_2 = num%10;
        num = num/10;

        casa_3 = num%10;
        num = num/10;

        



    }

}
