import java.util.Scanner;

public class CalculadoraNinjaJava {
    public static void main(String[] args) {

        Calculadora calculator = new Calculadora();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe os valores: ");
        calculator.n1 = entrada.nextInt();
        calculator.n2 = entrada.nextInt();
        System.out.println("Escolha a operação: (adicao, subtracao, multiplicacao e divisao) ");
        String operacao = entrada.next();

        double resultado =0;

        if (operacao.equals("adicao")){
            resultado = calculator.adicao();
            System.out.println("Resultado: " + resultado);

        }
        else if (operacao.equals("subtracao")) {
            resultado = calculator.subtracao();
            System.out.println("Resultado: " + resultado);

        }
        else if (operacao.equals("multiplicacao")) {
            resultado = calculator.multiplicacao();
            System.out.println("Resultado: " + resultado);

        }
        else if (operacao.equals("divisao")) {
            resultado = calculator.divisao();
            System.out.println("Resultado: " + resultado);

        }
        else {
            System.out.println("Operação invalida");
        }
    }
}
