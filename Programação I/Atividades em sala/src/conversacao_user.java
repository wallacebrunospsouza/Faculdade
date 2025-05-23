import java.util.Scanner;

/*Entrada: nome, peso, idade, fumante
 Processamentos: 
 Saída: nome, peso, idade, fumante
 Memoria: nome, peso, idade, fumante, teclado
 */

public class conversacao_user {
   public static void main(String []args){
     String nome;
     double peso;
     int idade;
    boolean fumante;
    Scanner teclado = new Scanner (System.in);
    
    System.out.println("Digite seu nome:");
    nome = teclado.nextLine();
    
    System.out.println("Digite seu peso:");
    peso = teclado.nextDouble();
    
    System.out.println("Digite sua idade:");
    idade = teclado.nextInt();
    
    System.out.println("Digite se você fumante ou não (True=sim ou False=não :");
    fumante = teclado.nextBoolean();
   
     //Usando Println
     System.out.println("Meu nome é" +nome+ " minha idade é " +idade+ " anos");
     System.out.println ("Peso " +peso+ " kg e tabagista " +fumante);
     
      
   }
}
