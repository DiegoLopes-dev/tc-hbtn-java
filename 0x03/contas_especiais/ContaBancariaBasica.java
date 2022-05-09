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

    @Override
    public void depositar(double valor) throws Exception {
        if (valor > 0) {
            saldo = saldo + valor;
        } else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    @Override
    public void sacar(double valor)  throws Exception {
        if (valor >= 0 && saldo >= valor) {
            saldo = saldo - valor;
        } else {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
    }

    public double calcularTarifaMensal() {

        if (saldo * 0.10 > 10) {
            tarifaMensal = 10;
        } else {
            tarifaMensal = saldo * 0.10;
        }
        return tarifaMensal;
    }
    public double calcularJurosMensal() {


        if (saldo > 0 ) {
            return saldo * taxaJurosAnual/12/100;
        } else {
            return 0;
        }
    }
    @Override
    public void aplicarAtualizacaoMensal(){
        saldo = saldo - calcularTarifaMensal() + calcularJurosMensal();
    }
}
