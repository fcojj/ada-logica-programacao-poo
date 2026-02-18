package aula03;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SistemaCadastro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        int opcao = -1;

        // Marca o momento em que o programa iniciou
        LocalDateTime inicioPrograma = LocalDateTime.now();

        while (opcao != 4) {
            System.out.println("\n====== MENU ======");
            System.out.println("1 - Cadastrar nome");
            System.out.println("2 - Listar nomes");
            System.out.println("3 - Ver tempo de execução (minutos/segundos)");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // limpa quebra de linha

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome para cadastrar: ");
                        String nome = scanner.nextLine();
                        nomes.add(nome);
                        System.out.println("Nome cadastrado com sucesso!");
                        break;

                    case 2:
                        System.out.println("\n--- Lista de Nomes ---");
                        if (nomes.isEmpty()) {
                            System.out.println("Nenhum nome cadastrado.");
                        } else {
                            for (int i = 0; i < nomes.size(); i++) {
                                System.out.println(i + " - " + nomes.get(i));
                            }
                        }
                        break;

                    case 3:
                        LocalDateTime agora = LocalDateTime.now();

                        long minutos = ChronoUnit.MINUTES.between(inicioPrograma, agora);
                        long segundosTotais = ChronoUnit.SECONDS.between(inicioPrograma, agora);
                        long segundosRestantes = segundosTotais % 60;

                        System.out.println("Tempo de execução:");
                        System.out.println(minutos + " minutos e " + segundosRestantes + " segundos.");
                        break;

                    case 4:
                        System.out.println("Encerrando o programa...");
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: digite apenas números!");
                scanner.nextLine(); // limpa entrada inválida
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            } finally {
                System.out.println("Voltando ao menu...");
            }
        }

        scanner.close();
    }
}