import java.util.Scanner;

public class Questao_16 {
    public static void main(String[] args) {
    int ano, Ano;
    Scanner in = new Scanner(System.in);

   System.out.println("Escreva o ano:");
    ano = in.nextInt();

    if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
        System.out.println("É um ano bissexto");
    }else{

        System.out.println("Não é um ano bissexto");
    }

    




}

}
