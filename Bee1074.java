import java.util.Scanner;

public class Bee1074 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        for (int i = 0; i<N; i++) {
            int x = entrada.nextInt();
            if (x % 2 == 0 && x > 0){
                System.out.println("EVEN POSITIVE");
            }
            else if (x % 2 != 0 && x > 0){
                System.out.println("ODD POSITIVE");
            }
            else if (x % 2 == 0 && x < 0){
                System.out.println("EVEN NEGATIVE");
            }
            else if (x % 2 != 0 && x < 0){
                System.out.println("ODD NEGATIVE");
            }
            else {
                System.out.println("NULL");
            }
        }


    }
}
