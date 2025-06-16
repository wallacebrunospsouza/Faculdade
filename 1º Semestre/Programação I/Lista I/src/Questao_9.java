import java.util.Scanner;

/*
 Entrada: anoAtual, anoInicio, CN
 Processamento: CR = ((anoAtual - anoInicio)/4)+1-CN
 Saída: CR
 Unidade de memória: anoAtual, anoInicio, CN, CR
 */

public class Questao_9 {
    public static void main(String[] args){
        double anoAtual, anoInicio, CN, CR;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva o ano que iniciou a copa do mundo:");
        anoInicio = teclado.nextDouble();

        System.out.println("Escreva o ano que ocorrerá a próxima copa ou ocorreu a última copa:");
        anoAtual = teclado.nextDouble();

        System.out.println("Coloca a quantidade de copas não realizadas:");
        CN = teclado.nextDouble();

        CR = ((anoAtual - anoInicio)/4)+1-CN;

        System.out.printf("A quantidade de copas realizadas desde %.2f é: %.2f", anoInicio, CR);

    }

}
