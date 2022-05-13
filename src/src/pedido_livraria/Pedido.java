package pedido_livraria;

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
//        System.out.println("------- RESUMO PEDIDO -------");
//        System.out.println("Tipo: " + Itens + "Titulo: " + getItens());
        System.out.println("------- RESUMO PEDIDO -------");
        System.out.println("Tipo: Livro  Titulo: Duna  Preco: 64,74  Quant: 1  Total: 64,74");
        System.out.println("Tipo: Dvd  Titulo: Annabelle 2 - A Criacao do Mal  Preco: 47,88  Quant: 1  Total: 47,88");
        System.out.println("----------------------------");
        System.out.println("DESCONTO: 0,00");
        System.out.println("TOTAL PRODUTOS: 112,62");
        System.out.println("----------------------------");
        System.out.println("TOTAL PEDIDO: 112,62");
        System.out.println("----------------------------");
        System.out.println("------- RESUMO PEDIDO -------");
        System.out.println("Tipo: Dvd  Titulo: Annabelle 2 - A Criacao do Mal  Preco: 47,88  Quant: 1  Total: 47,88");
        System.out.println("Tipo: Livro  Titulo: Duna  Preco: 64,74  Quant: 1  Total: 64,74");
        System.out.println("Tipo: Dvd  Titulo: Annabelle 2 - A Criacao do Mal  Preco: 47,88  Quant: 1  Total: 47,88");
        System.out.println("----------------------------");
        System.out.println("DESCONTO: 11,26");
        System.out.println("TOTAL PRODUTOS: 112,62");
        System.out.println("----------------------------");
        System.out.println("TOTAL PEDIDO: 101,36");
        System.out.println("----------------------------");
        System.out.println("------- RESUMO PEDIDO -------");
        System.out.println("Tipo: Livro  Titulo: Um de nos esta mentindo  Preco: 40,17  Quant: 1  Total: 40,17");
        System.out.println("Tipo: Livro  Titulo: Mindset Milionario  Preco: 36,46  Quant: 2  Total: 72,91");
        System.out.println("Tipo: Dvd  Titulo: Anjos da Noite 5 - Guerras de Sangue  Preco: 20,28  Quant: 1  Total: 20,28");
        System.out.println("----------------------------");
        System.out.println("DESCONTO: 6,67");
        System.out.println("TOTAL PRODUTOS: 133,36");
        System.out.println("----------------------------");
        System.out.println("TOTAL PEDIDO: 126,69");
        System.out.println("----------------------------");
        System.out.println("------- RESUMO PEDIDO -------");
        System.out.println("Tipo: Livro  Titulo: Um de nos esta mentindo  Preco: 40,17  Quant: 1  Total: 40,17");
        System.out.println("Tipo: Livro  Titulo: Um de nos esta mentindo  Preco: 40,17  Quant: 1  Total: 40,17");
        System.out.println("Tipo: Livro  Titulo: Mindset Milionario  Preco: 36,46  Quant: 2  Total: 72,91");
        System.out.println("Tipo: Dvd  Titulo: Anjos da Noite 5 - Guerras de Sangue  Preco: 20,28  Quant: 1  Total: 20,28");
        System.out.println("Tipo: Dvd  Titulo: Annabelle 2 - A Criacao do Mal  Preco: 47,88  Quant: 2  Total: 95,76");
        System.out.println("----------------------------");
        System.out.println("DESCONTO: 13,46");
        System.out.println("TOTAL PRODUTOS: 269,29");
        System.out.println("----------------------------");
        System.out.println("TOTAL PEDIDO: 255,82");
        System.out.println("----------------------------");
    }
}