package aula02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * Demonstra conversões entre java.util.Date (API legada) e java.time.
 */
public class DataHoraLegado {

    // Converte java.util.Date -> LocalDate
    public static LocalDate dateParaLocalDate(Date date) {
        return date.toInstant()
                   .atZone(ZoneId.systemDefault())
                   .toLocalDate();
    }

    // Converte java.util.Date -> LocalDateTime
    public static LocalDateTime dateParaLocalDateTime(Date date) {
        return date.toInstant()
                   .atZone(ZoneId.systemDefault())
                   .toLocalDateTime();
    }

    // Converte LocalDate -> java.util.Date
    public static Date localDateParaDate(LocalDate data) {
        return Date.from(
                data.atStartOfDay()
                    .atZone(ZoneId.systemDefault())
                    .toInstant()
        );
    }

    // Converte LocalDateTime -> java.util.Date
    public static Date localDateTimeParaDate(LocalDateTime dataHora) {
        return Date.from(
                dataHora.atZone(ZoneId.systemDefault())
                        .toInstant()
        );
    }

    public static void main(String[] args) {
        Date agoraLegacy = new Date();
        LocalDate local = dateParaLocalDate(agoraLegacy);
        LocalDateTime localDT = dateParaLocalDateTime(agoraLegacy);

        Date backToLegacy = localDateParaDate(LocalDate.now());

        System.out.println("Date -> LocalDate: " + local);
        System.out.println("Date -> LocalDateTime: " + localDT);
        System.out.println("LocalDate -> Date: " + backToLegacy);
    }
}