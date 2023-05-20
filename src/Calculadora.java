class Calculadora {
    double   n1;
    double   n2;

    public Calculadora(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    double adicao(){
        return n1 + n2;

    }
    double subtracao(){
        return n1 - n2;

    }
    double multiplicacao(){
        return n1 * n2;

    }
    double divisao(){
        if (n2 != 0){
            return n1 / n2;
        }
        else {
            System.out.println("Erro");
            return 0;
        }
    }

}
