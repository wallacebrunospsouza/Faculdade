import java.util.Scanner;

/*
 Entrada: Salfixo, Valt
 Processamento: 
    Comi = Valt * 0.04
    Salreceb = Slafixo + Comi
Saída: Salreceb
Uso de memória: Salfixo, Valt, Salreceb, Comi
 */

public class Questao_6 {
    public static void main(String[] args){

        double Salfixo, Valt, Salreceb, Comi;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva seu salário fixo:");
        Salfixo = teclado.nextDouble();
        System.out.println("Escreva seu valor Total:");
        Valt = teclado.nextDouble();

        Comi = Valt * 0.04;
        Salreceb = Salfixo + Comi;

        System.out.printf("Seu saldo a ser recebido será %.2f", Salreceb);

        

    }

}
