
package aula03;

import java.io.File;
import java.math.BigDecimal;
import java.util.Scanner;

public class EntradaFileAvancado {
    void main() {
        File arquivo = new File("transacoes.txt");
        BigDecimal totalProcessado = BigDecimal.ZERO;

        try (Scanner leitor = new Scanner(arquivo)) {
            System.out.println("--- RELATÓRIO DE PROCESSAMENTO DA CAIXA ---");

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();

                // Quebra a linha onde houver ponto-e-vírgula
                String[] dados = linha.split(";");

                String operacao = dados[1];
                BigDecimal valor = new BigDecimal(dados[3]);

                // Lógica de soma simples para exemplo
                totalProcessado = totalProcessado.add(valor);

                //%-15s: alinha operacao a esquerda '-' , sempre 15 caracteres, o valor sera um string
                //%10.2f%n: sem '-' alinha a direita, sempre 10 caracteres, 2 numeros depois da virgula e uma qubra de linha
                System.out.printf("Operação: %-15s | Valor: R$ %10.2f%n", operacao, valor);
            }

            System.out.println("-------------------------------------------");
            System.out.println("Total Bruto Movimentado: R$ " + totalProcessado);

        } catch (Exception e) {
            System.err.println("Erro ao processar arquivo: " + e.getMessage());
        }
    }
}