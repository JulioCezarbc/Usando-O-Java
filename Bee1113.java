import java.util.Scanner;

public class Bee1113 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int x = entrada.nextInt();
        int y = entrada.nextInt();

        while (x != y){
             if (x > y){
                 System.out.println("Decrescente");
             }
             else {
                 System.out.println("Crescente");
             }
            x = entrada.nextInt();
            y = entrada.nextInt();
        }
    }
}
