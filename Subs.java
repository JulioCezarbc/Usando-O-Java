import java.util.Scanner;

public class Subs {
    public static void main(String[] args) {

        int x;

        String y;
        Scanner entrada = new Scanner(System.in);
        

        for (int cont = 0; cont < 2; cont++) {

        System.out.println("Digite seu nome: ");
        y = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        x = entrada.nextInt();

        System.out.println(y + ", voce ja viveu " + x * 365 + " dias");

        }

    }
}
