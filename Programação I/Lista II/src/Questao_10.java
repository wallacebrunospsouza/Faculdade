import java.util.Scanner;

/*
 Entrada: deposit, quantAno
 Processamento: 
    Rendimento = 0.5 * quantAno
    total_acumulado = deposit * Rendimento
Saída: total_acumulado
memória: deposit, quantAno, Rendimento, total_acumulado
 */

public class Questao_10 {

    public static void main(String[] args){
        double deposit, quantAno, Rendimento, total_acumulado;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva quantos anos seu dinheiro ficará rendendo (máximo 10 anos):");
        quantAno = teclado.nextDouble();

        System.out.println("Escreva o seu deposito:");
        deposit = teclado.nextDouble();

        if(quantAno == 1){

            quantAno = 12;
            Rendimento = 0.005 * quantAno;
            total_acumulado = deposit * Rendimento;
            System.out.printf("Seu rendimento total será: %.2f", total_acumulado);


        }

        if(quantAno == 2){

            quantAno = 12;
            Rendimento = 0.005 * quantAno;
            total_acumulado = deposit * Rendimento;
            System.out.printf("Seu rendimento total será: %.2f", total_acumulado);
            teclado.close();

        }

        if(quantAno == 3){

            quantAno = 36;
            Rendimento = 0.005 * quantAno;
            total_acumulado = deposit * Rendimento;
            System.out.printf("Seu rendimento total será: %.2f", total_acumulado);
            teclado.close();

        }

        if(quantAno == 4){

            quantAno = 48;
            Rendimento = 0.005 * quantAno;
            total_acumulado = deposit * Rendimento;
            System.out.printf("Seu rendimento total será: %.2f", total_acumulado);
            teclado.close();

        }

        if(quantAno == 5){

            quantAno = 60;
            Rendimento = 0.005 * quantAno;
            total_acumulado = deposit * Rendimento;
            System.out.printf("Seu rendimento total será: %.2f", total_acumulado);
            teclado.close();

        }

        if(quantAno == 6){

            quantAno = 72;
            Rendimento = 0.005 * quantAno;
            total_acumulado = deposit * Rendimento;
            System.out.printf("Seu rendimento total será: %.2f", total_acumulado);
            teclado.close();

        }
        if(quantAno == 7){

            quantAno = 84;
            Rendimento = 0.005 * quantAno;
            total_acumulado = deposit * Rendimento;
            System.out.printf("Seu rendimento total será: %.2f", total_acumulado);
            teclado.close();

        }
        if(quantAno == 8){

            quantAno = 96;
            Rendimento = 0.005 * quantAno;
            total_acumulado = deposit * Rendimento;
            System.out.printf("Seu rendimento total será: %.2f", total_acumulado);
            teclado.close();

        }

        if(quantAno == 9){

            quantAno = 108;
            Rendimento = 0.005 * quantAno;
            total_acumulado = deposit * Rendimento;
            System.out.printf("Seu rendimento total será: %.2f", total_acumulado);
            teclado.close();

        }

        if(quantAno == 10){

            quantAno = 120;
            Rendimento = 0.005 * quantAno;
            total_acumulado = deposit * Rendimento;
            System.out.printf("Seu rendimento total será: %.2f", total_acumulado);
            teclado.close();

        }




    }
    
}
