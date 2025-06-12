import java.util.Scanner;

public class Questao_4 {
    public static void main(String[] args){
        char Op;
        double Numb1, Numb2, Re;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva a operação desejada(Soma, Subtração, Multiplicação e Divisão):");
        Op = in.next().charAt(2);

        System.out.println("Escreva os números que deseja:");
        Numb1 = in.nextDouble();
        Numb2 = in.nextDouble();

        if(Op == 'm'){

            System.out.println(Re = Numb1 + Numb2);
            in.close();

        } if(Op == 'b'){

            System.out.println(Re = Numb1 - Numb2);
            in.close();

        } if(Op == 'l'){

            System.out.println(Re = Numb1 * Numb2);
            in.close();

        } if(Op == 'v'){

            System.out.println(Re = Numb1 / Numb2);
            in.close();
        }
    }

}
