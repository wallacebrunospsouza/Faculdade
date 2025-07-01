import java.util.Scanner;

public class Questao_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int trip;

        do{
            System.out.print("Escreva um número: ");
            num = in.nextInt();
               trip = num * 3;
               System.out.println(trip + " ");
        }while(num != -999);
    
    }
    }


