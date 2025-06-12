import java.util.Scanner;

public class Questao_5 {
    public static void main(String[] args){
        char letra;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Escreva uma letra");
        letra = in.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
           
            System.out.println("Sua letra é uma vogal");
            in.close();
            
        } else {

            System.out.println("Sua letra não é uma vogal");
            in.close();

        }
    }

}
