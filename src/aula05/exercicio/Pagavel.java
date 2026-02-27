package aula05.exercicio;

public interface Pagavel {
    double calcularPagamento();

    default String emitirComprovante() {
        return "Comprovante CAIXA: Valor R$ " + String.format("%.2f", calcularPagamento());
    }
}