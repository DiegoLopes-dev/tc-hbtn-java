package provedores;

public class Sedex implements ProvedorFrete {
    public Frete calcularFrete(double peso, double valor) {
        if(peso > 1000){
            double valorFrete;
            valorFrete = valor * 0.10;
            return new Frete(TipoProvedorFrete.SEDEX, valorFrete);
        }else{
            double valorFrete;
            valorFrete = valor * 0.05;
            return new Frete(TipoProvedorFrete.SEDEX, valorFrete);
        }
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
