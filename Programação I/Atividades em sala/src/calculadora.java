import java.util.Scanner;

/*Entrada: num1, num2
 Processamentos:
 soma = num1 + num2
 sub = num1 - num2
 mult = num1 * num2
 div = num1 / num2
 Saída: Soma, sub, mul, div
 Memoria: num1, num2, soma, sub, mult, div, escolha
 */

 public class calculadora {
    public static void main(String []args){
        double num1, num2, soma, sub, mult, div, escolha;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva o primeiro número:");
        num1 = teclado.nextDouble();

        System.out.println("Escreva o segundo número:");
        num2 = teclado.nextDouble();

        System.out.println("Agora digita um número de 1 a 4 respectivamente para:\n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão \n 5 - todas de uma vez \n");
        escolha = teclado.nextDouble();


        if(escolha == 1){
         soma = num1 + num2;
         //Em Printf
         System.out.printf("A soma é %.2f",soma);

        }

        if(escolha == 2){
         sub = num1 - num2;
         //Em Printf
         System.out.printf("A soma é %.2f", sub);
        }

        if(escolha == 3){
         mult = num1 * num2;
         //Em Printf
         System.out.printf("A soma é %.2f", mult);
        }

        if(escolha == 4){
         div = num1 / num2;
         //Em Printf
         System.out.printf("A soma é %.2f", div);

        }

        if(escolha ==5){
        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        //Em Printf
        System.out.printf("A soma é %.2f \n A subtração é %.2f \n A multiplicação é %.2f \n A divisão é %.2f", soma, sub, mult, div);
   
        }


    }

    } 