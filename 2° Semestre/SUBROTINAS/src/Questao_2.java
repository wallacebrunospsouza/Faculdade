import java.util.Scanner;

public class Questao_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;

        System.out.println("Escreva um número: ");
        numero = in.nextInt();
        isZero(numero);
    }

    static float isZero(float num){
        if(num != 0){
            System.out.println("Relaxa pae, seu número não é nulo");
        } else{
            System.out.println("Vishe fio, é nulo");
        }
   return num;
}
}