package aula05.exercicio;

public class BancarioFixo extends Colaborador {
    private Senioridade senioridade;

    public BancarioFixo(String nome, double salarioBase, Senioridade senioridade) {
        super(nome, salarioBase);
        this.senioridade = senioridade;
    }

    @Override
    public double calcularPagamento() {
        // Se for Senior, recebe 20% de bônus sobre o salário base
        if (this.senioridade == Senioridade.SENIOR) {
            return this.salarioBase * 1.20;
        }
        return this.salarioBase;
    }

    @Override
    public String obterDescricaoCargo() {
        return "Bancário Fixo - Nível: " + senioridade;
    }
}