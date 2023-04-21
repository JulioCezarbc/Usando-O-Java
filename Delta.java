import java.util.Scanner;

public class Delta {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float delta,a,b,c;

        System.out.println("Informe o valor a: ");
        a = entrada.nextFloat();
        System.out.println("Informe o valor b: ");
        b = entrada.nextFloat();
        System.out.println("Informe o valor c: ");
        c = entrada.nextFloat();

        delta = (b * b) - (4 * a * c);

        if (a == 0){
            System.out.println("Equação nao é de segundo grau");
        }
        else if (delta <0) {
            System.out.println("A equação nao possui raizes real");
        }
        else if (delta == 0) {
            System.out.println("A equaçãoo possui apenas uma raiz");
        }
        else if (delta >0) {
            System.out.println("A equação possui mais de duas raizes reais");
        }
        System.out.println(delta);
    }
}
