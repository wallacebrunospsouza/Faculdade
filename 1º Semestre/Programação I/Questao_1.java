
import java.util.Random;

public class Questao_1{
    public static void main(String[] args){
        int mat[][] = new int[2][2];
        int mult[][] = new int[2][2];
        int maior =0;
        Random ale = new Random();

        for (int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = ale.nextInt(11);
                if(i== 0 && j== 0){
                    maior = mat[i][j];
                } else if(mat[i][j] > maior){
                    maior = mat[i][j];
                }
            }
        }


        for (int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++){
                mult[i][j] = mat [i][j]*maior;
            }            
        }

        System.out.print("\n");
        System.out.println("Matrix Inicial");
        for (int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j]+ "|");
            }
            
        }

        System.out.print("\n");
        System.out.println("Matrix Multiplicada");
                for (int i = 0; i < mat.length; i++) {
                    for(int j = 0; j < mat[i].length; j++){
                        System.out.print(mult[i][j]+ "|");
                    }
                    
                }

    }
}

