public class ContaBancariaControlada extends ContaBancariaBasica {

    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double saldo, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
        super(numeracao, saldo, taxaJurosAnual);
    }

    public void aplicarAtualizacaoMensal(){

        if(ContaBancariaBasica.this.saldo < saldoMinimo || ContaBancariaBasica.this.saldo < 0) {
            ContaBancariaBasica.this.saldo = ContaBancariaBasica.this.saldo - valorPenalidade;
        } else {
            ContaBancariaBasica.this.saldo = ContaBancariaBasica.this.saldo - calcularTarifaMensal() + calcularJurosMensal();
        }
    }
}