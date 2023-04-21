import java.util.Scanner;

public class DezN {
    public static void main(String[] args) {


        int Nb = 5;
        Scanner entrada = new Scanner(System.in);
        int Vaa = 0;
        int nMenor = Vaa;
        int nMaior = Vaa;

        for (int i= 1; i<=Nb; ++i){
            System.out.println("Informe um numero: ");
            Vaa = entrada.nextInt();

            if (nMaior < Vaa){
                nMaior = Vaa;
            }
            if (nMenor> Vaa){
                nMenor = Vaa;
            }
        }
        System.out.println(nMaior +" " + nMenor);


    }
}
