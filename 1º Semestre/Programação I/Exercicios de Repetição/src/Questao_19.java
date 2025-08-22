import java.util.Scanner;

public class Questao_19 {
    public static void main(String[] args){
        double Num, ELQ, ELC, RZQ, RZC;
        Scanner in = new Scanner(System.in);
    
        System.out.println("Escreva um número:");
        Num = in.nextDouble();

        ELQ = Math.pow(Num, 2);
        ELC = Math.pow(Num, 3);
        RZQ = Math.sqrt(Num);
        RZC = Math.sqrt(Math.sqrt(Num));

        System.out.printf("Seu número: %.2f \n Elevado ao quadrado: %.2f \n Elevado ao cubo: %.2f \n A raiz quadrada: %.2f \n A Raiz cubica: %.2f", Num, ELQ, ELC, RZQ, RZC);

    }

}