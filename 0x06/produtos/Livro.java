public class Livro extends Produto {

    public int paginas;
    public String autor;
    public int edicao;

    public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao) {
        this.paginas = paginas;
        this.autor = autor;
        this.edicao = edicao;
        super(titulo, ano, pais, precoBruto);
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public abstract double obterPrecoLiquido() {
        obterPrecoLiquido = this.precoBruto + 0.15 * this.precoBruto;
        return obterPrecoLiquido;
    }
}