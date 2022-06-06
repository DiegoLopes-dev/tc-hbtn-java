package armazem;

public interface Armazenavel<T> {

    public void adicionarInventario(String nome, T valor);
    public T obterDoInventario(String nome);
}
