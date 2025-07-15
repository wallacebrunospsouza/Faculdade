import java.util.Scanner;

public class Questao_14 {
    public static void main(String[] args){
        double fat = 1, num;
        Scanner in = new Scanner(System.in);
        System.out.print("Escreva um número: ");
        num = in.nextDouble();

        for(int i = 1; i <= num; i++){
            fat = fat*i;
        }
        System.out.printf("\nFatorial de %.2f é %.2f\n", num, fat);
    }
}
