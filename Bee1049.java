import java.util.Scanner;

public class Bee1049 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String n1 = entrada.next();
        String n2 = entrada.next();
        String n3 = entrada.next();

        if (n1.equals("vertebrado")){
            if (n2.equals("ave")){
                if (n3.equals("carnivoro")){
                    System.out.println("Aguia");
                }
                else {
                    System.out.println("pomba");
                }
            }
        }
        if (n1.equals("vertebrado")){
            if (n2.equals("mamifero")){
                if (n3.equals("onivoro")){
                    System.out.println("homem");
                }
                else {
                    System.out.println("vaca");
                }
            }
        }
        if (n1.equals("invertebrado")){
            if (n2.equals("inseto")){
                if (n3.equals("hematofago")){
                    System.out.println("pulga");
                }
                else {
                    System.out.println("lagarta");
                }
            }
        }
        if (n1.equals("invertebrado")){
            if (n2.equals("anelideo")){
                if (n3.equals("hematofago")){
                    System.out.println("sanguessuga");
                }
                else {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
