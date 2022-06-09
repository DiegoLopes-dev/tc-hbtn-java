import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {

        List<Produto> list = new ArrayList<Produto>(pedido.getProdutos());

        List<Produto> filtrar = list.stream().filter(p -> p.getCategoria().equals(CategoriaProduto.LIVRO)).collect(Collectors.toList());

        return filtrar;
    }
}
