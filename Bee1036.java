import java.util.Scanner;

public class Bee1036 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        double delta = Math.pow(b,2)-(4*a*c);
        double r1 = (-b+Math.sqrt(delta))/(2*a);
        double r2= (-b-Math.sqrt(delta))/(2*a);

        if (delta >0 && a != 0){
            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }
        else {
            System.out.println("Impossivel calcular");
        }
    }

}
