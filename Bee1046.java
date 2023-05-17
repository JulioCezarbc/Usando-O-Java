import java.util.Scanner;

public class Bee1046 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int inicio = entrada.nextInt();
        int fim = entrada.nextInt();
        int duracao;

        if (inicio >= fim){
            duracao = (24+fim) - inicio;
        }
        else {
            duracao = fim - inicio;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)"  );

        entrada.close();
    }
}
