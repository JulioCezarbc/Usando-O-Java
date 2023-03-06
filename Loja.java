import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float Produto, Parcela;

        System.out.print("Escolha o produto (1 - Mouse, 2 - Teclado, 3 - Mousepad, 4 - Monitor, 5 - Headset): ");
        Produto=scanner.nextFloat();
            if (Produto == 1){
                Produto = 450;
            } else if (Produto == 2) {
                Produto = 275;
            } else if (Produto == 3) {
                Produto = 225;
            } else if (Produto == 4) {
                Produto = 1250;
            } else if (Produto == 5) {
                Produto = 3500;
            }
        System.out.println("Escolha o valor da parcela (0,2,3,4 ou 5 - parcelas): ");
        Parcela = scanner.nextFloat();
            if (Parcela ==2){
                Parcela = 2;
            } else if (Parcela ==3){
                Parcela = 3;
            }   else if (Parcela ==4){
                    Parcela = 4;
            }       else if (Parcela ==5){
                        Parcela =5;
            }         else if (Parcela == 0){
                                Parcela = 1;
            }
        Produto = Produto/Parcela;

        System.out.print("O valor de cada parcela é: "+ Produto);
    }
    }
