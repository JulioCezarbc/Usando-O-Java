import java.util.Scanner;

public class Bee1075 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        for (int i = 1; i < 10000; i++){

            if (i % n == 2){
                System.out.println(i);
            }
        }
    }
}
