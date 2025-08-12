import java.util.Scanner;

public class Questao_15 {
    static Scanner in = new Scanner(System.in);

    public static int pesquisaEmVetor(int[] v, int num) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int contas[] = new int[3];
        double saldos[] = new double[3];
        int v[] = new int[3];
        double v1[] = new double[3];
        for (int i = 0; i < v.length; i++) {
            int pos, codConta;
            do {
                System.out.println("Digite o valor do código da conta: ");
                codConta = in.nextInt();
                pos = pesquisaEmVetor(v, codConta);
                if (pos != -1) {
                    System.out.println("Conta já existente!");
                }
            } while (pos != -1);
            v[i] = codConta;

            System.out.println("Digite o valor do saldo da conta: ");
            v1[i] = in.nextDouble();
        }

        int op, codConta, pos;
        do {
            System.out.println("=============");
            System.out.println("\tMenu");
            System.out.println("=============");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Tchau brigado!");
            System.out.println("=============");
            System.out.println("Digite a opção desejada: ");
            op = in.nextInt();
            if (op == 1) {
                System.out.println("Digite a conta a ser depositada: ");
                codConta = in.nextInt();
                pos = pesquisaEmVetor(contas, codConta);
                if (pos == -1) {
                    System.out.println("Conta inexistente!");
                } else {
                    double deposito;
                    System.out.println("Digite o valor a ser depositado: ");
                    deposito = in.nextDouble();
                    saldos[pos] += deposito;
                    System.out.println("Saldo atual: " + saldos[pos]);
                }
            } else if (op == 2) {
                System.out.println("Sacar");
            } else if (op == 3) {
                System.out.println("Consultar Saldo");
            } else if (op != 4) {
                System.out.println("Opção inválida! ");
            }
        } while (op != 4);

    }
}