public class Eletronico {

    private String descricao;
    private double valor;

    public Eletronico() {
    }

    public Eletronico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

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

    @Override
    public String toString() {
        return "[" + getDescricao() + "] R$ " + String.format(java.util.Locale.GERMANY,"%f", getValor());
    }
}
