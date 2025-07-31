
import java.util.Random;
import java.util.Scanner;

public class Questao_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ale = new Random();
        int n;
        System.out.print("ecreva a quantidade de posições: ");
        n = in.nextInt();
        int par[] = new int[5];
        int impar[] = new int[5];
        int var1[] = new  int[5];
        int contpar = 0, contimp = 0;

        for(int i = 0; i < var1.length; i++){
            var1[i] = ale.nextInt(21);
            if(var1[i]%2 == 0 && var1[i] >=0){
                par[contpar] = var1[i];
                contpar++;
            } else{
                impar[contimp] = var1[i];
                contimp++;
            }
            
        }

    for(int i = 0; i < contpar; i++){
        System.out.println("Os pares são:");
        System.out.print(" " +par[i]+ " ");
    }
    for(int i = 0; i <contimp; i++){
        System.out.println(" " +impar[i]+ " ");                     
    }
    }

}
