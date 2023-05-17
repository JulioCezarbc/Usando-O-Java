    import java.util.Scanner;

    public class Bee1114 {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            int senha = entrada.nextInt();
            while (senha != 2002){
                System.out.println("Senha Invalida");
                senha = entrada.nextInt();
            }
            System.out.println("Acesso permitido");
        }
    }
