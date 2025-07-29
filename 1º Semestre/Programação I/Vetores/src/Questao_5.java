import java.util.Scanner;

public class Questao_5 {
    public static void main(String[] args) {
        int vet1[] = new int [10];
        int num;
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < vet1.length; i++){
            System.out.println("Escreva um número do vetor 1 na posição " +(i+1)+ " : ");
            vet1[i] = in.nextInt();
        }
        System.out.println("Escreva um número que esteja no vet1: ");
        num = in.nextInt();

        for(int i=0; i < vet1.length; i++){
            if(num == vet1[i]){
                System.out.println("Valor " +vet1[i]+ " está na posição " +(i + 1));
            } else{
                System.out.println("Este número não está no vetor");
                break;
            }
        }

        }

    }

