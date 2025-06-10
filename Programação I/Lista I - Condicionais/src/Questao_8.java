import java.util.Scanner;

public class Questao_8 {
    public static void main(String[] args) {
        double X, R;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Escreva um número:");
        X = in.nextDouble();

        if(X <= 1){
            R = 1;
            System.out.printf("F(%.1f)", R);
            in.close();
        } else if(1 < X && X <= 2){
            R = 2;
            System.out.printf("F(%.1f)", R);
            in.close();
        }else if (2 < X && X <= 3){
            R = Math.pow(X, 2);
            System.out.printf("F(%.1f)", R);
            in.close();
        } else if(X > 3){
            R = Math.pow(X, 3);
            System.out.printf("F(%.1f)", R);
            in.close();
        }
    }

}
