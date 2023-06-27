import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class Aula05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Banco_1> contas = new ArrayList<>();
        Random random = new Random();


        System.out.println("Bem-vindo ao sistema de criação de contas!");

        while (true) {
            System.out.println("\nDigite o nome do usuário (ou 'sair' para encerrar):");
            String nomeUsuario = scanner.nextLine();

            if (nomeUsuario.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite a senha do usuário:");
            String senha = scanner.nextLine();

            Usuario usuario = new Usuario(nomeUsuario, senha);

            System.out.println("Digite o tipo de conta (CC - Conta Corrente, CP - Conta Poupança):");
            String tipoConta = scanner.nextLine();

            Banco_1 conta = new Banco_1(usuario);
            conta.setnumConta(generateAccountNumber(random));
            conta.setDono(usuario.getNomeUsuario());
            conta.abrirConta(tipoConta);
            contas.add(conta);

            System.out.println("Conta criada com sucesso!");
        }

        System.out.println("\nContas criadas:");

        for (Banco_1 conta : contas) {
            conta.estadoAtual();
        }

        System.out.println("\nEncerrando o programa...");
        scanner.close();
    }
    private static int generateAccountNumber(Random random){
        return 1000 + random.nextInt(9000);
    }
}
