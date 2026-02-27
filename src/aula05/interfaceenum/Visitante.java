package aula05.interfaceenum;

// Classe Visitante
class Visitante implements Identificavel {
    private String nome;

    public Visitante(String nome) {
        this.nome = nome;
    }

    @Override
    public String getIdentificacao() {
        return "Etiqueta Temporária: " + nome;
    }
}