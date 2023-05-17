import java.util.Scanner;

public class Bee1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double media = 0;
        int count = 0;

        for (int i = 0; i<6;i++){
            double n = entrada.nextDouble();

            if (n > 0){
                count++;
                media+=n;
            }
        }
        media = media / count;
        System.out.println(count + " valores positivos");
        System.out.printf("%.1f%n", media );
    }
}
