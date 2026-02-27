package aula05.exercicio;

public abstract class Colaborador implements Pagavel {
    protected String nome;
    protected double salarioBase;

    public Colaborador(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract String obterDescricaoCargo();
}