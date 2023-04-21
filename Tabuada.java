import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int tab,rest;

        System.out.println("Informe um numero: ");
        tab = entrada.nextInt();

        for (int i =0; i<=10; i++){
            rest = tab*i;
            System.out.print(rest + " ");
        }
    }
}
