package aula08.pattern;

public class PatternMatchingAndRecordMatching {
    public static void main(String[] args) {
        analisarObjeto(new Ponto(10.5, 20.0));
        analisarObjetoComInstanceOfPatternMatching("Olá Java 21");
    }



    public static void analisarObjetoComInstanceOfPatternMatching(Object obj) {
        //faz o instanceof e o cast em um único passo, extraindo os valores diretamente para as variáveis x e y
        //Deconstruction pattern can only be applied to a record
        if (obj instanceof Ponto(double x, double y)) { // record pattern
            System.out.println("Coordenadas extraídas: X=" + x + ", Y=" + y);
        } else if (obj instanceof String s) { // pattern matching
            System.out.println("É um texto de tamanho: " + s.length());
        } else if (obj == null) {
            System.out.println("Objeto nulo detectado.");
        } else {
            System.out.println("Tipo desconhecido.");
        }
    }

    public static void analisarObjeto(Object obj) {
        //faz o instanceof e o cast em um único passo, extraindo os valores diretamente para as variáveis x e y
        switch (obj) {
            // Record Pattern: extrai x e y diretamente do objeto Ponto
            case Ponto(double x, double y) ->
                    System.out.println("Coordenadas extraídas: X=" + x + ", Y=" + y);
            //pattern matching
            case String s ->
                    System.out.println("É um texto de tamanho: " + s.length());

            case null ->
                    System.out.println("Objeto nulo detectado.");

            default ->
                    System.out.println("Tipo desconhecido.");
        }
    }

}