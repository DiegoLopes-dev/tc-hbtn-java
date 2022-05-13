public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

//    public double calcularTotal() {
//         double quatidade = 0;
//
//        for (int i = 0; i < itens.length; i++) {
//            quatidade = quatidade + itens[i].getProduto().obterPrecoLiquido() * itens[i].getQuantidade();
//        }
//        quatidade = quatidade - percentualDesconto * quatidade / 100;
//        return quatidade;
//    }

    public double calcularTotal() {
        double somaTotal = 0;
        for (ItemPedido item : getItens()){
            somaTotal = somaTotal + item.getProduto().obterPrecoLiquido() * item.getQuantidade();
        }
        return somaTotal * (1 - getPercentualDesconto()/100);
    }
    public void apresentarResumoPedido() {
        double somaTotal = 0;
        somaTotal = somaTotal + item.getProduto().obterPrecoLiquido() * item.getQuantidade();
        System.out.println("------- RESUMO PEDIDO -------");
        System.out.println("Tipo: Livro  Titulo: " + item.getProduto().titulo() + somaTotal);
    }
}