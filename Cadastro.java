import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        //Parte de registro

        Scanner scanner = new Scanner(System.in);

        String SenhaUsuario;
        String NomeUsuario;
        String NomeCadastro;
        int idade;

        System.out.println("Digite o seu nome: ");
        NomeCadastro = scanner.next();
        System.out.println("Digite a sua idade: ");
        idade = scanner.nextInt();
        System.out.println("Registre o seu nome de usuário: ");
        NomeUsuario = scanner.next();
        System.out.println("Registre a sua senha: ");
        SenhaUsuario = scanner.next();

        
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        
        System.out.println("Usuário cadastrado com sucesso!");
        //Parte do login
        String LoginNome;
        String LoginSenha;
        System.out.println("Digite o seu nome de usuário: ");
        LoginNome = scanner.next();
        System.out.println("Digite a sua senha: ");
        LoginSenha = scanner.next();

        if (LoginNome.equals(NomeUsuario) && LoginSenha.equals(SenhaUsuario) ) {
            System.out.println("Bem-vindo a sua conta.");
            System.out.println("Nome: "+NomeCadastro);
            System.out.println("Idade: "+idade);
        } else {
            System.out.println("Email ou senha errados.");
        }

        scanner.close();
    }
}
