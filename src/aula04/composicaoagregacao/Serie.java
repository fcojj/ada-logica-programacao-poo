package aula04.composicaoagregacao;


import java.util.ArrayList;
import java.util.List;

//objeto contem outro objeto, mas o ciclo de vida é independente
// composição: a série é composta por temporadas, que não existem sem a série
// um objeto faz parte de outro — se o objeto principal morre, o outro morre junto.
class Serie {
    private String nome;
    private List<Temporada> temporadas = new ArrayList<>(); // composição

    public Serie(String nome) {
        this.nome = nome;
    }

    void adicionarTemporada(int numero, int episodios) {
        temporadas.add(new Temporada(numero, episodios));
    }

    public String getNome() { return nome; }

    List<Temporada> getTemporadas() {
        return List.copyOf(temporadas);
    }
}