package aula03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuTryCatch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n====== MENU PRINCIPAL ======");
            System.out.println("1 - Dizer Olá");
            System.out.println("2 - Somar dois números");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();  // Pode gerar exceção se não for número

                switch (opcao) {
                    case 1:
                        System.out.println("Olá, usuário!");
                        break;

                    case 2:
                        try {
                            System.out.print("Digite o primeiro número: ");
                            int n1 = scanner.nextInt();

                            System.out.print("Digite o segundo número: ");
                            int n2 = scanner.nextInt();

                            System.out.println("Resultado: " + (n1 + n2));
                        } catch (InputMismatchException e) {
                            System.out.println("Erro: você deve digitar apenas números!");
                            scanner.nextLine(); // limpa buffer
                        }
                        break;

                    case 0:
                        System.out.println("Encerrando o programa...");
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: você deve digitar um número!");
                scanner.nextLine(); // limpar entrada inválida
            } finally {
                System.out.println("Voltando ao menu...");
            }
        }

        scanner.close();
    }
}