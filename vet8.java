import java.util.Scanner;
import java.util.Arrays;
public class vet8 {
    public static void ordenarVetor(int[] vet) {
        Arrays.sort(vet);
    }
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] vet = new int[8];
        for (int i =0;i<vet.length;i++){
            vet[i]= entrada.nextInt();
        }
        System.out.println("Vetor original:");
        exibirVetor(vet);
        ordenarVetor(vet);
        System.out.println("Vetor ordenado:");
        exibirVetor(vet);
    }
    public static void exibirVetor(int[] vet) {
        for (int elemento : vet) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
