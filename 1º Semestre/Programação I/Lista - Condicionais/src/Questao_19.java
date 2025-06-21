import java.util.Scanner;

public class Questao_19 {
    public static void main(String[] args){
        double salBase, tempo, grat, imp, salFinal;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva seu sálario base:");
        salBase = in.nextDouble();
        System.out.println("Escreva o tempo que você trabalhou no mês:");
        tempo = in.nextDouble();

        if (salBase < 2000){
            tempo = tempo/20;
            grat = salBase + tempo;
            salFinal = grat - 0.10;
            System.out.printf("Seu salário final é %.2f", salFinal);
        } else if (salBase >= 2000){
            tempo = tempo/20;
            grat = salBase + tempo;
            salFinal = grat - 0.15;
            System.out.printf("Seu salário final é %.2f", salFinal);

        }
        in.close();
    }

}
