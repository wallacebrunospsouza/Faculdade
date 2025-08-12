import java.util.Scanner;

public class Questao_16 {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
    int v1[] = new int [3];

    for(int i = 0; i < v1.length; i++){
        System.out.print("Escreva um número: ");
        v1[i] = in.nextInt();
    }

    for(int i = 0; i < v1.length; i++){
        if( v1[2] < v1[1] || v1[2] < v1[3] ){
           System.out.println("S");
        } else if (v1[2] > v1[1] || v1[2] > v1[3]){
            System.out.println("N");
        }
    }
   }

}
