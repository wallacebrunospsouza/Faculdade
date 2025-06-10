import java.util.Scanner;

public class if_else_oneline {

    public static void main(String []args){
        String resposta;
        Scanner in = new Scanner(System.in);
        double  Nu;

        System.out.println("Escreva um número:");
        Nu = in.nextDouble();

        resposta = ( Nu<0 )?"Negativo":( Nu>0 )?"Positivo":"Nulo";
        System.out.println(resposta);
    }
    
}
