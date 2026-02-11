package aula01;

public class Operadores {
    void main() {
        /*
           COMENTÁRIOS:
           //  -> Comentário de linha
           /*  -> Comentário de bloco
           /** -> JavaDoc (Documentação oficial)
        */

        // --- ARITMÉTICOS (Cálculos básicos) ---
        int soma = 10 + 5;          // 15
        int subtracao = 10 - 5;     // 5
        int multiplicacao = 10 * 5; // 50
        int divisao = 10 / 3;       // 3 (Divisão de inteiros descarta o decimal)
        int resto = 10 % 3;         // 1 (O que sobra da divisão)

        // --- RELACIONAIS (Comparações - Sempre retornam boolean) ---
        boolean ehMaior = 10 > 5;   // true
        boolean ehMenor = 10 < 5;   // false
        boolean ehIgual = 10 == 10; // true
        boolean ehDiferente = 10 != 5; // true

        // --- LÓGICOS (Combinam condições) ---
        boolean temSaldo = true;
        boolean senhaCorreta = false;

        boolean podeSacar = temSaldo && senhaCorreta; // false (E: Ambos precisam ser true)
        boolean acessoLivre = temSaldo || senhaCorreta; // true (OU: Apenas um precisa ser true)
        boolean contaBloqueada = !temSaldo;             // false (NÃO: Inverte o valor)

        // --- TERNÁRIO (if/else em uma linha) ---
        // Estrutura: (condição) ? valor_se_true : valor_se_false;
        double saldo = 100.0;
        String status = (saldo >= 0) ? "Conta Positiva" : "Conta no Cheque Especial";
        System.out.println("Status: " + status);

        // --- PRECEDÊNCIA (A ordem importa!) ---
        // Assim como na matemática, * e / vêm antes de + e -
        double resultado = 10 + 5 * 2;   // 20 (Primeiro 5*2, depois +10)
        double resultado2 = (10 + 5) * 2; // 30 (Parênteses têm a maior prioridade)

        // --- ATRIBUIÇÃO ---
        int x = 10;
        x += 5; // Mesmo que: x = x + 5 (Resultado: 15)
        x *= 2; // Mesmo que: x = x * 2 (Resultado: 30)

        System.out.println("Cálculo Final: " + x);
    }
}

