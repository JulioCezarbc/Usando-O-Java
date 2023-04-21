import java.util.Scanner;

public class Fat_2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int fatorial2;

        System.out.println("Digite o fatorial: ");
        fatorial2 = entrada.nextInt();

        for (int mult2 = fatorial2; mult2 > 1; fatorial2--) {
            mult2 = mult2 * (fatorial2 - 1);
            System.out.println(mult2);
            
        }
    }
}
