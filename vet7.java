import java.util.Scanner;

public class vet7 {
    public static int buscaValor(int[] vetor, int alvo) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == alvo) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = {1,2,3,4};

        int alvo = entrada.nextInt();
        int indice = buscaValor(vetor, alvo);

        if (indice != -1) {
            System.out.println("Valor encontrado no índice: " + indice);
        } else {
            System.out.println("Valor não encontrado");

        }
    }
}
