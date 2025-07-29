import java.util.Scanner;

public class Questao_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade[] = new int[40];
        int menor16 = 0;
        int maior16 = 0;
        int media, idadenovo, idadevelho, soma = 0;

        for (int i = 0; i < idade.length; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idade[i] = in.nextInt();
        }

        for (int i = 0; i < idade.length; i++) {
            if (idade[i] < 16) {
                menor16++;
            } else {
                maior16++;
            }
        }
        for (int i = 0; i < idade.length; i++) {
            soma += idade[i];
        }
        idadenovo = idade[0];
        for (int i = 1; i < idade.length; i++) {
            if (idade[i] < idadenovo) {
                idadenovo = idade[i];
            }
        }
        System.out.println(idadenovo);
        idadevelho = idade[0];
        for (int i = 1; i < idade.length; i++) {
            if (idade[i] > idadevelho) {
                idadevelho = idade[i];
            }
        }
        media = soma / idade.length;
        System.out.println("Número de pessoas menores iguais a 16 anos: " + menor16);
        System.out.println("\nNúmero de pessoas maiores que 16 anos: " + maior16);
        System.out.println("\nMédia de idade: " + media);
        System.out.print("\nIdade do aluno mais novo: " + idadenovo);
        System.out.println("\nIdade do aluno mais velho: " + idadevelho);
    }
}