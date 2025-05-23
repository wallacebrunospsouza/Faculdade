import java.util.Scanner;

/*
 Entrada: Salb
 Processamento:
    Salgraf = Salb * 0.10
    Salimpost = Salgraf * 0.05
    Salreceb = Salgraf - Salimpost
 Saída: Salreceb
 Uso de memória: Salb, Salgraf, Salimpost, Salreceb
 */


public class Questao_5 {
    public static void main(String[] args){

        double Salb, Salgraf, Salimpost, Salreceb;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva o seu salário base:");
        Salb = teclado.nextDouble();

        Salgraf = Salb * 0.10;
        Salimpost = Salgraf * 0.05;
        Salreceb = Salgraf - Salimpost + Salb;

        System.out.printf("O salário a receber é %.2f", Salreceb);





    }

}
