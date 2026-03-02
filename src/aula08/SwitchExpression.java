package aula08;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class SwitchExpression {
    enum Senioridade {L1, L2, L3}

    public static void main(String[] args) {
        // Exemplo 1: Retorno direto de String
        String tipoDia = identificarTipoDia(LocalDate.now().getDayOfWeek());
        System.out.println("Hoje é: " + tipoDia);

        // Exemplo 2: Uso do 'yield' quando precisamos de lógica extra antes de retornar
        BigDecimal bonus = calcularBonus(Senioridade.L2);
        System.out.println("Bónus aplicado: " + bonus);
    }

    static String identificarTipoDia(DayOfWeek hoje) {
        return switch (hoje) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Dia Útil";
            case SATURDAY, SUNDAY -> "Fim de Semana";
        };
    }

    static BigDecimal calcularBonus(Senioridade senioridade) {
        return switch (senioridade) {
            case L1 -> BigDecimal.valueOf(1.1);
            case L2 -> {
                System.out.println("Calculando bónus especial para L2...");
                yield BigDecimal.valueOf(1.15); // 'yield' é usado em blocos { }
            }
            case L3 -> BigDecimal.valueOf(1.2);
        };
    }


}