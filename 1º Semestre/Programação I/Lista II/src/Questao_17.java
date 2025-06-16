import java.util.Scanner;

/*
 Entrada: NumR
 Processamento:
    Int = NumR / 3
    Frac = NumR % 3
 Saída: Int, Frac
 Memória: Numr, Int, Frac
 */

public class Questao_17 {
    public static void main(String[] args){
        Float NumR, Int, Frac;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva o número real:");
        NumR = in.nextFloat();

        Int = NumR % 3;
        Frac = NumR / 3;

        System.out.printf("A parte inteira é %.2f e a Fracionaria é %.2f", Int, Frac);



    }

}
