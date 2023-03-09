import java.util.*;
public class Prop {

    public static void main(String[] args) {

        int x, y;
        int resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um numero");
        x = Integer.parseInt((scanner.nextLine()));
        System.out.println("Escolhe outro");
        y = Integer.parseInt((scanner.nextLine()));


        resultado = x+y;
        System.out.println("Soma: " + resultado);

        resultado = x-y;
        System.out.println("Subtração: " + resultado);

        resultado = x*y;
        System.out.println("Multiplicação: " + resultado);

        resultado = x/y;
        System.out.println("Divisão: " + resultado);






    }
}
