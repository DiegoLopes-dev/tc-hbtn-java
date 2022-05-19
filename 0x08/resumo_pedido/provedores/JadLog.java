package provedores;

public class JadLog implements ProvedorFrete{

    @Override
    public Frete calcularFrete(double peso, double valor) {
        if(peso > 2000){
            double valorFrete;
            valorFrete = valor * 0.07;
            return new Frete(TipoProvedorFrete.JADLOG, valorFrete);
        }else{
            double valorFrete;
            valorFrete = valor * 0.045;
            return new Frete(TipoProvedorFrete.JADLOG, valorFrete);
        }
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
