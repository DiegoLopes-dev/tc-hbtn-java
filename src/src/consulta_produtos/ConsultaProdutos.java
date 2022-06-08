package consulta_produtos;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsultaProdutos {
    
    public static List<Produto> filtar (List<Produto> produtos, Predicate<Produto> ){
        return produtos.stream().filter(p -> CriterioFiltro.testar(p)).collect(Collectors.toList());
    }
}
