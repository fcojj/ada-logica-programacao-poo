package aula07;

final class Filme extends Titulo {
    int duracao;

    public Filme(String nome, int ano, int duracao) {
        super(nome, ano);
        this.duracao = duracao;
    }

    @Override
    void exibirInformacoes() {
        System.out.println("Filme: " + nome + " (" + ano + ") - " + duracao + " minutos");
    }
}