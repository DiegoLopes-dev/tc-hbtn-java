package inteiro_positivo;

public class InteiroPositivo {

    private String valor;
    private int i = Integer.parseInt(valor);
    private String resultado;

    public InteiroPositivo(String valor) {
        this.valor = String.valueOf(valor);
    }

    public InteiroPositivo(int i) {

    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String ehPrimo(){
        if ((i % 2) == 1) {
            String resultado;
            resultado = "Valor nao eh um valor inteiro positivo";
        }
        return resultado;
    }

}
