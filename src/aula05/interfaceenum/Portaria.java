package aula05.interfaceenum;

import java.util.ArrayList;
import java.util.List;

public class Portaria {
    public static void main(String[] args) {
        // Polimorfismo: Ambos são "Identificaveis"
        Identificavel p1 = new Funcionario("Carlos", TipoAcesso.ADMINISTRADOR);
        Identificavel p2 = new Visitante("Ana");

        verificarEntrada(p1);
        verificarEntrada(p2);

        // 1. Criamos uma lista do tipo da INTERFACE
        // Isso permite que coloquemos qualquer objeto que "assine o contrato" Identificavel
        List<Identificavel> listaAcessos = new ArrayList<>();
        listaAcessos.add(p1);
        listaAcessos.add(p2);
        imprimirLogsAcesso(listaAcessos);
    }

    public static void verificarEntrada(Identificavel objeto) {
        System.out.println("Processando: " + objeto.getIdentificacao());

        // Uso do INSTANCEOF para descobrir quem é quem
        if (objeto instanceof Funcionario) {
            System.out.println(">> Liberando acesso ao refeitório interno.");
        }

        if (objeto instanceof Visitante) {
            System.out.println(">> Solicitando que o visitante assine o livro de visitas.");
        }
    }

    public static void imprimirLogsAcesso(List<Identificavel> acessos) {
        System.out.println("\n### LOGS DE ACESSO ###");
        for (Identificavel acesso : acessos) {
            System.out.println(acesso.getIdentificacao());
        }
    }
}