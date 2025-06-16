import java.util.Scanner;

/*
 Entrada: N1, N2, N3, P1, P2, P3
 Processamento: Medp = (N1 * P1 + N2 * P2 + N3 * P3) / P1 + P2 + P3 
 Saída: Medp
 Uso de memória: N1, N2, N3, P1, P2, P3, Medp
 */

public class Questao_4 {
    public static void main(String[] args){
        
        double N1, N2, N3, P1, P2, P3, Medp;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva as três respectivas notas:");
        N1 = teclado.nextDouble();
        N2 = teclado.nextDouble();
        N3 = teclado.nextDouble();

        System.out.println("Escreva os três respectivos pesos:");
        P1 = teclado.nextDouble();
        P2 = teclado.nextDouble();
        P3 = teclado.nextDouble();

        Medp = (N1*P1 + N2*P2 + N3*P3)/ P1 + P2 + P3;
        System.out.printf("A média ponderada é %.2f", Medp);

    }

}
