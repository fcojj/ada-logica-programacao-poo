package aula2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Exemplos de comparação e cálculos com datas usando java.time.
 * Foco em: antes/depois/igual, diferença em dias/meses/anos,
 * e comparação entre instantes com Duration.
 */
public class ComparacoesCalculosComDatas {

    public static void main(String[] args) {

        // --- Datas para comparação ---
        LocalDate hoje = LocalDate.now();
        LocalDate independencia = LocalDate.of(1822, 9, 7);
        LocalDate natal = LocalDate.of(2024, 12, 25);

        // --- Comparações simples ---
        boolean depois = natal.isAfter(hoje);     // true se natal é depois de hoje
        boolean antes = independencia.isBefore(hoje); // true se independência é antes de hoje
        boolean igual = hoje.isEqual(LocalDate.now()); // compara valores, não instâncias

        System.out.println("Natal é depois de hoje? " + depois);
        System.out.println("Independência é antes de hoje? " + antes);
        System.out.println("Hoje é igual a hoje? " + igual);

        // --- Diferença formal entre datas (Period) ---
        Period ateNatal = Period.between(hoje, natal);
        System.out.println("Faltam " + ateNatal.getMonths() + " meses e "
                                   + ateNatal.getDays() + " dias para o Natal.");

        // --- Diferença usando ChronoUnit (resultado direto em unidades específicas) ---
        long diasAteNatal = ChronoUnit.DAYS.between(hoje, natal);
        long mesesAteNatal = ChronoUnit.MONTHS.between(hoje, natal);
        long anosIndependencia = ChronoUnit.YEARS.between(independencia, hoje);

        System.out.println("Dias até o Natal: " + diasAteNatal);
        System.out.println("Meses até o Natal (aprox): " + mesesAteNatal);
        System.out.println("Anos desde Independência: " + anosIndependencia);

        // --- Comparação com horas usando Duration ---
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime daquiUmaHora = agora.plusHours(1);

        Duration dur = Duration.between(agora, daquiUmaHora);
        System.out.println("Diferença em minutos: " + dur.toMinutes());
        System.out.println("Diferença em segundos: " + dur.toSeconds());

        // --- Cálculos com datas ---
        LocalDate daquiUmaSemana = hoje.plusWeeks(1);
        LocalDate tresMesesAtras = hoje.minusMonths(3);

        System.out.println("Daqui uma semana: " + daquiUmaSemana);
        System.out.println("Três meses atrás: " + tresMesesAtras);
    }
}