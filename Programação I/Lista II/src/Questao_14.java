import java.util.Scanner;

/*
 Entrada: Base, Altura
 Processamento:
    Area = Base * Altura;
    potencia = Area * Watts
Saída: Base, Altura, Area, potencia, Watts
 */

public class Questao_14 {
    public static void main(String[] args){
        double Base, Altura, Area, potencia, Watts;
        Watts = 18;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva a Base do seu comodo:");
        Base = in.nextDouble();

        System.out.println("Escreva a altura do seu comodo:");
        Altura = in.nextDouble();

        Area = Base * Altura;
        potencia = Area * Watts;

        System.out.printf("A area do seu comodo é %.2f e a potencia terá que ser %.2f", Area, potencia);
    }

}
