package aula01;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class EntradaSaida {
    void main(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine(); // ler uma linha inteira como String, tudo que o usuario digitar ate um enter.
        System.out.println("Digite ano nascimento:");
        int anoNascimento = leitor.nextInt();//ler um numero inteiro, mas nao ler o Enter
        //leitor.nextLine(); // "Consome" o Enter que ficou sobrando
        //BigDecimal saldo = new BigDecimal(leitor.nextLine().replace(",", "."));
        leitor.close();

        int idade = 2026 - anoNascimento;
        System.out.println(nome + " sua idade é " + idade);
        //formatando a saida -> https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
        System.out.printf("%s sua idade é %d%n", nome, idade);

        //Formatando com String format.
        Locale en = Locale.of("pt", "Br");
        //numero Pi com 2 casa decimais e com virgula invez de ponto, padrao Br-pt
        String piUs = String.format(en, "%.2f", Math.PI);
        System.out.println("PI no formato brasileiro:" + piUs);

    }
}
