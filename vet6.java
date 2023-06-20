import java.util.Scanner;

public class vet6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] vet = new int[5];
        double [] escalar = new double[5];
        double [] rest = new double[5];

        for (int i = 0; i< vet.length; i++){
            System.out.println("Informe um valor inteiro");
            vet[i] = entrada.nextInt();
        }
        for (int i = 0; i< vet.length; i++){
            System.out.println("Informe valores para multiplicação");
            escalar[i] = entrada.nextDouble();
            rest[i] = vet[i] * escalar[i];
        }
        for (int i = 0; i<vet.length;i++){
            System.out.print(rest[i] + " ");
        }

    }
}
