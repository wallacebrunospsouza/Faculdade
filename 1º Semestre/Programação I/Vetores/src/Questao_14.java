import java.util.Random;

public class Questao_14 {
    public static void main(String []args){
        Random ale = new Random();
        double amostra[] = new double[5];
        double media=0, dp=0;

        for(int i = 0; i < amostra.length; i++){
            amostra[i] = ale.nextDouble(384,396);
        }
        for(int i = 0; i < amostra.length; i++){
            media += amostra[i];
        }
        media = media/amostra.length;
        for (int i = 0; i < amostra.length; i++) {
            dp += Math.pow(amostra[i]-media, 2);
        }
        dp = Math.sqrt( dp/(amostra.length - 1) );
        System.out.println("Desvio de padrão de linha: " +dp);

        

    }

}
