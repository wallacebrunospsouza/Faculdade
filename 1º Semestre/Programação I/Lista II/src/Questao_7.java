import java.util.Scanner;

/*
 Entrada: base, altura
 Processamento:
    Area = base * altura
    Perimetro = 2 * (base + altura)
 Saída: Area, Perimetro
 Uso de memória: base, altura, Area, Perimetro
 */

public class Questao_7 {
    public static void main(String[] args){
        double base, altura, Area, Perimetro;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva a base do retângulo:");
        base = teclado.nextDouble();

        System.out.println("Escreva a altura do retângulo:");
        altura = teclado.nextDouble();

        Area = base * altura;
        Perimetro = 2 * (base + altura);

        System.out.printf("A Área do seu retângulo é %.2f, e o Perímetro do seu retângulo é %.2f.", Area, Perimetro);

    }

}
