import java.util.List;
import java.util.stream.Collectors;

public class ConsultaProdutos {
    
    public static List<Produto> filtrar (List<Produto> produtos, CriterioFiltro CriterioFiltro){
        return produtos.stream().filter(p -> CriterioFiltro.testar(p)).collect(Collectors.toList());
    }
}
