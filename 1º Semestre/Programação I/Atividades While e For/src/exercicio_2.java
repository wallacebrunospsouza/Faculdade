import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {
        int soma = 0, num, qtd;
        Scanner in = new Scanner(System.in);

        System.out.print("Escreva a quantidade de números que ele somara: ");
        qtd = in.nextInt();
         System.out.println("\n Tabelinha dos números somados");

        for (num = 1; num <= qtd; num++) {
            System.out.print(num + " | ");
            soma += num; // soma acumulativa
            System.out.println(soma + " ");
            
        }
    }

}
