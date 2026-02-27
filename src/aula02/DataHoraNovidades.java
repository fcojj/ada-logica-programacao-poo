package aula02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Demonstra a API nova de datas do Java (java.time).
 * Mostra instância, formatação, parse e internacionalização.
 */
public class DataHoraNovidades {

    public static void main(String[] args) {

        // --- Instâncias básicas ---
        LocalDate hoje = LocalDate.now();                // Data atual (yyyy-MM-dd)
        LocalTime horaAtual = LocalTime.now();           // Hora atual
        LocalDateTime agora = LocalDateTime.now();       // Data + hora

        LocalDate independencia = LocalDate.of(1822, 9, 7); // Instância fixa
        LocalDate halloween = LocalDate.of(2024, Month.OCTOBER, 31);

        // --- Conversão de texto -> LocalDate ---
        LocalDate olimpiadas = LocalDate.parse(
                "26/07/2024",
                DateTimeFormatter.ofPattern("dd/MM/yyyy")
        );

        LocalDate copa = LocalDate.parse("2026-06-11"); // ISO → padrão default

        // --- LocalDate -> texto ---
        String formatado = olimpiadas.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        // --- Internacionalização ---
        String diaSemanaPT = hoje.format(
                DateTimeFormatter.ofPattern("EEEE", Locale.of("pt", "BR"))
        );

        // --- Exibindo ---
        System.out.println("Hoje: " + hoje);
        System.out.println("Agora: " + agora);
        System.out.println("Independência: " + independencia);
        System.out.println("Olimpíadas (formatado): " + formatado);
        System.out.println("Dia da semana em PT-BR: " + diaSemanaPT);
        System.out.println("Halloween: " + halloween);
        System.out.println("Copa: " + copa);
    }
}