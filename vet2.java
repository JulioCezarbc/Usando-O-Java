import java.util.Scanner;

public class vet2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double [] notas = new double[4];
        double med=0;
        for (int i = 0; i < notas.length; i++){
            System.out.println("Informe a " + (i+1) + "º nota");
            notas[i] = entrada.nextDouble();
            med += notas[i];
        }
        med /= 4;
        System.out.println("A media das notas é " + med);

    }
}
