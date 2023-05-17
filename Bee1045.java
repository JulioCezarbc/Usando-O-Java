import java.util.Scanner;

public class Bee1045 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        double a2, bc, maior;

        if (b > a) {
            maior = a;
            a = b;
            b = maior;
        }
        if (c > a) {
            maior = a;
            a = c;
            c = maior;
        }
        a2 = Math.pow(a, 2);
        bc = Math.pow(b, 2) + Math.pow(c, 2);

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a2 > bc) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (a2 < bc) {
                System.out.println("TRIANGULO ACUTANGULO");
            } else {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || a == c || b == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
