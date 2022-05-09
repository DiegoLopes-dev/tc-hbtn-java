public class ContaBancariaTarifada extends ContaBancariaBasica {

    private int quantidadeTransacoes;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }
    @Override
    public void sacar(double valor)  throws Exception {
        if (valor >= 0 && this.saldo >= valor) {
            this.saldo = this.saldo - valor - 0.10;
        } else {
            throw new exceptions.OperacaoInvalidaException1("Valor de saque deve ser menor que o saldo atual");
        }
    }
    @Override
    public void depositar(double valor) throws Exception {
        if (valor > 0) {
            this.saldo = this.saldo + valor - 0.10;
        } else {
            throw new exceptions.OperacaoInvalidaException1("Valor para deposito deve ser maior que 0");
        }
    }
}