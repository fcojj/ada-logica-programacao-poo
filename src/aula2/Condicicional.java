package aula2;

public class Condicicional {

    static void main(String[] args) {
        int numero = 10;

        // Condicional: operador ternário
        String resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Zero";
        System.out.println("O número é: " + resultado);

        //condicional: if
        if (numero > 0) {
            System.out.println("O número é positivo.");
        }

        // Condicional: if-else
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é zero ou negativo.");
        }

        // Condicional: if-else if - else
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        // Condicional: switch-case
        int diaDaSemana = 3;
        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido.");
        }
    }
}