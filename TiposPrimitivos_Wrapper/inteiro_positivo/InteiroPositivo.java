public class InteiroPositivo {

    private int valor;


    public InteiroPositivo(String valor) {
        if(Integer.parseInt(String.valueOf(valor)) < 0 ){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        this.valor = Integer.parseInt(String.valueOf(valor));
    }

    public InteiroPositivo(int valor) {
        if(valor < 0 ){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if(valor < 0 ){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        this.valor = valor;
    }

    public boolean ehPrimo() {
        if(valor == 1){
            return false;
        }
        for (int j = 2; j < valor; j++) {
            if (valor % j == 0)
                return false;
        }
        return true;
    }
}
