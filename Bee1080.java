import java.util.Scanner;

public class Bee1080 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nm = 0,posc = 0;
        for (int i = 1; i <=10; i++) {
            int n1 = entrada.nextInt();
                if (n1 > nm) {
                    nm = n1;
                     posc = i;
            }
                if (i == 10){
                System.out.println(nm);
                System.out.println(posc);
            }

        }

    }
}
