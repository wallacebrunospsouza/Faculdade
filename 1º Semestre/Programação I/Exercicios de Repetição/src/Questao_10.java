import java.util.Scanner;

public class Questao_10 {
    public static void main(String []args){
        double Num, maior, menor;
        int i;
        Scanner in = new Scanner(System.in);

        for(i = 1; i <= 4; i++){
            System.out.print("Escreva um número:");
            Num = in.nextDouble();

            if(i==1){
                maior = Num;
                menor = Num;
            } else {
                if (menor > maior){
                menor = maior;
                maior = menor;
                }
        }
    }

}
}