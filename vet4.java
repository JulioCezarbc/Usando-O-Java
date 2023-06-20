import java.util.Scanner;

public class vet4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int [] vet = new int[6];

        for (int i = 0; i < vet.length; i++){
            System.out.println("Informe um valor: ");
            vet[i] = entrada.nextInt();
        }
        for (int i = 0; i < vet.length; i++){
            if (vet[i] % 2 ==0){
                System.out.print(vet[i] + " ");
            }
        }
        System.out.print("Sao pares");
    }
}
