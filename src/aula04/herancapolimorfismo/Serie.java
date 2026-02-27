package aula04.herancapolimorfismo;

class Serie extends Titulo {
    int temporadas;

    public Serie(String nome, int ano, int temporadas) {
        super(nome, ano);
        this.temporadas = temporadas;
    }
    @Override
    void exibirInformacoes() {
        System.out.println("Série: " + nome + " (" + ano + ") - " + temporadas + " temporadas");
    }
}