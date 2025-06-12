import java.util.Scanner;

public class Questao_14 {
    public static void main(String[] args){
        int num, casa_1, casa_2, casa_3, num2, Re_1, Re_2, Re_3;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva seu número:");
        num = in.nextInt();

        casa_1 = num%10;
        Re_1 = num/10;
        casa_2 = casa_1%10;
        Re_2 = Re_1/10;
        casa_3 = casa_2%10;
        Re_3 = Re_2/10;
        num2 = (casa_1*100) + (casa_2*10) + (casa_3*1);


        if (num2 == num){
            System.out.println("Seu número é um Palíndromo");
        } else {
            System.out.println("Seu número não é um Palíndromo");
            in.close();
        }

    }

}
