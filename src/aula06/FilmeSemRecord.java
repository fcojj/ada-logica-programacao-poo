package aula06;

import java.util.Objects;

public class FilmeSemRecord {

    private final String titulo;
    private final int anoLancamento;

    /**
     * Construtor principal com validação.
     *
     * @param titulo        título do filme (não pode ser nulo/vazio)
     * @param anoLancamento ano de lançamento (>= 1888)
     */
    public FilmeSemRecord(String titulo, int anoLancamento) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("O título do filme não pode ser nulo ou vazio.");
        }
        if (anoLancamento < 1888) { // O primeiro filme foi lançado em 1888
            throw new IllegalArgumentException("O ano de lançamento do filme deve ser 1888 ou posterior.");
        }
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }

    /**
     * Construtor adicional que define um ano padrão (1888).
     *
     * @param titulo título do filme
     */
    public FilmeSemRecord(String titulo) {
        this(titulo, 1888);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    /**
     * Método de utilidade equivalente ao que você tinha no record.
     */
    public void exibirInformacoes() {
        System.out.println(titulo + " (" + anoLancamento + ")");
    }

    /**
     * toString semelhante ao gerado por record.
     */
    @Override
    public String toString() {
        return "Filme[titulo=" + titulo + ", anoLancamento=" + anoLancamento + "]";
    }

    /**
     * equals/hashCode baseados em ambos os campos (como seria no record).
     */
    @Override
    public boolean equals(Object o) {
        // 1) Verifica se é a MESMA referência na memória.
        //    Caso seja, não precisa comparar campos: já é igual.
        if (this == o) return true;

        // 2) Verifica se o objeto é do tipo correto.
        if (!(o instanceof FilmeSemRecord)) return false;
        FilmeSemRecord filmeSemRecord = (FilmeSemRecord) o;

        // 3) Compara os campos relevantes para determinar igualdade.
        return anoLancamento == filmeSemRecord.anoLancamento &&
                Objects.equals(titulo, filmeSemRecord.titulo);
    }

    @Override
    public int hashCode() {
        // Gera um hash code baseado nos campos relevantes, garantindo que objetos iguais tenham
        // o mesmo hash code.
        return Objects.hash(titulo, anoLancamento);
    }
}