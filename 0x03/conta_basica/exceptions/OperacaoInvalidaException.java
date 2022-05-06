public class OperacaoInvalidaException extends Exception {

    public String getMessage(){
        return "Valor para deposito deve ser maior que 0";
    }
}