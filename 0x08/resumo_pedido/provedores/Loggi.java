package provedores;

public class Loggi implements ProvedorFrete {

    public Frete calcularFrete(double peso, double valor) {
        if(peso > 5000){
            double valorFrete;
            valorFrete = valor * 0.12;
            return new Frete(TipoProvedorFrete.LOGGI, valorFrete);
        }else{
            double valorFrete;
            valorFrete = valor * 0.04;
            return new Frete(TipoProvedorFrete.LOGGI, valorFrete);
        }
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
