import java.util.Scanner;

public class Questao_11 {
    public static void main(String []args){
        double nota1, nota2, nota3, med, soma, maior, menor;
        int aluno = 0;
        String nome, nome1, nome2;
        Scanner in = new Scanner(System.in);

        System.out.print("Escreva quantos alunos você irá calcular: ");
        aluno = in.nextInt();

        for(int i = 0; i < aluno; i ++){
        
        System.out.println("Escreva o nome: ");
        nome = in.toString();
        // ---
        System.out.println("Escreva suas notas respectivas (Nota 1, Nota 2 e Nota3): ");
        nota1 = in.nextDouble();
        nota2 = in.nextDouble();
        nota3 = in.nextDouble();
        }

        System.out.print("O aluno" +nome1+ ",tirou a maior nota que foi:" +maior+ "\nE o aluno" +nome2+ ", tirou a menor nota que foi:" +menor);

    }

}
