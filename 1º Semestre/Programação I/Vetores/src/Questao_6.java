import java.util.Scanner;

public class Questao_6 {
    public static void main(String[] args) {
        int vet1[] = new int [10];
        int seq, num, Fib;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva até que número deseja: ");
        seq = in.nextInt();

        for(int i = 0; i < seq; i++){
            Fib = (i - (i + 20));
            if(seq < i){
                Fib = Fib + Fib;
                vet1[i] = in.nextInt();
            }
        }
        for (int i = 0; i < vet1.length; i++) {
            System.out.println(vet1[i]);
        }

    }
}

