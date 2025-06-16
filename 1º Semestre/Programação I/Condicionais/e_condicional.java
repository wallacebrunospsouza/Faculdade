import java.util.Scanner;

    public class e_condicional {
        public static void main(String[] args){
            double Numb;
            Scanner in = new Scanner(System.in);

            System.out.println("Escreva um número:");
            Numb = in.nextDouble();

            if(Numb < 0){
                System.out.printf("idade inválidda");
                in.close();
            } else if (Numb >= 5 && Numb <5 ){
                System.out.println("Não participa");
                in.close();
            } else if (Numb >= 5 && Numb <=10){
                System.out.println("Infantil");
                in.close();

            } else if (Numb > 10 && Numb < 18){
                System.out.println("Juvennil");
                in.close();
            } else if (Numb >= 18 && Numb < 40){
                System.out.println("Adulto");
                in.close();
            } else {
                System.out.println("Sênior");
                in.close();
            }
        }
}