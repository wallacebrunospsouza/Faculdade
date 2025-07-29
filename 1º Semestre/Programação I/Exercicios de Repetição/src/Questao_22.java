public class Questao_22 {
    public static void main(String[] args){
        double s = 0, num=1, den=1, termo, mult=1;

        for(int i = 1; i <=51; i++){
            termo = num/Math.pow(den, 3);
            if(i%2 != 0){
                s += termo;
            } else{
                s -= termo;
            }
            den += 2;
        }
        double PI = Math.cbrt(s * 32);
        System.out.printf("O valor de PI é %.4f.\n", PI);
    }
}
