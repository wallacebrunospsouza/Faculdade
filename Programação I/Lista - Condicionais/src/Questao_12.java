import java.util.Scanner;

public class Questao_12 {
    public static void main(String[] args){
        float data_vot, data_nasc;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva sua data de nascimento:");
        data_nasc = in.nextFloat();
        System.out.println("Escreva a data da sua votação:");
        data_vot = in.nextFloat();

        System.out.printf("Sua data de nascimento é: %,2f \n e sua data de votação é: %.2f", data_nasc, data_vot); 



        
    }

}
