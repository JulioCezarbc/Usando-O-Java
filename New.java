import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class New {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        Random generate = new Random();
        int x;
        int number, i = 1;

        while(i <= 10) {

            System.out.println("Voce tem 10 oportunidades para acertar o numero.");
            System.out.println("Escolha um numero para o sorteio: ");
                 x = scanner.nextInt();

            number = generate.nextInt(60);
                System.out.println("O numero sorteado foi: "+ number);

                 if (x == number)
                 {
                     System.out.println("Parabens, voce foi o vencedor");
                 }      else if (x != number){
                            System.out.println("Voce perdeu");
                 }
                 i = i +1;
        }
}
}
