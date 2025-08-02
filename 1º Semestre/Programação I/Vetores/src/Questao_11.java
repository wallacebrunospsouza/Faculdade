import java.util.Random;

public class Questao_11 {
    public static void main(String[] args) {
        int vet[] = new int[100];
        int imp[] = new int[10];
        Random ale = new Random();
        for (int i = 0; i < vet.length; i++) {
            vet[i] = ale.nextInt(101);
        }
        for (int i = 0; i < 10; i++) {
            if (vet[i] % 2 != 0 && vet[i] % 3 != 0) {
                imp[i] = vet[i];
            }
        }
        for (int i = 0; i < imp.length; i++){
            System.out.print("[" + imp[i] + "]");
        }
    }
}
