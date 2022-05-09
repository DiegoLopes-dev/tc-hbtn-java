public class LivroEdicaoOuro extends Livro{

    public LivroEdicaoOuro(String titulo, String autor, double preco) {
        super(titulo, autor, preco);
    }

    public double getPreco() {
        preco = preco + 0.10;
        return preco;
    }
}