public class Transacao {
    private String descricao;
    private double valor;
    private TipoTransacao tipo;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransacao tipo) {
        this.tipo = tipo;
    }

    public enum TipoTransacao {
        RECEITA, DESPESA
    }

    public Transacao(String descricao, double valor, TipoTransacao tipo){
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    public void exibirTransacao(){
        System.out.printf("Descricao: %s\n", descricao);
        System.out.printf("Valor: %.2f\n", valor);
        System.out.printf("Tipo da Transacao: %s\n", tipo);
    }
}