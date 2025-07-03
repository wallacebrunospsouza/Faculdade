import java.util.Scanner;

public class cadastro {
    public static void main(String[] args) {
        String nome, email;
        String senha;
        int idade, tamanho;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Escreva seu primeiro nome: \n");
            nome = in.nextLine();
            tamanho = nome.length();
        } while (tamanho < 2);

        do {
            System.out.print("Escreva sua idade: \n");
            idade = in.nextInt();
        } while (idade <= 0 && idade > 150);

        do {
            System.out.print("Escreva seu email: \n");
            email = in.nextLine();
        } while(email.contains("@") && email.contains(".com"));


do{
     System.out.print("Escreva uma senha que contenha um número, uma letra minuscula, maiscula e um dos caracteres especiais('#','*','-','!','@'): ");
    senha = in.nextLine();
    boolean especial = false;
    boolean maiuscula = false;
    boolean minuscula = false;
    boolean numero = false;

    if(senha.contains("#") || senha.contains("*") || senha.contains("-") || senha.contains("!") || senha.contains("@")){
        especial = true;
    }

    for(int i = 0; i < senha.length(); i++){
        char letra = senha.charAt(i);
        int num = senha.charAt(i);

        if(senha.toUpperCase(letra)){
            maiuscula = true;
                
            } else {
                maiuscula = false;
            }

            if(senha.toLowerCase(letra)){
                minuscula = true;
            } else {
                minuscula = false;
            }

            if(senha.)
            
        }
    } while();

    }

}
