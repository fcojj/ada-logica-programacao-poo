package aula04.encapsulamentoconstrutor;

public class Main {

    public static void main(String[] args) {

        Serie s = new Serie("Breaking Bad", 5);
        System.out.println(s);

        s.setTemporadas(6);
        System.out.println("Numero de temporadas atualizada: " + s.getTemporadas());
    }
}