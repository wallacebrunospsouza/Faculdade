import java.util.Scanner;

/*
 Entrada: raio, voltas, Tseg, Pi
 Processamento: 
    Circu = 2 * Pi * raio
    Distanc = Circu * voltas
    Thor = Tseg / 3600
    VelociM = (Distanc/1000)/Thor
Saída: Distanc, Velocim
Unidade de memória: raio, voltas, Tseg, Pi, Circu, Distanc, Thor, VelociM
 */


public class Questao_10 {
    public static void main(String[] args){
        double raio, voltas, Tseg, Pi, Circu, Distanc, Thor, VelociM;
        Scanner teclado = new Scanner(System.in);
        Pi = 3.14;

        System.out.println("Escreva o raio da roda em metros:");
        raio = teclado.nextDouble();

        System.out.println("Escreva a quantidade de voltas completadas:");
        voltas = teclado.nextDouble();

        System.out.println("Escreva o tempo total do exercicio feito em segundos:");
        Tseg = teclado.nextDouble();

        Circu = 2 * Pi * raio;
        Distanc = Circu * voltas;
        Thor = Tseg / 3600;
        VelociM = (Distanc/1000)/Thor;

        System.out.printf("A distância pecorrida em metros é %.2f, e a velocidade média em km por hora é %.2f", Distanc, VelociM);
        



    }

}
