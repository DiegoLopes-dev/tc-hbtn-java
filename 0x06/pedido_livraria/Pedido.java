public class Pedido {

    private int percentualDesconto;
    private ItemPedido[] itens;

    public int getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(int percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public Pedido(int percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public  double calcularTotal() {
         double quatidade = 0;
        for (i = 0; i < itens.length; i++) {
            quatidade = quatidade + itens[i].getProduto().obterPrecoLiquido() * itens[i].getQuantidade();
        }
        quatidade = quatidade - percentualDesconto * quatidade / 100;
        return quatidade;
    }
}