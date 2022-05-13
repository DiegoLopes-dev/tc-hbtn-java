import pedido_livraria.ItemPedido;

import java.text.DecimalFormat;

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
        for (ItemPedido item : getItens()) {
            somaTotal = somaTotal + item.getProduto().obterPrecoLiquido() * item.getQuantidade();
        }
        return somaTotal * (1 - getPercentualDesconto() / 100);
    }

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");
        double somaTotal = 0;
        for (ItemPedido item : getItens()) {
            String tipoProduto = item.getProduto().getClass().getSimpleName();
            String tituloProduto = item.getProduto().getTitulo();
            double precoLiquido = item.getProduto().obterPrecoLiquido();
            int quantidadeProduto = item.getQuantidade();
            double precoTotal = item.getProduto().obterPrecoLiquido() * item.getQuantidade();
            somaTotal = precoTotal + somaTotal;
            System.out.println("Tipo: " + tipoProduto + "  Titulo: " + tituloProduto + "  Preco: " + (String.format(java.util.Locale.GERMANY, "%.2f", precoLiquido)) + "  Quant: " + quantidadeProduto + "  Total: " + (String.format(java.util.Locale.GERMANY, "%.2f", precoTotal)));
        }
        System.out.println("----------------------------");
        System.out.println("DESCONTO: " + (String.format(java.util.Locale.GERMANY, "%.2f", somaTotal * percentualDesconto / 100)));
        System.out.println("TOTAL PRODUTOS: " + (String.format(java.util.Locale.GERMANY, "%.2f", somaTotal)));
    }
}