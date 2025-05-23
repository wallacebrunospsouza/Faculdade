import java.util.Scanner;

/*
 Entrada: A, B, C, AB, AC, BC, ABC, Total
 Processamento: 
    Muma = A + B + C - AB - BC + ABC
    Nenhuma = Total - Muma
Saída: Nenhuma
Unidade de memória: A, B, C, AB, AC, BC, ABC, Total, Muma, Nenhuma
 */

public class Questao_12 {
    public static void main(String[] args){
        double A, B, C, AB, AC, BC, ABC, Total, Muma, Nenhuma;
        A = 1450;
        B = 1150;
        C = 900;
        AB = 350;
        AC = 400;
        BC = 300;
        ABC = 100;
        Total = 3000;

        Muma = A + B + C - AB - AC - BC + ABC;
        Nenhuma = Total - Muma;

        System.out.printf("A quantidade de pessoas que não gostam de nenhuma das novelas: %.2f", Nenhuma);

    }

}
