import java.util.Scanner;

/**
 * Escreva a descrição da classe Questao_1 aqui.
 * 
 * @author Wallace Bruno 
 * @version 18/09/2025
 */

public class Questao_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float numero;
        System.out.println("Escreva um número: ");
        numero = in.nextFloat();

        teste(numero);
    }

    public static float teste(float num){
        if(num < 0){
            System.out.println("Seu número é negativo!");
        } else if(num == 0){
            System.out.println("Seu número é nulo!");
        }else{
            System.out.println("Seu número é positivo!");
        }
        
        return num;
    }


}
