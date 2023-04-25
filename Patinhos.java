import java.util.Scanner;

public class Patinhos {
    public static void main(String[] args) {

        int patinho;
        int contagem;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Diginte numero de patos");
        patinho = entrada.nextInt();

        contagem=patinho-1;

        while (contagem>=1){
            System.out.println(patinho+"patinhos foram passear Além das montanhas para brincar, A mamãe gritou: Quá, quá, quá, quáMas só"+(contagem--) +" patinhos voltaram de la");

        }
        System.out.println(patinho+"patinhos foram passear Além das montanhas, Para brincar, A mamãe gritou: Quá, quá, quá, quá Mas nenhum patinho voltou de la\"");
        System.out.println("A mamãe patinha foi procurar , Além das montanhas, Na beira do mar, A mamãe gritou: Quá, quá, quá, quá e os " +patinho+ " patinhos voltaram de lá");

    }

}
