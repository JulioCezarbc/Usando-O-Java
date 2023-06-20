import java.util.Scanner;

public class vet1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int soma =0;
        int [] vetor = new int[5];
        for (int i =0; i < vetor.length ;i++){
            System.out.println("Informe um valor inteiro: ");
            vetor[i] = entrada.nextInt();
            soma += vetor[i];
        }
        System.out.println("A soma de todos os numeros do vetor é: " + soma);





    }
}
