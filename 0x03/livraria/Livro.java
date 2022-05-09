package exceptions;
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

    public void setTitulo(String titulo) throws Exception{
        if (titulo == "ab") {
            throw new LivroInvalidoException("Titulo de livro invalido");
        } else {
            this.titulo = titulo;
        }
    }

    public String getAutor()  {
        return autor;
    }

    public void setAutor(String autor) throws Exception {
        if (!autor.contains(" ")) {
            throw new exceptions.AutorInvalidoException();
        } else {
            this.autor = autor;
        }
    }
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws Exception {
        if (preco <= 0) {
            throw new exceptions.LivroInvalidoException("Preco de livro invalido");
        } else {
            this.preco = preco;;
        }
    }
}