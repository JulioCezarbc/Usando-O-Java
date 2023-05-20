import java.util.Scanner;

public class CalculadoraNinjaJava {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

            System.out.println("Informe os valores: ");
            double n1 = entrada.nextInt();
            double n2 = entrada.nextInt();

        Calculadora calculator = new Calculadora(n1,n2);


        System.out.println("Escolha a operação: (adicao, subtracao, multiplicacao e divisao) ");
            String operacao = entrada.next();

            double resultado;

            if (operacao.equals("adicao")) {
                resultado = calculator.adicao();
                System.out.println("Resultado: " + resultado);

            } else if (operacao.equals("subtracao")) {
                resultado = calculator.subtracao();
                System.out.println("Resultado: " + resultado);

            } else if (operacao.equals("multiplicacao")) {
                resultado = calculator.multiplicacao();
                System.out.println("Resultado: " + resultado);

            } else if (operacao.equals("divisao")) {
                resultado = calculator.divisao();
                System.out.println("Resultado: " + resultado);

            } else {
                System.out.println("Operação invalida");
            }

    }
}
