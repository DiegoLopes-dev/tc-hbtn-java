import exceptions.OperacaoInvalidaException;
public class ContaBancariaBasica {

    String numeracao;
    double saldo = 0;
    double taxaJurosAnual;

    double tarifaMensal = 0;

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public void depositar(double valor) throws Exception {
        if (valor > 0) {
        } else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    public void sacar(double valor)  throws Exception {
        if (valor > 0 && saldo > valor) {
        } else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    public double calcularTarifaMensal() {

        if (saldo * 0.10 < 10) {
            double tarifaMensal = 10;
        } else {
            taxaJurosAnual = saldo * 0.10;
        }
        return 0;
    }
    public double calcularJurosMensal() {

        if (saldo * 0.10 > 10) {
            taxaJurosAnual = 10;
        } else {
            taxaJurosAnual = saldo * 0.10;
        }
        return 0;
    }

    public void aplicarAtualizacaoMensal(){

    }
}
