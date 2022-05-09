public class ContaBancariaTarifada extends ContaBancariaBasica {

    private int quantidadeTransacoes;

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    public void sacar(double valor)  throws Exception {
        if (valor >= 0 && ContaBancariaBasica.this.saldo >= valor) {
            ContaBancariaBasica.this.saldo = ContaBancariaBasica.this.saldo - valor - 0.10;
        } else {
            throw new exceptions.OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
    }

    public void depositar(double valor) throws Exception {
        if (valor > 0) {
            ContaBancariaBasica.this.saldo = ContaBancariaBasica.this.saldo + valor - 0.10;
        } else {
            throw new exceptions.OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }
}