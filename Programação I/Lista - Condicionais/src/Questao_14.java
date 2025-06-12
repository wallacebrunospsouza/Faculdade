import java.util.Scanner;

public class Questao_14 {
    public static void main(String[] args){
        int num, casa_1, casa_2, casa_3, num2, Re;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva seu número:");
        num = in.nextInt();

        casa_1 = num%10;
        Re = num/10;
        casa_2 = Re%10;
        Re = Re/10;
        casa_3 = casa_2%10;
        num2 = (casa_1*1) + (casa_2*10) + (casa_3*100);


        if (num2 == num){
            System.out.println("Seu número é um Palíndromo");
        } else {
            System.out.println("Seu número não é um Palíndromo");
            in.close();
        }

    }

}
