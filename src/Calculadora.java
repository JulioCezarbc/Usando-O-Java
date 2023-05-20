public class Calculadora {
    double   n1;
    double   n2;

    public double adicao (){
        return n1 + n2;

    }
    public double subtracao(){
        return n1 - n2;

    }
    public double multiplicacao(){
        return n1 * n2;

    }
    public double divisao(){
        if (n2 != 0){
            return n1 / n2;
        }
        else {
            System.out.println("Erro");
            return 0;
        }
    }

}
