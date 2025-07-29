import java.util.Scanner;

public class Questao_23 {
    public static void main(String[]args){
        double S = 0, num, den, termo, exp = 1, x;
        Scanner in = new Scanner(System.in);
       System.out.print("escreva o x: ");
       x = in.nextDouble();

       x = ( x * 3.1415)/180;

       for( int i = 1; i <= 15; i++){
           num = Math.pow(x, exp);
           double fat = 1;
           for(int j = 1; j <= exp; j++){
               fat = fat*j;
           }
           den = fat;
           termo = num / den;
           if(i%2 != 0){
               S += termo;

           } else{
               S -= termo;
           }
           exp = exp+2;

       }
       System.out.println("Seno" + S);

    }
}
