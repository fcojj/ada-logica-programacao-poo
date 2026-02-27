package aula04.composicaoagregacao;

import java.util.ArrayList;
import java.util.List;

//objeto contem outro objeto, mas o ciclo de vida é independente
// relacao de agregação: o catálogo tem séries, mas as séries podem existir sem o catálogo
// um objeto tem uma referência para outro — se o objeto principal morre, o outro pode continuar existindo.
class Catalogo { // agregação

    private List<Serie> series = new ArrayList<>();

    void adicionar(Serie serie) {
        series.add(serie);
    }

    void listar() {
        System.out.println("Catálogo:");
        for (Serie s : series) {
            System.out.println(" - " + s.getNome());
        }
    }
}