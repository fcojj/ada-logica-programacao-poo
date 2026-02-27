package aula04.herancapolimorfismo;

import java.util.List;

public class Main {
    static void main(String[] args) {

        Titulo t1 = new Filme("Oppenheimer", 2023, 180);
        Titulo t2 = new Serie("The Last of Us", 2023, 1);

        //Polimorfismo: o método exibirInformacoes() é chamado para ambos os objetos, mas cada um exibe informações específicas de acordo com sua classe (Filme ou Serie).
        t1.exibirInformacoes();
        t2.exibirInformacoes();

        // Criando uma lista de títulos (filmes e séries) e exibindo suas informações usando polimorfismo
        List<Titulo> titulos = List.of(t1, t2);
        for (Titulo t : titulos) {
            t.exibirInformacoes();
        }
    }
}