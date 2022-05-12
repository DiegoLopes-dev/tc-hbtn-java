package produtos;
public class Dvd extends Produto {
    String diretor;
    String genero;
    int duracao;

    public Dvd(String titulo, int ano, String pais, double precoBruto,String diretor, String genero, int duracao) {
        this.diretor = diretor;
        this.genero = genero;
        this.duracao = duracao;
        super(titulo, ano, pais, precoBruto);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public abstract double obterPrecoLiquido() {
        obterPrecoLiquido = this.precoBruto + 0.15 * this.precoBruto;
        return obterPrecoLiquido;
    }
}