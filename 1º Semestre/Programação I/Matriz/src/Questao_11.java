import java.util.Scanner;

public class Questao_11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] estoque = new double[5][3];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                estoque[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < 4; i++) {
            double totalItens = 0;
            for (int j = 0; j < 3; j++) {
                totalItens += estoque[i][j];
            }
            System.out.println("Armazém " + (i + 1) + " - Total de itens: " + totalItens);
        }

        int maiorProduto2 = 0;
        for (int i = 1; i < 4; i++) {
            if (estoque[i][1] > estoque[maiorProduto2][1]) {
                maiorProduto2 = i;
            }
        }
        System.out.println("Armazém com maior estoque do produto 2: " + (maiorProduto2 + 1));

        int menorEstoque = 0;
        double menorTotal = 0;
        for (int j = 0; j < 3; j++) {
            menorTotal += estoque[0][j];
        }
        for (int i = 1; i < 4; i++) {
            double total = 0;
            for (int j = 0; j < 3; j++) {
                total += estoque[i][j];
            }
            if (total < menorTotal) {
                menorTotal = total;
                menorEstoque = i;
            }
        }
        System.out.println("Armazém com menor estoque: " + (menorEstoque + 1));

        int maiorCusto = 0;
        double maiorValor = 0;
        for (int i = 0; i < 4; i++) {
            double custoTotal = 0;
            for (int j = 0; j < 3; j++) {
                custoTotal += estoque[i][j] * estoque[4][j];
            }
            if (custoTotal > maiorValor) {
                maiorValor = custoTotal;
                maiorCusto = i;
            }
        }
        System.out.println("Armazém com maior custo de estocagem: " + (maiorCusto + 1));
    }
}
