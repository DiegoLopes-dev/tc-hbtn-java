import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class ConsultaProdutos {
    
    public static List<Produto> filtrar (List<Produto> produtos, Predicate<Produto> pred){
        return produtos.stream().filter(p -> CriterioFiltro.testar(p)).collect(Collectors.toList());
    }
}
