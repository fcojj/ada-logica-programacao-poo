package aula03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EntradaFile {
    void main() {
        try {
            System.out.println("O Java está procurando em: " + System.getProperty("user.dir"));

            File arquivo = new File("transacoes.txt");
            Scanner leitor = new Scanner(arquivo);

            // Enquanto houver uma linha no arquivo...
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println("Processando: " + linha);
            }

            leitor.close(); // Importante fechar para liberar o arquivo
        } catch (FileNotFoundException e) {
            System.err.println("Erro: Arquivo não encontrado no diretório.");
        }
    }
}