import java.util.Scanner;

public class Questao_13 {
    public static void main(String[] args) {
        double n1, n2, n3;
        Scanner in = new Scanner(System.in);

        System.out.println("Informe três respectivos números:");
        n1 = in.nextDouble();
        n2 = in.nextDouble();
        n3 = in.nextDouble();

        if (n1 != n2 && n1 != n3 && n2 != n3){
            System.out.println("Seu triângulo é um Escaleno");
        } else if (n1 == n2){
            System.out.println("Seu triângulo é Isosceles");
        } else if (n1 == n2 && n3 == n2 && n3 == n1) {
            System.out.println("Seu triângulo é Equilátero");
        }
        in.close();
    }

}
