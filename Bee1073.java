import java.util.Scanner;

public class Bee1073 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        for (int i = 1; i<= N; i++){
            if (i % 2 == 0){
                System.out.println(i + "^2 = " + (i*i));
            }
        }

    }
}
