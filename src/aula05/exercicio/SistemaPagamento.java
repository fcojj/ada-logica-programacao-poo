package aula05.exercicio;

import java.util.ArrayList;
import java.util.List;

public class SistemaPagamento {
    public static void main(String[] args) {
        // Criando a lista de pagamentos (Polimorfismo com Interface)
        List<Pagavel> listaPagamentos = new ArrayList<>();

        // Adicionando diferentes tipos que "assinaram o contrato" Pagavel
        listaPagamentos.add(new BancarioFixo("Carlos Alberto", 6000.0, Senioridade.SENIOR));
        listaPagamentos.add(new BancarioFixo("Mariana Silva", 4000.0, Senioridade.PLENO));
        listaPagamentos.add(new ConsultorExterno("Roberto Tech", "Soluções Java S.A.", 150.0, 40));

        System.out.println("### PROCESSAMENTO DE FOLHA CAIXA 2026 ###\n");

        for (Pagavel p : listaPagamentos) {
            // Chamada polimórfica: cada objeto usa sua própria implementação
            //System.out.println(p.emitirComprovante());
            System.out.println(p.calcularPagamento());

            // Exemplo de instanceof para checagem de tipo (conforme Aula 04)
            if (p instanceof Colaborador) {
                Colaborador c = (Colaborador) p; // Cast seguro
                System.out.println("Cargo: " + c.obterDescricaoCargo());
            }

            if (p instanceof ConsultorExterno) {
                System.out.println("Aviso: Pagamento via Nota Fiscal de Terceiros.");
            }
            System.out.println("------------------------------------------------");
        }
    }
}