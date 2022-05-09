public class AutorInvalidoException extends Exception {

    public AutorInvalidoException(String message) {
    }

    public AutorInvalidoException() {
        super("Nome de autor invalido");
    }
}