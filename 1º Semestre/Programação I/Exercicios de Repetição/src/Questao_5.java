public class Questao_5 {
    public static void main(String[] args) {
        int num;
        double med, soma;
        for (num = 1; num < 11; num++) {
            soma = num + num;
            med = num / num + num;

            System.out.printf(" a soma é: %.2f \n", soma);
        System.out.printf(" a média é: %.2f \n", med);
        }
    }

}
