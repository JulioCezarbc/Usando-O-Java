import java.util.Scanner;

public class Bee1066 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i  = 0; i<5;i++){
            int n = entrada.nextInt();
            if (n>0){
                count++;
            }
            if (n<0){
                count1++;
            }
            if (i%2 ==0){
                count2++;
            }
            if (i%2==1) {
                count3++;
            }
        }
        System.out.println(count2 + " valor(es) par(es)");
        System.out.println(count3 + " valor(es) impar(es)");
        System.out.println(count  + " valor(es) positivo(s)");
        System.out.println(count1 + " valor(es) negativo(s)");

    }
}
