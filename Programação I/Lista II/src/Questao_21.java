import java.util.Scanner;

/*
 Entrada: AltP, Ang, Pi
 Processo:
    Rad = Pi * Ang / 180
    Hip = AltP / Math.sin(Rad)
 Saída: Hip
 Memória: AltP, Ang, Pi, Rad, Hip
 */

public class Questao_21 {
    public static void main(String[] args){
        double AltP, Ang, Pi, Rad, Hip;
        Pi = 3.14;
        Ang = 90;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva a altura da sua parede:");
        AltP = in.nextDouble();

        Rad = Pi * Ang / 180;
    Hip = AltP / Math.sin(Rad);

    System.out.printf("A medida da escada é %.0f", Hip);




    }

}
