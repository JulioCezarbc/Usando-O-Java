import java.util.Arrays;
import java.util.Scanner;
public class vet9 {
    public static void ordenarVetor(int[] vetor) {
        Arrays.sort(vetor);
    }
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] vet1 = new int[5];
        int[] vet2 = new int[7];

        System.out.println("Informe numeros do vetor 1");
        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = entrada.nextInt();
        }

        System.out.println("Informe numeros do vetor 2");
        for (int i = 0; i < vet2.length; i++) {
            vet2[i] = entrada.nextInt();
        }
        System.out.println("Vetores original:");
        exibirVetor(vet1);
        exibirVetor(vet2);

        ordenarVetor(vet1);
        ordenarVetor(vet2);

        System.out.println("Vetores ordenados:");
        exibirVetor(vet1);
        exibirVetor(vet2);

        System.out.println();

        int [] vet3 = new int[12];

        for (int i = 0; i < 5; i++) {
            vet3[i] = vet1[i];
        }

        int index = 5;

        for (int i = 0; i < 7; i++) {
            vet3[index] = vet2[i];
            index++;
        }
        System.out.println("Os dois vetores combinados: ");
        exibirVetor(vet3);
        System.out.println();

        System.out.println("Terceiro vetor ordenado: ");
        ordenarVetor(vet3);
        exibirVetor(vet3);
    }
    public static void exibirVetor(int[] vetor) {
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}