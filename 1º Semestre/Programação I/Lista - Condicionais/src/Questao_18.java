import java.util.Scanner;

public class Questao_18 {
    public static void main(String[] args){
        double cod, nota, descont;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva o seu código:");
        cod = in.nextDouble();
        System.out.println("Escreva o valor da nota:");
        nota = in.nextDouble();

        if (cod > 1 && cod < 10){
            System.out.println("o valor unitário é R$ 10,00");

        } else if (cod > 11 && cod <= 20){
            System.out.println("o valor unitário é R$ 20,00");
        } else if (cod > 21 && cod <= 30){
            System.out.println("o valor unitário é R$ 30,00");
        } else if (cod > 31 && cod <= 40){
            System.out.println("o valor unitário é R$ 40,00");
        } else {
            System.out.println("Esse código não existe");
            in.close();
        }

        if (nota <= 250){
            descont = nota - (nota * 0.5);
            System.out.printf("Seu desconto será de %.2f", descont);

        } else if (nota > 250 && nota < 500){
            descont = nota - (nota * 0.10);
            System.out.printf("Seu desconto será de %.2f", descont);
    } if (nota > 500){
            descont = nota - (nota * 0.15);
            System.out.printf("Seu desconto será de %.2f", descont);

}

    }
}
