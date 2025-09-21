import java.util.Scanner;

public class Questao_7 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int vetor[] = new int[3];

    for(int i = 0; i < vetor.length; i++){
        System.out.println("Escreva a posição " + (i+1) + " do vetor: ");
        vetor[i] = in.nextInt();
    }

    System.out.println("A méida é:" + media(vetor));
}

public static Double media(int vetor[]){
    double media = 0, soma =0;
    for(int i = 0; i < vetor.length; i ++){
         soma += vetor[i];
    }
    media = soma/vetor.length;
    return media;

}
}
