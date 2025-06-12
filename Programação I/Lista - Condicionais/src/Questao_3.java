import java.util.Scanner;

public class Questao_3 {
    public static void main(String[] args){
        double CF, custo;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva o custo da fábrica:");
        CF = in.nextDouble();

        if (28000 <= CF){
            
            custo = CF * 0.5;
            System.out.printf("Seu custo será %.2f", custo);
            in.close();
        } else if (CF >= 28000.01 && CF <= 45000){
            
            custo = CF * 0.10 * 0.15;
            System.out.printf("Seu custo será %.2f", custo);
            in.close();
        } else if (CF > 45000){
            
            custo = CF * 0.15 * 0.20;
            System.out.printf("Seu custo será %.2f", custo);
            in.close();
        }
    }

}
