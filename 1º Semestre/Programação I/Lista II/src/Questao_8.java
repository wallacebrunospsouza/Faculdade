import java.util.Scanner;

/*
 Entrada: Bmaior, Bmenor, Alt, Valorm
 Processamento: 
    Area = (Bmaior + Bmenor * Alt)/2
    Vend = Area * Valorm
Saída: Vend
Uso de memória: Bmaior, Bmenor, Alt, Valorm, Vend, Area
 */

public class Questao_8 {
    public static void main(String[] args){
        double Bmaior, Bmenor, Alt, Valorm, Vend, Area;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva a Base maior do seu terreno:");
        Bmaior = teclado.nextDouble();

        System.out.println("Escreva a Base menor do seu terreno:");
        Bmenor = teclado.nextDouble();

        System.out.println("Escreva a altura do seu terreno:");
        Alt = teclado.nextDouble();

        System.out.println("Escreva o valor por um metro quadrado:");
        Valorm = teclado.nextDouble();

        Area = (Bmaior + Bmenor * Alt)/2;
        Vend = Area * Valorm;

        System.out.printf ("O valor da venda do seu terreno será: %.2f", Vend);

    }

}
