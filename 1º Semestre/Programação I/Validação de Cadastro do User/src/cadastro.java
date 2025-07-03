import java.util.Scanner;

public class cadastro {
    public static void main(String[] args) {
        String nome, email;
        String senha;
        int idade, tamanho;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Escreva seu primeiro nome: ");
            nome = in.nextLine();
            tamanho = nome.length();
        } while (tamanho < 2);

        do {
            System.out.print("Escreva sua idade: ");
            idade = in.nextInt();
        } while (idade <= 0 && idade > 150);

        do {
            System.out.print("Escreva seu email: ");
            email = in.next();
        } while (!(email.contains("@") && email.contains(".com")));

        boolean especial, maiuscula, minuscula, numero;
        do {
            System.out.print(
                    "Escreva uma senha que contenha um número, uma letra minuscula, maiscula e um dos caracteres especiais('#','*','-','!','@'): ");
            senha = in.next();
            especial = false;
            maiuscula = false;
            minuscula = false;
            numero = false;

            if (senha.contains("#") || senha.contains("*") || senha.contains("-") || senha.contains("!")
                    || senha.contains("@")) {
                especial = true;
            }

            for (int i = 0; i < senha.length(); i++) {
                char letra = senha.charAt(i);

                if (Character.isUpperCase(letra)) {
                    maiuscula = true;
                }
                if (Character.isLowerCase(letra)) {
                    minuscula = true;
                }
                if (Character.isDigit(letra)) {
                    numero = true;
                }
            }
        } while (!(especial && maiuscula && minuscula && numero));

        System.out.println("\nCadastro realizado com sucesso!");
        System.out.println("---------------------------------");
        System.out.println("Nome  |" + nome);
        System.out.println("Idade |" + idade);
        System.out.println("Email |" + email);
        System.out.println("Senha |" + senha);

        in.close();

    }

}
