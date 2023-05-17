import java.util.Scanner;

public class Bee1099 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int min, max;
        for (int i = 0; i < n; i++) {
            int soma = 0;
            int x = entrada.nextInt();
            int y = entrada.nextInt();
            if (x < y) {
                for (int j = x + 1; j < y; j++) {
                    if (j % 2 != 0) {
                        soma += j;
                    }
                }
            } else {
                for (int j = y + 1; j < x; j++) {
                    if (j % 2 != 0) {
                        soma += j;
                    }
                }
            }
            System.out.println(soma);
        }
    }
}