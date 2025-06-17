import java.util.Scanner;

public class Questao_17 {
    public static void main(String[] args) {
        Float numb1, numb2, numb3;
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva três números:");
        numb1 = in.nextFloat();
        numb2 = in.nextFloat();
        numb3 = in.nextFloat();

        if (numb1 > numb2 && numb2 > numb3) {
            System.out.printf("O maior número é %.2f, %.2f e %.2f \n", numb1, numb2, numb3);
            System.out.printf("O menor número é %.2f, %.2f e %.2f", numb3, numb2, numb1);
        } else if (numb2 > numb1 && numb1 > numb3) {
            System.out.printf("O maior número é %.2f, %.2f e %.2f \n", numb2, numb1, numb3);
            System.out.printf("O menor número é %.2f, %.2f e %.2f", numb3, numb1, numb2);
        } else {
            System.out.printf("O maior número é %.2f, %.2f e %.2f \n", numb3, numb2, numb1);
            System.out.printf("O menor número é %.2f, %.2f e %.2f", numb1, numb2, numb3);
        }
    }
}