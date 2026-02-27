package aula05.exercicio;

public class ConsultorExterno implements Pagavel {
    private String nome;
    private String empresa;
    private double valorHora;
    private int horasTrabalhadas;

    public ConsultorExterno(String nome, String empresa, double valorHora, int horasTrabalhadas) {
        this.nome = nome;
        this.empresa = empresa;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularPagamento() {
        return this.valorHora * this.horasTrabalhadas;
    }

    @Override
    public String emitirComprovante() {
        return "Nota Fiscal de Consultoria - Empresa: " + empresa +
                " | Consultor: " + nome +
                " | Total: R$ " + String.format("%.2f", calcularPagamento());
    }
}