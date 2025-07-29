import java.util.Scanner;

public class Questao_16 {
    public static void main(String[] args){
        int bin, oct, dexi, dig;
        Scanner in = new Scanner(System.in);
        boolean isBin=true;
        System.out.print("Escreva um número binário: ");
        bin = in.nextInt();
        while(bin>0){
            dig = bin%10;
            bin = bin/10;
            System.out.println(dig);
            if(dig!=0 && dig!=1){
                isBin = false;
                break;
            }

        }

        if(isBin){
            System.out.println("Binário");
        }
        else{
            System.out.println("Não é binário");
        }
    }
}
