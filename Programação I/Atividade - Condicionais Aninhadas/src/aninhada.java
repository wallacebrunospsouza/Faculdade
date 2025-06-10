import java.util.Scanner;

// User : admin e Senha: 12345

        public class aninhada{
            public static void main(String[] args){
                String user;
                int senha;
                Scanner in = new Scanner(System.in);

                System.out.println("Escreva seu user:");
                user = in.nextLine();
                System.out.println("Escrava sua senha:");
                senha = in.nextInt();

                if (user.equals("admin")){
                    if (senha == 12345){
                        System.out.println("Senha correta!!");
                        System.out.println("Bem vindo Wallace");
                        in.close();
                    } else {
                        System.out.println("Senha incorreta, reescreva a senha.");
                        in.close();
                    }
                } else {
                    System.out.println("Usuário incorreto, reescreva seu usuário.");
                    in.close();
                }
            }
        }