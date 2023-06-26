public class CalculadoraModel {
    public double adicao(double n1, double n2) {
        return n1 + n2;
    }

    public double subtracao(double n1, double n2) {
        return n1 - n2;
    }

    public double multiplicacao(double n1, double n2) {
        return n1 * n2;
    }

    public double divisao(double n1, double n2) {
        if (n2 != 0) {
            return n1 / n2;
        } else {
            System.out.println("Divisão por zero");
            return 0;
        }
    }
    public double potencia (double n1, double n2){
        return Math.pow(n1,n2);
    }
}