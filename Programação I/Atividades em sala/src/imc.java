import java.util.Scanner;

/*
 Entrada: peso, altura
 Processamentos:
 imc = peso/(altura²)
 Saída: imc
 Memoria: peso, altura, imc
 */

    public class imc {

      public static void main(String []args){
         double peso, altura, imc;

         Scanner teclado = new Scanner(System.in);

         System.out.printf("\nEscreva seu peso em kg:");
         peso = teclado.nextDouble();

         System.out.printf("\nEscreva sua altura em metros:");
         altura = teclado.nextDouble();

         imc = peso / (Math.pow(altura,2));

         System.out.printf("\nSeu imc é %.2f", imc);
         teclado.close();
         
         



      }
    }