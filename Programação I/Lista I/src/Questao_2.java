import java.util.Scanner;

/*
 Entrada: N1
 Procssamento:
 sucessor = N1 + 1
 antecessor = N1 - 1
 Saída: sucessor, antecessor
 uso de memória: N1, sucessor, antecessor
 */

public class Questao_2 {
    public static void main(String[] args) {

        double N1, sucessor, antecessor;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva um número:");
        N1 = teclado.nextDouble();

        sucessor = N1 + 1;
        antecessor = N1 - 1;

        System.out.printf("O sucessor é: %.2f\n",sucessor);
        System.out.printf("O Antecessor é: %.2f",antecessor);
        
    }

}
