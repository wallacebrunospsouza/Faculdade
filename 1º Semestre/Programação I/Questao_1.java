
/**
 * Escreva a descrição da classe Questao_1 aqui.
 * 
 * @author Wallace Bruno 
 * @version 18/09/2025
 */
 
 import java.util.Scanner;
 public class Questao_1{
         
     public static void main(String[] args){
        int Num;
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva um número de um a 4");
        Num = in.nextInt();
        mes(Num);

     
     }
     
     public static int mes(int N){
         switch (N) {
            case 1:
                System.out.println("Janeiro");
                break;

                case 2:
                System.out.println("Fevereiro");
                break;

                case 3:
                System.out.println("Março");
                break;

                case 4:
                System.out.println("Abril");
                break;

                case 5:
                System.out.println("ERRO!");
                break;
         }
                  return N;
             }
             
         }
        