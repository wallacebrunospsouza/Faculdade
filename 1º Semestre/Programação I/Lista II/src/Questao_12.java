import java.util.Scanner;

/*
 Entrada: meta, ruaA, ruaB
 Processamento:
    ruaC = Math.pow(ruaA, 2) + Math.pow(ruaB, 2)
    perimetro = ruaA + ruaB + ruaC
    meta = meta * 1000
    voltas = meta / perimetro
Saída: voltas
memória: meta, ruaA, ruaB, ruaC, voltas, perimetro
 */

public class Questao_12 {
    public static void main(String[] args){
        double meta, ruaA, ruaB, ruaC, voltas, perimetro;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva sua meta:");
        meta = teclado.nextDouble();

        System.out.println("Escreva o tamanho em metros da Rua A:");
        ruaA = teclado.nextDouble();

        System.out.println("Escreva o tamanho em metros da rua B:");
        ruaB = teclado.nextDouble();

        ruaC = Math.sqrt(Math.pow(ruaA, 2) + Math.pow(ruaB, 2));
        perimetro = ruaA + ruaB + ruaC;
        meta = meta * 1000;
        voltas = meta / perimetro;
        voltas = Math.ceil(voltas);

        System.out.printf("A quantidade de voltas em que você dará é: %.2f", voltas);
    

    }

}