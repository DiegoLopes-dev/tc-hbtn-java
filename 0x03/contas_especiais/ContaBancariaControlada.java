public class ContaBancariaControlada extends ContaBancariaBasica {
    private double saldoMinimo;

    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    public void aplicarAtualizacaoMensal(){

        if(this.saldo <= saldoMinimo || this.saldo <= 0) {
            this.saldo = this.saldo - calcularTarifaMensal() + calcularJurosMensal() - valorPenalidade;
        } else {
            this.saldo = this.saldo - calcularTarifaMensal() + calcularJurosMensal();
        }
    }
}