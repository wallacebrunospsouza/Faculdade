import java.util.Scanner;

public class Questao_12 {
    public static void main(String args[]){
        String city;
        Boolean decision;
        int num_veic, acid;
        double indice, med, razao;
        int i = 0;
        Scanner in = new Scanner(System.in);

        do{
            System.out.print("Escreva o nome da cidade: ");
            city = in.nextLine();
            System.out.print("Escreva a quantidade de veiculos na cidade: ");
            num_veic = in.nextInt();
            System.out.print("Escreva quantos acidentes de transito: ");
            acid = in.nextInt();
            indice = ((num_veic - acid)/(num_veic+acid))*100;
            System.out.printf("O indice é: %.2f\n", indice);
            System.out.println("Você deseja colocar mais uma cidade(true/false)? ");
            decision = in.nextBoolean();
            in.nextLine();
            System.out.print("\n-----------------------\n\n");
        }while(decision == true);


    }
}
