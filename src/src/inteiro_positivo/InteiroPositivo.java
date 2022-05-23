package inteiro_positivo;

public class InteiroPositivo {

    private int valor;
    private int i = Integer.parseInt(String.valueOf(valor));
    private String resultado;

    public InteiroPositivo(String valor) {
        this.valor = Integer.parseInt(String.valueOf(valor));
    }

    public InteiroPositivo(int i) {

    }

    public String getValor() {
        return String.valueOf(valor);
    }

    public void setValor(String valor) {
        this.valor = Integer.parseInt(valor);
    }

    public String ehPrimo(){
        if ((i % 2) == 1) {
            String resultado;
            resultado = "Valor nao eh um valor inteiro positivo";
        }
        return resultado;
    }

}
