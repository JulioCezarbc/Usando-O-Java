import java.util.Scanner;

public class vet3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int [] vet = new int[5];
        int maior,menor;

        for (int i =0; i < vet.length; i++){
            System.out.println("Informe um valor: ");
            vet[i] = entrada.nextInt();
        }
        maior = vet[0];
        menor = vet[0];

        for (int i = 0; i < vet.length; i++){
            if (maior < vet[i]){
                maior = vet[i];
            }
            if (menor > vet[i]){
                menor = vet[i];
            }
        }
        System.out.println("O maior valor é " + maior + " e o menor é " + menor);


    }
}
