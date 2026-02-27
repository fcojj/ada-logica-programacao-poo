package aula06;

public record Filme(String titulo, int anoLancamento)  {

    // O construtor compacto é usado para validar os dados de entrada
    public Filme {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("O título do filme não pode ser nulo ou vazio.");
        }
        if (anoLancamento < 1888) { // O primeiro filme foi lançado em 1888
            throw new IllegalArgumentException("O ano de lançamento do filme deve ser 1888 ou posterior.");
        }
    }

    // Construtor adicional para permitir a criação de um filme apenas com o título, usando um ano de lançamento padrão
    public Filme(String titulo) {
        this(titulo, 1888); // Define um ano de lançamento padrão
    }

    void exibirInformacoes() {
        System.out.println(titulo + " (" + anoLancamento + ")");
    }
}