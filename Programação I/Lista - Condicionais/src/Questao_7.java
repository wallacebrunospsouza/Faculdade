import java.util.Scanner;

public class Questao_7 {
    public static void main(String[] args){
        double preco, impost;
        int anof;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Escreva o preço do carro:");
        preco = in.nextDouble();
        System.out.println("Escreva o ano de fabricação:");
        anof = in.nextInt();

        if(anof < 1990){
            impost = preco + (preco * 0.01);
            System.out.printf("O imposto a ser pago é: %.2f", impost);
            in.close();
        } else if (anof >= 1990){
            impost = preco + (preco * 0.015);
            System.out.printf("O imposto será de %.2f", impost);
            in.close();
        }
    }

}
