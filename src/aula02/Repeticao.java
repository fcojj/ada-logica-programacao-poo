package aula02;

import java.util.Arrays;
import java.util.List;

public class Repeticao {

    void main() {

        // Repetição: while
        int i = 0;
        while (i < 10) {
            System.out.println("Valor de i: " + i);
            i++;
        }

        // Repetição: do-while
        int j = 0;
        do {
            System.out.println("Valor de j: " + j);
            j++;
        } while (j < 100);

        // Repetição: for
        for (int k = 0; k < 10; k++) {
            System.out.println("Valor de k: " + k);
        }

        // Repetição: for-each
        String[] nomes = {"Alice", "Bob", "Charlie"};
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        // Repetição: stream (Java 8+) - usando lambda e operacoes com coleções
        List<String> nomesList = Arrays.asList(nomes);
        nomesList.stream().forEach(nome -> System.out.println("Nome (stream): " + nome));
    }
}