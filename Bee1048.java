import java.util.Scanner;

public class Bee1048 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario = entrada.nextDouble();
        double novosalario;
        if (salario >=0 && salario <= 400.00) {

            novosalario = salario + ((salario * 15) / 100);
            System.out.printf("Novo salario: %.2f%n", novosalario);
            System.out.printf("Reajuste ganho: %.2f%n", (novosalario - salario));
            System.out.println("Em percentual: 15 %");

        } else if (salario >= 400.01 && salario <= 800.00) {

            novosalario = salario + ((salario * 12) / 100);
            System.out.printf("Novo salario: %.2f%n", novosalario);
            System.out.printf("Reajuste ganho: %.2f%n", (novosalario - salario));
            System.out.println("Em percentual: 12 %");
        } else if (salario >= 800.01 && salario <= 1200.00) {

            novosalario = salario + ((salario * 10) / 100);
            System.out.printf("Novo salario: %.2f%n", novosalario);
            System.out.printf("Reajuste ganho: %.2f%n", (novosalario - salario));
            System.out.println("Em percentual: 10 %");
        } else if (salario >= 1200.01 && salario <= 2000.00) {

            novosalario = salario + ((salario * 7) / 100);
            System.out.printf("Novo salario: %.2f%n", novosalario);
            System.out.printf("Reajuste ganho: %.2f%n", (novosalario - salario));
            System.out.println("Em percentual: 7 %");
        }
        else{
                novosalario = salario + ((salario*4)/100);
                System.out.printf("Novo salario: %.2f%n", novosalario);
                System.out.printf("Reajuste ganho: %.2f%n", (novosalario - salario));
                System.out.println("Em percentual: 4 %");
        }
    }
}
