package aula05.interfaceenum;

class Funcionario implements Identificavel {
    private String nome;
    private TipoAcesso acesso; // Uso do Enum

    public Funcionario(String nome, TipoAcesso acesso) {
        this.nome = nome;
        this.acesso = acesso;
    }

    @Override
    public String getIdentificacao() {
        return "Crachá Funcional: " + nome + " | Nível: " + acesso;
    }
}