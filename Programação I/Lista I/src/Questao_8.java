import java.util.Scanner;

/*
 Entrada: Sal, contA, contB
 Processamento:
    contas = contA * 0.02 + contB * 0.02
    Salatual = Sal - contas
Saída: Salatual
Unidade de memória: Sal, contA, contB, contas, Salatual
 */

public class Questao_8 {
    public static void main(String[] args){
        double Sal, contA, contB, contas, Salatual;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva o valor do seu Salário:");
        Sal = teclado.nextDouble();

        System.out.println("Escreva o valor da sua conta A:");
        contA = teclado.nextDouble();

        System.out.println("Escreva o valor da sua conta B:");
        contB = teclado.nextDouble();

        contas = contA * 0.02 + contB * 0.02;
        Salatual = Sal - contas;

        System.out.printf("O seu salário atual será: %.2f", Salatual);



    }

}
