package aula04.herancapolimorfismo;

abstract class Titulo {
    String nome;
    int ano;

    public Titulo(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    abstract void exibirInformacoes();
}