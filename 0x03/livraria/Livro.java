import java.io.IOException;

public class Livro {

    public String titulo;
    public String autor;
    public double preco;

    public Livro(String titulo, String autor, double preco)  throws Exception{

        setTitulo(titulo);
        setAutor(autor);
        setPreco(preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor()  {
        return autor;
    }

    public void setAutor(String autor) throws Exception {
        if (!autor.contains(" ")) {
            throw new AutorInvalidoException();
        } else {
            this.autor = autor;
        }
    }
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}