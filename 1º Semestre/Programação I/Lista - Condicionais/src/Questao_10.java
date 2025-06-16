import java.util.Scanner;

public class Questao_10 {
    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva seu peso:");
        peso = in.nextDouble();
        System.out.println("escreva sua altura:");
        altura = in.nextDouble();

        imc = peso / (Math.pow(altura, 2));

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Acima do peso");
        } else {
            System.out.println("Obeso");
        }
        in.close();

    }
}