
public class Main {
    public static void main (String[] args) {
        GestorFinanceiro gestor = new GestorFinanceiro();

        gestor.adicionarTransacao("Salario", 5000.0, Transacao.TipoTransacao.RECEITA);
        gestor.adicionarTransacao("Freelance", 1200.0, Transacao.TipoTransacao.RECEITA);
        gestor.adicionarTransacao("Aluguel", 1500.0, Transacao.TipoTransacao.DESPESA);
        gestor.adicionarTransacao("Supermecado", 600.0, Transacao.TipoTransacao.DESPESA);
        gestor.adicionarTransacao("Internet", 100.0, Transacao.TipoTransacao.DESPESA);

        gestor.listarTransacoes();
    }
}
