import javax.swing.*;
import java.util.Scanner;

public class DolarReal {
    public static void main(String[] args) {

     Double dolar, real, cotacao;
     Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cotação do dolar : ");
        cotacao = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a quantidade de dolares: ");
        dolar = Double.parseDouble(scanner.nextLine());

        real = dolar * cotacao;
        System.out.println("Dada a conversão, voce terá " + real +"R$");

    }
}
