import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsultaProdutos {

    public static List<Produto> filtrar (List<Produto> produtos, Predicate<Produto> pred){
        return produtos.stream().filter(p -> pred.test(p)).collect(Collectors.toList());
    }
}