import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        double salarioFixo, totVendas, salario_final;

        System.out.print("Informe seu nome: ");
        nome = entrada.next();

        System.out.print("Informe seu salario fixo: ");
        salarioFixo = entrada.nextDouble();

        System.out.print("Informe o total de vendas efetuadas no mês: ");
        totVendas = entrada.nextDouble();

        salario_final = salarioFixo + (totVendas * 0.15);

        // Estabelecer a conexão com o banco de dados
        String url = "jdbc:mysql://localhost:3306/bank";
        String usuario = "root";
        String senha = "Redemption7.";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {
            // Criar a instrução SQL de inserção
            String sql = "INSERT INTO funcionarios (nome, salarioFixo, totVendas, salario_final) VALUES (?, ?, ?, ?)";
            PreparedStatement insercao = conexao.prepareStatement(sql);

            // Preencher os valores dos parâmetros na instrução SQL
            insercao.setString(1, nome);
            insercao.setDouble(2, salarioFixo);
            insercao.setDouble(3, totVendas);
            insercao.setDouble(4, salario_final);

            // Executar a instrução SQL de inserção
            insercao.executeUpdate();

            System.out.println("Dados inseridos com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}