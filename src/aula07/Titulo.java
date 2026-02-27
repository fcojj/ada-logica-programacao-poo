package aula07;

abstract sealed class Titulo permits Filme, Serie {
    String nome;
    int ano;

    public Titulo(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    abstract void exibirInformacoes();
}