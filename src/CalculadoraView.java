import java.util.Scanner;
public class CalculadoraView {
    private final Scanner scanner;
    public CalculadoraView() {
        scanner = new Scanner(System.in);
    }

    public double lerNumero() {
        System.out.print("Informe um número: ");
        return scanner.nextDouble();
    }

    public String lerOperacao() {
        System.out.print("Escolha a operação (adicao, subtracao, multiplicacao, divisao, potencia): ");
        return scanner.next();
    }

    public void exibirResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}