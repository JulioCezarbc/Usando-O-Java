import java.util.Scanner;

public class Bee1115 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int x=0,y=0;

        while (((x = entrada.nextInt())!=0)&& ((y= entrada.nextInt())!=0)){
            if (x>0 && y >0){
                System.out.println("primeiro");
            } 
            else if (x<0 && y >0) {
                System.out.println("segundo");
            }
            else if (x<0 && y <0) {
                System.out.println("terceiro");
            }
            else if (x>0 && y<0) {
                System.out.println("quarto");
            }
        }
    }
}
