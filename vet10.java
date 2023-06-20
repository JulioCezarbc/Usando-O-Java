import java.util.Scanner;

public class vet10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a dimensão da matriz quadrada: ");
        int dimensao = entrada.nextInt();

        int[][] matriz = new int[dimensao][dimensao];

        System.out.println("Informe os elementos da matriz: ");
        for (int i = 0; i < dimensao; i++) {
            for (int j = 0; j < dimensao; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Matriz informada:");
        for (int i = 0; i < dimensao; i++) {
            for (int j = 0; j < dimensao; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        for (int i = 0; i < dimensao; i++) {
            somaDiagonalPrincipal += matriz[i][i];
            somaDiagonalSecundaria += matriz[i][dimensao - 1 - i];
        }

        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);
    }
}
