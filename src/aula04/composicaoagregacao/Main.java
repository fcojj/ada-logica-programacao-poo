package aula04.composicaoagregacao;


public class Main {
    public static void main(String[] args) {
        Serie s = new Serie("Dark");
        s.adicionarTemporada(1, 10);
        s.adicionarTemporada(2, 8);

        Catalogo c = new Catalogo();
        c.adicionar(s);

        c.listar();
    }
}