import java.util.Scanner;

public class for_while_dowhile{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double n;

        System.out.print("Escreva a quantide de vezes que você deseja rodar: ");
        n = in.nextDouble();

        int qtd = 1;
        while(qtd <= n){
            System.out.println(qtd + " Eu preciso estudar mais");
            qtd = qtd + 1;
        }
    }

}