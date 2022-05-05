public class Departamento {

    public double valorMeta;
    public double valorAtingidoMeta;

    public double getvalorMeta() {
        return valorMeta;
    }

    public double getValorAtingidoMeta() {
        return valorAtingidoMeta;
    }

    public Departamento(double valorMeta, double valorAtingidoMeta) {
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = valorAtingidoMeta;
    }

    boolean alcancouMeta() {
        if (valorAtingidoMeta >= valorMeta) {
            return true;
        }

        return false;
    }
}