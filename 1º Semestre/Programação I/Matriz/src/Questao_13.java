import java.util.Scanner;

public class Questao_13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] poltronas = new int[2][24];

        while (true) {
            System.out.println("========================================");
            System.out.println("           MARIAS UNIDAS                ");
            System.out.println("========================================");
            System.out.println("a. Vender passagem");
            System.out.println("b. Mostrar mapa de ocupação do ônibus");
            System.out.println("c. Encerrar");
            System.out.println("========================================");
            String opcao = entrada.nextLine();

            if (opcao.equalsIgnoreCase("c")) {
                break;
            } else if (opcao.equalsIgnoreCase("a")) {
                boolean poltronaLivre = false;
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 24; j++) {
                        if (poltronas[i][j] == 0) {
                            poltronaLivre = true;
                            break;
                        }
                    }
                }
                if (!poltronaLivre) {
                    System.out.println("Ônibus lotado");
                    continue;
                }

                System.out.println("Escolha a poltrona (0-23 janela, 0-23 corredor):");
                System.out.print("Janela ou Corredor (j/c)? ");
                String tipo = entrada.nextLine();
                System.out.print("Número da poltrona: ");
                int numero = entrada.nextInt();
                entrada.nextLine();

                int linha = tipo.equalsIgnoreCase("j") ? 0 : 1;
                if (poltronas[linha][numero] == 0) {
                    poltronas[linha][numero] = 1;
                    System.out.println("Venda efetivada");
                } else {
                    System.out.println("Poltrona ocupada");
                }

            } else if (opcao.equalsIgnoreCase("b")) {
                System.out.println("Mapa de ocupação do ônibus:");
                System.out.println("Poltronas da Janela:");
                for (int i = 0; i < 24; i++) {
                    System.out.println("Janela " + i + ": " + (poltronas[0][i] == 0 ? "Livre" : "Ocupada"));
                }
                System.out.println("Poltronas do Corredor:");
                for (int i = 0; i < 24; i++) {
                    System.out.println("Corredor " + i + ": " + (poltronas[1][i] == 0 ? "Livre" : "Ocupada"));
                }
            }
        }
    }
}
