
import java.util.Random;

public class Questao_2 {
    public static void main(String[] args) {
        Random ale = new Random();
        double m[][] = new double[3][5];
        double soma[] = new double [5];
        int maior=0;

        for(int i=0; i <m.length; i++){
            for(int j=0; j<m[i].length; j++){
                m[i][j] = ale.nextInt(11);
               
            }
        }

        System.out.println("Matriz original");
        for(int i=0; i <m.length; i++){
            System.out.println(" ");
            System.out.print(i+1 +"[");
            for(int j=0; j<m[i].length; j++){
                System.out.print(m[i][j]+"  ");

            }
        }
    
        System.out.println("\n\nMatriz Somada");
        for(int i=0; i <m.length; i++){
            System.out.println(" ");
            System.out.print(i+1 +"[");
            for(int j=0; j<m[i].length; j++){
                System.out.print(m[i][j]+"  ");

            }
        }



        
    }
}
