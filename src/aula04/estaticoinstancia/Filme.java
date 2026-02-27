package aula04.estaticoinstancia;

public class Filme {
    static int totalFilmes = 0; // Atributo estático para contar o total de filmes criados
    String titulo;

    public Filme(String titulo) {
        this.titulo = titulo;
        totalFilmes++; // Incrementa o contador toda vez que um novo filme é criado
    }

    static int getTotalFilmes() {
        return totalFilmes; // Método estático para acessar o total de filmes criados
    }
}