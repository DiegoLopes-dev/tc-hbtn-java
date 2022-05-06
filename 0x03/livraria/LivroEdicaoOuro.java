public class LivroEdicaoOuro extends Livro{

    public LivroEdicaoOuro() {
    }

    public double getPreco() {
        Livro.this.preco = Livro.this.preco + 0.10;
        return preço;
    }
}