package aula04.estaticoinstancia;

public class Main {
    static void main(String[] args) {

        Filme f1 = new Filme("Matrix");
        Filme f2 = new Filme("Titanic");

        f1.titulo = "Jurassic Park"; // Modificando o título do filme f1

        System.out.println("Filme 1: " + f1.titulo); // Exibe o título do filme f1
        System.out.println("Filme 2: " + f2.titulo); // Exibe o título do filme f2
        System.out.println("Total de filmes criados: " + Filme.totalFilmes); // Exibe o total de filmes criados usando o atributo estático
    }
}