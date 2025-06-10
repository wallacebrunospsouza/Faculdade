import java.util.Scanner;

public class Questao_1 {
    public static void main(String[] args) throws Exception {
        int idade;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva sua idade:");
        idade = in.nextInt();

        if( idade >= 5 && idade <= 7){

            System.out.println("Infantil");
            in.close();

        } else if( idade >= 8 && idade <= 10){

            System.out.println("Juvenil");
            in.close();

        } else if( idade >= 11 && idade <= 15){

            System.out.println("Adolescente");
            in.close();

        } else if( idade >= 16 && idade <= 40){

            System.out.println("Adulto");
            in.close();

        } else if( idade > 40){

            System.out.println("Sênior");
            in.close();

        } else if ( idade <= 0){

            System.out.println("Escreva umda idade válida!!");
            in.close();
        }
    }
}
