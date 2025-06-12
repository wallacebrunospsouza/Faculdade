import java.util.Scanner;

public class Questao_14 {
    public static void main(String[] args){
        int n1, n2, n3;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva seus três números:");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();

        if (n1 == n3){
            System.out.println("Seu número é um Palíndromo");
        } else{
            System.out.println("Seu número não é um Palíndormo");
            in.close();
        }

    }

}
