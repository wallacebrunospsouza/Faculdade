import java.util.Scanner;

    public class if_condicional {
        public static void main(String[] args){
            double Numb;
            Scanner in = new Scanner(System.in);

            System.out.println("Escreva um número:");
            Numb = in.nextDouble();

            if(Numb > 0 == true){
                System.out.printf("Seu número é positivo");
                in.close();
            }
        }
}