import java.util.Scanner;

public class Questao_15 {
    public static void main(String[] args){
        int num, casa_1, casa_2, casa_3, casa_4, Re;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva o seu número:");
        num = in.nextInt();

        casa_1 = num%2;
        Re = num/2;
        casa_2 = Re%2;
        Re = Re/2;
        casa_3 = Re%2;
        Re = Re/2;
        casa_4 = Re%2;

        
    }

}
