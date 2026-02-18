package aula1;

public class TipoDados {

    void main(){
        //conversao implicida: menor tipo dentro de um maior
        int numInt = 12;
        long numLong = numInt;

        //conversao explicita: maior tipo dentro de um menor
        long numLong2 = 23L;
        int numInt2 = (int) numLong2;

        //outros tipos
        char letraA = 'A'; // Unicode, variando de 0 a 65.535 -> 'A'= 65
        System.out.println(letraA);
        float numDecimalPequeno = 1.33f;
        double NumDecimalGrande = 3.1415926535;
        boolean logico = true; // por padrao false
    }
}

/**
5-Tipos de dados: conversao implicita e explicita
inteiros: byte -> short -> int -> long(1L)
decimais: float(1.2f) -> double -> BigDecimal(mais preciso)
character: 'a' -> String: "Ada"
boolean: true ou false
 */