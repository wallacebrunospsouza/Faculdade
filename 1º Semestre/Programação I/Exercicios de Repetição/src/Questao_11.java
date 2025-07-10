import java.util.Scanner;

public class Questao_11 {
    public static void main(String []args) {
        double nota1 = 0, nota2 = 0, med, soma, maior1= 0, maior2= 0, menor1, menor2;
        int aluno = 0;
        String nome, nome1, nome2;
        nome1 = "ipsum";
        nome2 = "ipsum";
        Scanner in = new Scanner(System.in);

        System.out.println("O máximo de alunos é 2");

        for (int i = 0; i < 2; i++) {

            System.out.print("Escreva o nome: ");
            nome = in.nextLine();
            in.nextLine();
            // ---
            System.out.print("\nEscreva suas notas respectivas (Nota 1, Nota 2): ");
            nota1 = in.nextDouble();
            nota2 = in.nextDouble();
            if (i == 1) {
                if (nota1 > nota2) {
                    nome1 = nome;
                    maior1 = nota1;
                    menor1 = nota2;
                } else {
                    nome1 = nome;
                    maior1 = nota2;
                    menor1 = nota1;
                }
                if (i == 2) {
                    if (nota1 > nota2) {
                        nome2 = nome;
                        maior2 = nota1;
                        menor2 = nota2;
                    } else {
                        nome2 = nome;
                        maior2 = nota2;
                        maior2 = nota1;
                    }
                }
            }
        }
        if(maior1 > maior2){
            System.out.print("O aluno: " +nome1+ ",teve a melhor nota que foi:" + maior1);
            soma = nota1 + nota2;
            med = soma/2;
            System.out.printf("\nA soma é: %.2f\nmédia é: %.2f", soma, med);
        } else{
            System.out.print("O aluno: " +nome2+ ",teve a melhor nota que foi:" + maior2);
            soma = nota1 + nota2;
            med = soma/2;
            System.out.printf("\nA soma é: %.2f\nmédia é: %.2f\n", soma, med);
        }

    }
}
