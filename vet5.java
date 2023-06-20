
public class vet5 {
    public static void main(String[] args) {

        char[] vetor = {'H', 'e', 'l', 'l', 'o'};
        System.out.println("Vetor original:");
        exibirVetor(vetor);

        // Inverter o vetor
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio < fim) {
            char temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;

            inicio++;
            fim--;
        }

        System.out.println("Vetor invertido:");
        exibirVetor(vetor);
    }

    public static void exibirVetor(char[] vetor) {
        for (char elemento : vetor) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}

