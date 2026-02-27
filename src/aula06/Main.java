package aula06;

public class Main {
    public static void main(String[] args) {

        // Exemplo 1 – criação válida com título e ano
        Filme filme1 = new Filme("O Poderoso Chefão", 1972);
        filme1.exibirInformacoes();

        // Exemplo 2 – usando o construtor que recebe só o título
        Filme filme2 = new Filme("Viagem à Lua");
        filme2.exibirInformacoes();

        // Exemplo 3 – tentando criar filme com título inválido
        try {
            Filme filmeInvalido = new Filme("   ");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar filme: " + e.getMessage());
        }

        // Exemplo 4 – tentando criar filme com ano inválido
        try {
            Filme filmeAnoInvalido = new Filme("Filme Muito Antigo", 1800);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar filme: " + e.getMessage());
        }
    }
}