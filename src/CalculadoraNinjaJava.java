public class CalculadoraNinjaJava {
    public static void main(String[] args) {
        CalculadoraModel model = new CalculadoraModel();
        CalculadoraView view = new CalculadoraView();

        double n1 = view.lerNumero();
        double n2 = view.lerNumero();

        String operacao = view.lerOperacao();

        double resultado = 0.0;

        if (operacao.equals("adicao")) {
            resultado = model.adicao(n1, n2);
        } else if (operacao.equals("subtracao")) {
            resultado = model.subtracao(n1, n2);
        } else if (operacao.equals("multiplicacao")) {
            resultado = model.multiplicacao(n1, n2);
        } else if (operacao.equals("divisao")) {
            resultado = model.divisao(n1, n2);
        } else {
            view.exibirMensagem("Operação inválida");
            return;
        }
        view.exibirResultado(resultado);
    }
}