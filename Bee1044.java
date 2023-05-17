import java.util.Scanner;

public class Bee1044 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();

        if ((a % b==0) || (b % a == 0)){
            System.out.println("Sao multiplos");
        }else {
            System.out.println("Nao sao multiplos");
        }
    }
}
