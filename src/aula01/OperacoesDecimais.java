package aula01;

import java.math.BigDecimal;

public class OperacoesDecimais {

    void main() {
        // Usando Double (Perigoso)
        double saldoDouble = 1.00;
        double gastoDouble = 0.90;
        System.out.println("Saldo com Double: " + (saldoDouble - gastoDouble));
        // Saída: 0.09999999999999998 (Cadê o meu 0.10?!)

        // Usando BigDecimal (Seguro)
        BigDecimal saldoBD = new BigDecimal("1.00");
        BigDecimal gastoBD = new BigDecimal("0.90");
        BigDecimal resultado = saldoBD.subtract(gastoBD);
        System.out.println("Saldo com BigDecimal: " + resultado);
        // Saída: 0.10 (Exato!)

    }
}
/**
 * Outra forma de criar: BigDecimal.valueOf(0.1)
 * Nao user assim:new BigDecimal(0.1) -> problema de imprecisao vai acontecer:
 * */