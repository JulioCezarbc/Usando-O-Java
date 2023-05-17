import java.util.Scanner;

public class Bee1072 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int in = 0, out =0;

        for (int i = 0; i<n;i++){
            int x = entrada.nextInt();

            if (x >= 10 && x<=20){
                in++;
            }
            else {
                out++;
            }
        }
        System.out.printf("%d in%n", in);
        System.out.printf("%d out%n", out);
    }
}
