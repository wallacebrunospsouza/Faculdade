import java.util.Scanner;

public class Questao_15{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String nome[] = new String[3];
        int CONTAS[] = new int[3];

        for (int i = 0; i < CONTAS.length; i++) {
            do{
                System.out.print("\nCadastre seu nome: ");
                nome[i] = in.next();
            System.out.print("\nCadastre o código da conta: ");
            CONTAS[i] = in.nextInt();
            if(CONTAS[i] < 0){
                System.out.println("Código inválido!!");
            }
            }while(CONTAS[i] < 0);
        }

        System.out.println("=============");
        System.out.println("\tMenu");
        System.out.println("=============");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar Saldo");
        System.out.println("4 - Tchau brigado!");
        System.out.println("=============");
        System.out.println("Digite a opção desejada: ");
    }
}