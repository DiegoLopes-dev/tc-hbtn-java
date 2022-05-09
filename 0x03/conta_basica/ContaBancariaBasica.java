import exceptions.OperacaoInvalidaException;
public class ContaBancariaBasica {

    String numeracao;
    double saldo = 0;
    double taxaJurosAnual;

    double tarifaMensal = 0;
    double taxaJurosMensal = taxaJurosAnual / 12;


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
            saldo = saldo + valor;
        } else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    public void sacar(double valor)  throws Exception {
        if (valor > 0 && saldo > valor) {
        } else {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        }
    }

    public double calcularTarifaMensal() {

        if (saldo * 0.10 > 10) {
            tarifaMensal = 10;
        } else {
            tarifaMensal = saldo * 0.10;
        }
        return 0;
    }
    public double calcularJurosMensal() {


        if (saldo > 0 ) {
            taxaJurosMensal = tarifaMensal;
        } else {
            taxaJurosAnual = 0;
        }
        return 0;
    }

    public void aplicarAtualizacaoMensal(){
        saldo = saldo - taxaJurosMensal;
        saldo = saldo + tarifaMensal;

    }
}
