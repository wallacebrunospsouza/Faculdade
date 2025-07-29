import java.util.Scanner;

public class Questao_15 {
    public static void main(String[] args){
        int num, fib, soma, seq =0, j = 1;
        Scanner in = new Scanner(System.in);

        System.out.print("Escreva até que sequencia você deseja: ");
        num = in.nextInt();

        for(int i = 0; i <= num; i++){
            soma = i + j;
            System.out.println(+soma);

        }
    }
}
