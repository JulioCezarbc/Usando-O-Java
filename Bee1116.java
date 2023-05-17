import java.util.Scanner;

public class Bee1116 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();

        for (int i = 0; i<n; i++){
            double x = entrada.nextInt();
            double y = entrada.nextInt();

            if (y==0){
                System.out.println("divisao impossivel");
            }
            else {
                System.out.printf("%.1f\n", x/y);
            }
        }
    }
}
