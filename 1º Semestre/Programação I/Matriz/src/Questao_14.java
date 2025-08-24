import java.util.Scanner;

public class Questao_14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] codigos = new int[50];
        String[] nomes = new String[50];
        int[] estoqueIdeal = new int[50];
        int[] estoqueAtual = new int[50];
        int totalPlantas = 0;

        while (true) {
            System.out.println("==========================================");
            System.out.println("          FLORICULTURA MARIASFLOR         ");
            System.out.println("==========================================");
            System.out.println("1. CADASTRAR NOVA PLANTA");
            System.out.println("2. RETIRAR PLANTA");
            System.out.println("3. INSERIR PLANTA");
            System.out.println("4. IMPRIMIR RELATÓRIO");
            System.out.println("5. SAIR");
            System.out.println("==========================================");
            int opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 5)
                break;

            if (opcao == 1) {
                if (totalPlantas >= 50) {
                    System.out.println("Limite de plantas atingido");
                    continue;
                }
                System.out.print("Código: ");
                codigos[totalPlantas] = entrada.nextInt();
                entrada.nextLine();
                System.out.print("Nome: ");
                nomes[totalPlantas] = entrada.nextLine();
                System.out.print("Estoque ideal: ");
                estoqueIdeal[totalPlantas] = entrada.nextInt();
                System.out.print("Estoque atual: ");
                estoqueAtual[totalPlantas] = entrada.nextInt();
                totalPlantas++;
            } else if (opcao == 2) {
                System.out.print("Código da planta: ");
                int codigo = entrada.nextInt();
                int indice = -1;
                for (int i = 0; i < totalPlantas; i++) {
                    if (codigos[i] == codigo) {
                        indice = i;
                        break;
                    }
                }
                if (indice == -1) {
                    System.out.println("Planta não encontrada");
                    continue;
                }
                System.out.print("Quantidade a retirar: ");
                int qtd = entrada.nextInt();
                if (qtd > estoqueAtual[indice]) {
                    System.out.println("Estoque insuficiente");
                } else {
                    estoqueAtual[indice] -= qtd;
                    System.out.println("Retirada efetuada");
                }
            } else if (opcao == 3) {
                System.out.print("Código da planta: ");
                int codigo = entrada.nextInt();
                int indice = -1;
                for (int i = 0; i < totalPlantas; i++) {
                    if (codigos[i] == codigo) {
                        indice = i;
                        break;
                    }
                }
                if (indice == -1) {
                    System.out.println("Planta não encontrada");
                    continue;
                }
                System.out.print("Quantidade a inserir: ");
                int qtd = entrada.nextInt();
                estoqueAtual[indice] += qtd;
                System.out.println("Inserção efetuada");
            } else if (opcao == 4) {
                System.out.println("Plantas abaixo do estoque ideal:");
                for (int i = 0; i < totalPlantas; i++) {
                    if (estoqueAtual[i] < estoqueIdeal[i]) {
                        System.out.println(nomes[i] + " - Atual: " + estoqueAtual[i] + " - A comprar: "
                                + (estoqueIdeal[i] - estoqueAtual[i]));
                    }
                }
            }
        }
    }
}
