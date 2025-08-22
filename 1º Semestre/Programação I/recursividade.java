
import java.util.Scanner;

public class recursividade{

    // Fatorial

    public static long fatorial(long N){
        if(N==1 || N ==0){
            return 1;
        } else{
            return N*fatorial(N-1);
        }
    }

    // Fibonacci

    public static long fibonacci(long N){
        if(N==1 || N ==0){
            return 1;
        } else{
            return fibonacci(N-1) + fibonacci(N - 2);
        }
    }

    // Print

    public static void main(String[] args) {
        Long res_fat, res_fib, num;
        Scanner in = new Scanner(System.in);

        System.out.print("Escreva um número: ");
        num = in.nextLong();
        res_fat = fatorial(num);
        res_fib = fibonacci(num);
        System.out.println("A resposta fatorial: " + res_fat);
        System.out.println("----------------------------");
        System.out.println("Respota fibonacci: " + res_fib);
    }
}