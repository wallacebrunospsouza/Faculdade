import java.util.Scanner;

/*
 Entrada: SoSeg
 Processamento:
    H = SoSeg / 3600
    SoSeg = SoSeg % 3600
    M = SoSeg / 60
    Seg = SoSeg % 60
Saída: H, M, Seg
    
 */

public class Questao_16 {
    public static void main(String[] args){
        Double H, SoSeg, M, Seg;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva os segundos no qual deseja converter:");
        SoSeg = in.nextDouble();

        H = SoSeg / 3600;
        SoSeg = SoSeg % 3600;
        M = SoSeg / 60;
        Seg = SoSeg % 60;

        System.out.printf("Seu tempo é %.0f : %.0f : %.0f", H, M, Seg);
        in.close();



    }

}
