package aula1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class PadraoDecimalBrasil {

    void main() throws ParseException {
        String valorBr = "1.250,55";

        // Define o padrão brasileiro
        Locale ptBr = new Locale("pt", "BR");
        NumberFormat nf = NumberFormat.getInstance(ptBr);

        // Converte o valor String no formato BR para String no formato Padrao
        String valorStdString = nf.parse(valorBr).toString(); // "1250.55"
        BigDecimal valor = new BigDecimal(valorStdString);

        System.out.println("Valor convertido para Java: " + valor);

        //outra solucao
        // Remove o ponto de milhar e troca a vírgula pelo ponto
        String valorLimpo = valorBr.replace(".", "").replace(",", ".");
        BigDecimal valorPadrao = new BigDecimal(valorLimpo);

        //arredondar
        BigDecimal um = new BigDecimal("1");
        BigDecimal tres = new BigDecimal("3");
        // duas casas decimais apos a virgula e se ultimo decimal passar de 5 arredonda para cima
        BigDecimal resultado = um.divide(tres, 2, RoundingMode.HALF_UP);
        System.out.println("arrendondamento:" + resultado);
    }
}