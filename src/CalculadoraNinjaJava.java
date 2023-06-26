public class CalculadoraNinjaJava {
    public static void main(String[] args) {
        CalculadoraModel model = new CalculadoraModel();
        CalculadoraView view = new CalculadoraView();

        double n1 = view.lerNumero();
        double n2 = view.lerNumero();

        String operacao = view.lerOperacao();

        double resultado;

        switch (operacao) {
            case "adicao" -> resultado = model.adicao(n1, n2);
            case "subtracao" -> resultado = model.subtracao(n1, n2);
            case "multiplicacao" -> resultado = model.multiplicacao(n1, n2);
            case "divisao" -> resultado = model.divisao(n1, n2);
            case "potencia" -> resultado = model.potencia(n1, n2);
            default -> {
                view.exibirMensagem("Operação inválida");
                return;
            }
        }
        view.exibirResultado(resultado);
    }
}