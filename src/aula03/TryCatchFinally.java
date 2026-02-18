package aula03;

public class TryCatchFinally {

    public static void main(String[] args) {

        try {
            // Código que pode gerar erro
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            // Tratamento do erro
            System.out.println("Erro: divisão por zero não é permitida.");
        } finally {
            // Sempre executa, independente de erro
            System.out.println("Bloco finally executado!");
        }

        System.out.println("Programa continua normalmente...");
    }
}