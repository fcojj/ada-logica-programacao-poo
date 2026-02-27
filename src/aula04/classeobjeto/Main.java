package aula04.classeobjeto;

public class Main {

    static void main(String[] args) {

        Filme filme = new Filme();
        filme.titulo = "Interstellar";
        filme.anoLancamento = 2014;

        filme.exibirInformacoes();
    }
}