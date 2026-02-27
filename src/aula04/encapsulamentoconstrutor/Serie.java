package aula04.encapsulamentoconstrutor;

class Serie {
    private String nome;
    private int temporadas;

    public Serie(String nome, int temporadas) {
        this.nome = nome;
        this.temporadas = temporadas;
    }

    public String getNome() {
        return nome;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTemporadas(int temporadas) {
        if (temporadas < 1) {
            throw new IllegalArgumentException("Uma série precisa de pelo menos 1 temporada.");
        }

        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return nome + " - " + temporadas + " temporada(s)";
    }
}