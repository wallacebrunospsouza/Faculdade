import java.util.Random;

public class Questao_9 {
    public static void main(String[] args) {
        int gen[] = new int[5];
        int tam[] = new int[5];
        int contmen = 0;
        int contfem = 0;
        int maior = 0, menor = 0;
        double soma = 0, media;
        Random ale = new Random();

        for (int i = 0; i < gen.length; i++) {
            gen[i] = ale.nextInt(3);
            tam[i] = ale.nextInt(85, 120);
            soma = tam[i] + tam[i];
        }
        for (int i = 0; i < 5; i++) {
            if (gen[i] == 1) {
                contfem = contfem + 1;
            } else {
                contmen = contmen + 1;
            }
            if (i == 1) {
                maior = tam[i];
                menor = tam[i];
            } else if (i != 1) {
                if (tam[i] > maior) {
                    maior = tam[i];
                } else if (tam[i] < menor) {
                    menor = tam[i];
                }
            }
        }
        media = soma / 5;
        System.out.printf("a média é %.2f", media);
        System.out.println("\no maior: " + maior);
        System.out.println("o menor: " + menor);

    }

}
